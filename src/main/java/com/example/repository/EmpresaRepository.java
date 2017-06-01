package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Empresa;

@Transactional
public interface EmpresaRepository extends CrudRepository<Empresa, Long>{

}
