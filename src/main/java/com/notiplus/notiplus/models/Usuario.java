package com.notiplus.notiplus.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuario")

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private int id;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter @Column(name = "apellido")
    private String apellido;

    @Getter @Setter @Column(name="telefono")
    private int telefono;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "user")
    private String user;

    @Getter @Setter @Column(name = "password")
    private String password;

}
