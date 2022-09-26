package com.notiplus.notiplus.models;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "noticia")
public class Noticia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private int id ;

    @Getter @Setter @Column(name = "titulo")
    private String titulo;

    @Getter @Setter @Column(name = "fecha")
    private String fecha;

    @Getter @Setter @Column(name = "descripcion")
    private String descripcion;

    @Getter @Setter @Column(name = "imagen")
    private String imagen;

    @Getter @Setter @Column(name = "categoria")
    private String categoria;
}
