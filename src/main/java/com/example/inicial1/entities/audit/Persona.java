package com.example.inicial1.entities.audit;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="persona")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Persona extends Base {
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="dni")
    private int dni;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name="persona_libro",
            joinColumns = @JoinColumn(name="persona_id"),
            inverseJoinColumns= @JoinColumn(name="libro_id")
    )
    private List<Libro> libros= new ArrayList<Libro>();
}

