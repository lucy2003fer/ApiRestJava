package com.CRUD.CRUDMYSQL.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.CRUDMYSQL.entity.Persona;
import com.CRUD.CRUDMYSQL.service.PersonaService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/personas")
public class PersonaController {
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping
    public List<Persona> getAllPersonas(){
        return personaService.getAllPersonas();
    }

    @GetMapping("/{id}")
    public Optional<Persona> getPersona(@PathVariable Long id){
        return personaService.getPersona(id);
    }

    @PostMapping
    public Persona savePersona(@RequestBody Persona persona) {
        return personaService.savePersona(persona);
    }

    @DeleteMapping("/{id}")
    public void deletePersona(@PathVariable Long id) {
        personaService.deletePersona(id);
    }
    
    @PutMapping("/{id}")
    public Persona updatePersona(@PathVariable Long id, @RequestBody Persona persona) {
        return personaService.updatePersona(id, persona);
    }
}
