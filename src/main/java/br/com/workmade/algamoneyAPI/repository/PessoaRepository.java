package br.com.workmade.algamoneyAPI.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.workmade.algamoneyAPI.model.Pessoa;;
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
