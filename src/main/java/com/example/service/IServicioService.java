package com.example.service;

import java.util.List;

import com.example.entity.Servicio;

public interface IServicioService {
	public Iterable<Servicio> findAll();
	
	public void save(Servicio servicio);
	
	public Servicio findOne(Long id);
	
	public void delete(Long id);
	
	public List<Servicio> findByServicioCategoria(String nombreCategoria);
}
