package br.com.etec.pcprojeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.etec.pcprojeto.model.Pessoa;
import br.com.etec.pcprojeto.repository.pessoa.PessoaRepositoryQuery;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {
	
};

