package br.com.etec.pcprojeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.com.etec.pcprojeto.model.Pessoa;
import br.com.etec.pcprojeto.repository.PessoaRepository;
import br.com.etec.pcprojeto.repository.filter.PessoaFilter;
import br.com.etec.pcprojeto.repository.pessoa.PessoaRepositoryQuery;
import br.com.etec.pcprojeto.service.exceptions.ObjectNotFoundException;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public List<Pessoa> listarPessoas() {
		return pessoaRepository.findAll();
	}
	
	public Pessoa findPessoa(Long id) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(id);
		return pessoa.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id +
				" Tipo " + Pessoa.class.getName()));
	}
	
	public Pessoa insert(Pessoa pessoa) {
		pessoa.getContatos().forEach(p -> p.setPessoa(pessoa));
		return pessoaRepository.save(pessoa);
	}
	
	public void delete(Long id) {
		findPessoa(id);
		pessoaRepository.deleteById(id);
	}
	
	public Pessoa update(Long id, Pessoa pessoa) {
		Pessoa pessoaSalva = findPessoa(id);
		
		pessoaSalva.getContatos().clear();
		pessoaSalva.getContatos().addAll(pessoa.getContatos());
		pessoaSalva.getContatos().forEach(p -> p.setPessoa(pessoaSalva));
		BeanUtils.copyProperties(pessoa, pessoaSalva, "id", "itens");
		return pessoaRepository.save(pessoa);
	}
	
	  public Page<Pessoa> pesquisar(PessoaFilter pessoaFilter, Pageable pageable) { 
		  return pessoaRepository.filtrar(pessoaFilter, pageable); 
		  }

	  @Repository
	  public interface PedidoRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {
	  	
	  };

}
