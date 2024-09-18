package com.CRUD.CRUDMYSQL.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.CRUD.CRUDMYSQL.entity.Formato;

public interface FormatoRepository extends JpaRepository<Formato, Long> {
    List<Formato> findByPersonaId(Long personaId);
    List<Formato> findByCitasId(Long citasId);
    List<Formato> findByDoctoresId(Long doctoresId);
}
