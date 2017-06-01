package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Solicitud;

@Transactional
public interface SolicitudRepository extends CrudRepository<Solicitud, Long>{

}
