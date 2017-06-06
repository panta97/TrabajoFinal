package com.example.service;

import com.example.entity.Categoria;

public interface ICategoriaService {
	
	public Iterable<Categoria> findAll();
	
	public void save(Categoria categoria);
	
	public Categoria findOne(Long id);
	
	public void delete(Long id);
	
	public Categoria findByNombre(String name);

}
