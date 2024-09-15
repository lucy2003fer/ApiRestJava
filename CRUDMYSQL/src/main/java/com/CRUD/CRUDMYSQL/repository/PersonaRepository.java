package com.CRUD.CRUDMYSQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD.CRUDMYSQL.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona,Long>{

}
