package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Categoria;

@Transactional
public interface CategoriaRepository extends CrudRepository<Categoria, Long>{
	
	Categoria findByNombre(String name);
	
}
