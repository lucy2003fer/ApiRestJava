package com.CRUD.CRUDMYSQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD.CRUDMYSQL.entity.Doctores;

public interface DoctoresRepository extends JpaRepository<Doctores, Long> {
}