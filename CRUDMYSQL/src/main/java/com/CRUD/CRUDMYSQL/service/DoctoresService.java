package com.CRUD.CRUDMYSQL.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUD.CRUDMYSQL.entity.Doctores;
import com.CRUD.CRUDMYSQL.repository.DoctoresRepository;

@Service
public class DoctoresService {

    @Autowired
    private DoctoresRepository doctoresRepository;

    public List<Doctores> getAllDoctores() {
        return doctoresRepository.findAll();
    }

    public Optional<Doctores> getDoctores(Long id) {
        return doctoresRepository.findById(id);
    }

	public Doctores saveDoctores(Doctores doctores) {
		return doctoresRepository.save(doctores);
	}
    
	public void deleteDoctores(Long id) {
	}
	
    public Doctores updateDoctores(Long id, Doctores doctor) {
        if (doctoresRepository.existsById(id)) {
            doctor.setId(id);
            return doctoresRepository.save(doctor);
        }
        return null;
    }



}

