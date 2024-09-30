package com.example.inicial1.entities.audit;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Table(name="domicilio")
@Audited
public class Domicilio extends Base{
    @Column (name ="calle")
    private String calle;
    @Column(name= "numero")
    private int numero;

    @ManyToOne(optional = true)
    @JoinColumn(name="fk_localidad")
    private Localidad localidad;
}
