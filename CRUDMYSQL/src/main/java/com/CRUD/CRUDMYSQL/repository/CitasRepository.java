package com.CRUD.CRUDMYSQL.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD.CRUDMYSQL.entity.Citas;

public interface CitasRepository extends JpaRepository<Citas, Long> {
    List<Citas> findByPersonaId(Long personaId);
    List<Citas> findByDoctoresId(Long doctoresId);
    List<Citas> findByFormatoId(Long formatoId); 
}

