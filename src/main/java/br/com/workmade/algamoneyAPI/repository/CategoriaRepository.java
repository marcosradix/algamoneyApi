package br.com.workmade.algamoneyAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.workmade.algamoneyAPI.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
