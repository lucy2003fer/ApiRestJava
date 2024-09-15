package com.CRUD.CRUDMYSQL.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.CRUDMYSQL.entity.Citas;
import com.CRUD.CRUDMYSQL.service.CitasService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/citas")

public class CitasController {
		@Autowired
		private CitasService citasService;
		
		@GetMapping
		public List<Citas> getAllCitas(){
			return citasService.getAllCitas();
		}
		@GetMapping("/personas/{id}")
		public List<Citas> getCitasByPersonas(@PathVariable Long id){
			return citasService.getCitasByPersonas(id);
		}
		@GetMapping("/{id}")
		public Optional<Citas> getCitas(@PathVariable Long id){
			return citasService.getCitas(id);
		}
		
		@PostMapping
		public Citas saveCitas(@RequestBody Citas citas) {
			return citasService.saveCitas(citas);
		}
		
		@DeleteMapping("/{id}")
		public void deleteCitas(@PathVariable Long id) {
			citasService.deleteCitas(id);
		}
		
}
