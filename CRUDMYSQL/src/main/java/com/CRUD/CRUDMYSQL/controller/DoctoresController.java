package com.CRUD.CRUDMYSQL.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.CRUDMYSQL.entity.Doctores;
import com.CRUD.CRUDMYSQL.service.DoctoresService;

@RestController
@RequestMapping("/doctores")
public class DoctoresController {

    @Autowired
    private DoctoresService doctoresService;

    @GetMapping
    public List<Doctores> getAllDoctores() {
        return doctoresService.getAllDoctores();
    }

    @GetMapping("/{id}")
    public Optional<Doctores> getDoctores(@PathVariable Long id){
        return doctoresService.getDoctores(id);
    }

    @PostMapping
    public Doctores saveDoctores(@RequestBody Doctores doctores) {
        return doctoresService.saveDoctores(doctores);
    }
    
    
    @PutMapping("/{id}")
    public Doctores updateDoctores(@PathVariable Long id, @RequestBody Doctores doctores) {
        return doctoresService.updateDoctores(id, doctores);
    }
}
