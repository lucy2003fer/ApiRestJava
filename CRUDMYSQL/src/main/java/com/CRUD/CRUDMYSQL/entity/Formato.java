package com.CRUD.CRUDMYSQL.entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name="formato")
public class Formato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_persona")
    @JsonIgnoreProperties({"citas", "formatos"})
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name="fk_doctores")
    @JsonIgnoreProperties({"citas", "formatos"})
    private Doctores doctores;
    
    @OneToMany(mappedBy="formato", cascade=CascadeType.ALL)
    @JsonIgnoreProperties("citas")
    private List<Citas> citas;
}
