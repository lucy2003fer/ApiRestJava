package com.CRUD.CRUDMYSQL.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.CRUDMYSQL.entity.Formato;
import com.CRUD.CRUDMYSQL.service.FormatoService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/formato")
public class FormatoController {
    
    @Autowired
    private FormatoService formatoService;
    
    @GetMapping
    public List<Formato> getAllFormatos(){
        return formatoService.getAllFormatos();
    }

    @GetMapping("/{id}")
    public Optional<Formato> getFormatoById(@PathVariable Long id){
        return formatoService.getFormatoById(id);
    }

    @PostMapping
    public Formato saveFormato(@RequestBody Formato formato) {
        return formatoService.saveFormato(formato);
    }
    
    @PutMapping("/{id}")
    public Formato updateFormato(@PathVariable Long id, @RequestBody Formato formato) {
        return formatoService.updateFormato(id, formato);
    }

}


