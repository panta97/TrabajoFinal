package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Categoria;
import com.example.repository.CategoriaRepository;

@Service
public class CategoriaService implements ICategoriaService{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public Iterable<Categoria> findAll() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

	@Override
	public void save(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriaRepository.save(categoria);
		
	}

	@Override
	public Categoria findOne(Long id) {
		// TODO Auto-generated method stub
		return categoriaRepository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categoriaRepository.delete(id);
		
	}

	@Override
	public Categoria findByNombre(String name) {
		// TODO Auto-generated method stub
		return categoriaRepository.findByNombre(name);
	}
	
	
	
	
	
	
	
}
