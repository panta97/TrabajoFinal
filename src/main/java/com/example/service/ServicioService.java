package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Servicio;
import com.example.repository.ServicioRepository;

@Service
public class ServicioService implements IServicioService{

	@Autowired
	private ServicioRepository servicioRepository;
	
	@Override
	public Iterable<Servicio> findAll() {
		// TODO Auto-generated method stub
		return servicioRepository.findAll();
	}

	@Override
	public void save(Servicio servicio) {
		// TODO Auto-generated method stub
		servicioRepository.save(servicio);
		
	}

	@Override
	public Servicio findOne(Long id) {
		// TODO Auto-generated method stub
		return servicioRepository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		servicioRepository.delete(id);
	}

	@Override
	public List<Servicio> findByServicioCategoria(String nameCategoria) {
		// TODO Auto-generated method stub
		return servicioRepository.findByServicioCategoria(nameCategoria);
	}

}
