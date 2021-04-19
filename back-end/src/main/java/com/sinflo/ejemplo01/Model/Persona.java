package com.sinflo.ejemplo01.Model;

import lombok.Data;


import javax.persistence.*;

@Entity
@Data
@Table(name="personas")
public class Persona {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String apellidos;
}
