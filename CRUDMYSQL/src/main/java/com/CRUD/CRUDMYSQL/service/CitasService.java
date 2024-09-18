package com.CRUD.CRUDMYSQL.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUD.CRUDMYSQL.entity.Citas;
import com.CRUD.CRUDMYSQL.repository.CitasRepository;

@Service
public class CitasService {
    @Autowired
    private CitasRepository citasRepository;
    
    public List<Citas> getAllCitas() {
        return citasRepository.findAll();
    }
    
    public Optional<Citas> getCitas(Long id) {
        return citasRepository.findById(id);
    }
    
    public Citas saveCitas(Citas citas) {
        return citasRepository.save(citas);
    }
    
    public void deleteCitas(Long id) {
        citasRepository.deleteById(id);
    }
    
    public Citas updateCitas(Long id, Citas citas) {
        if (citasRepository.existsById(id)) {
            citas.setId(id);
            return citasRepository.save(citas);
        } else {
            return null;
        }
    }
    
    public List<Citas> getCitasByPersonas(Long id) {
        return citasRepository.findByPersonaId(id);
    }

}
