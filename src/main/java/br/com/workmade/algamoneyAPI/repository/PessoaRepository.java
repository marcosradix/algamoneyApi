package br.com.workmade.algamoneyAPI.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.workmade.algamoneyAPI.model.Pessoa;
import br.com.workmade.algamoneyAPI.repository.pessoa.PessoaRepositoryQuery;;
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery{

}
