package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Cliente;

@Transactional
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
