package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Servicio;

@Transactional
public interface ServicioRepository extends CrudRepository<Servicio, Long>{

}
