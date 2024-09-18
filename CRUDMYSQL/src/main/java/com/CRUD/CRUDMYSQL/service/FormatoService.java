package com.CRUD.CRUDMYSQL.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUD.CRUDMYSQL.entity.Formato;
import com.CRUD.CRUDMYSQL.repository.FormatoRepository;

@Service
public class FormatoService {

    @Autowired
    private FormatoRepository formatoRepository;

    public List<Formato> getAllFormatos() {
        return formatoRepository.findAll();
    }

    public Optional<Formato> getFormatoById(Long id) {
        return formatoRepository.findById(id);
    }
        
    public Formato saveFormato(Formato formato) {
        return formatoRepository.save(formato);
    }

    public Formato updateFormato(Long id, Formato formato) {
        if (formatoRepository.existsById(id)) {
            formato.setId(id);
            return formatoRepository.save(formato);
        }
        return null; 
    }

}
