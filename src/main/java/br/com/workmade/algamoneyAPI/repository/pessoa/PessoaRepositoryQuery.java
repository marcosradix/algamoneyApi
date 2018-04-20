package br.com.workmade.algamoneyAPI.repository.pessoa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.workmade.algamoneyAPI.model.Pessoa;
import br.com.workmade.algamoneyAPI.repository.filter.PessoaFilter;
import br.com.workmade.algamoneyAPI.repository.projection.ResumoPessoa;

public interface PessoaRepositoryQuery {

	public Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable);
	public Page<ResumoPessoa> resumir(PessoaFilter pessoaFilter, Pageable pageable);
}
