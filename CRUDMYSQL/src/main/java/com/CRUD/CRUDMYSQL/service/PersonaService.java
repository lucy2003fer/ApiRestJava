package com.CRUD.CRUDMYSQL.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUD.CRUDMYSQL.entity.Persona;
import com.CRUD.CRUDMYSQL.repository.PersonaRepository;

@Service
public class PersonaService {
	@Autowired
	private PersonaRepository personaRepository;
	
	public List<Persona> getAllPersonas(){
		return personaRepository.findAll();
		
	}
	
	public Optional<Persona> getPersona(Long id){
		return personaRepository.findById(id);
	}
	
	public Persona savePersona(Persona persona) {
		return personaRepository.save(persona);
	}
	
	public void deletePersona(Long id) {
		personaRepository.deleteById(id);
	}
}