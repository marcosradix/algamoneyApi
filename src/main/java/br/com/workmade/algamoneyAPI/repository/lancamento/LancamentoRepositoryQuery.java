package br.com.workmade.algamoneyAPI.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.workmade.algamoneyAPI.model.Lancamento;
import br.com.workmade.algamoneyAPI.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
}
