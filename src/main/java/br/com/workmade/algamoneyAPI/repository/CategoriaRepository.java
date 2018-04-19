package br.com.workmade.algamoneyAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.workmade.algamoneyAPI.model.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
