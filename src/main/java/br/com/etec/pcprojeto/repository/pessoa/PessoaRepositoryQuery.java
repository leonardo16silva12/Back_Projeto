package br.com.etec.pcprojeto.repository.pessoa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.etec.pcprojeto.model.Pessoa;
import br.com.etec.pcprojeto.repository.filter.PessoaFilter;

public interface PessoaRepositoryQuery {
		
	public Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable);
	
}
