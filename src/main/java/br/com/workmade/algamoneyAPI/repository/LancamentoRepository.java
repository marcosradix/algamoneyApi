package br.com.workmade.algamoneyAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.workmade.algamoneyAPI.model.Lancamento;
import br.com.workmade.algamoneyAPI.repository.lancamento.LancamentoRepositoryQuery;
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
