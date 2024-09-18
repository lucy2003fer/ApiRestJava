package com.CRUD.CRUDMYSQL.entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="doctores")
public class Doctores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length=30, nullable=false)
    private String nombre;
    
    @Column(length=30, nullable=false)
    private String apellido;
    
    @Column(length=30, nullable=false)
    private String profesion;
    
    @OneToMany(mappedBy = "doctores", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("doctores")
    private List<Citas> citas;

    @OneToMany(mappedBy = "doctores", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("doctores")
    private List<Formato> formatos;

    
    
}