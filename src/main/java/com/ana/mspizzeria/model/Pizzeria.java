package com.ana.mspizzeria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pizzeria")
public class Pizzeria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPizzeria;
    private String direccion;
    private String sede;

}
