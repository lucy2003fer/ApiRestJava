package com.CRUD.CRUDMYSQL.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="citas")
public class Citas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int consultorio;
    
    @Column(columnDefinition="TEXT")
    private String observacion;
 
    
    @ManyToOne
    @JoinColumn(name="fk_persona")
    @JsonIgnoreProperties({"citas", "formato"})
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name="fk_doctores")
    @JsonIgnoreProperties({"citas", "formato"})
    private Doctores doctores;
    
    @ManyToOne
    @JoinColumn(name="fk_formato")
    @JsonIgnoreProperties({"persona", "doctores", "formato"}) 
    private Formato formato;
    
}

