package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Servicio;

@Transactional
public interface ServicioRepository extends CrudRepository<Servicio, Long>{
	
	@Query("select s from Servicio s where s.categoria.nombre like ?1% or s.nombre like ?1%")
	List<Servicio> findByServicioCategoria(String nombreCategoria);
}
