package com.crud.democrud.models;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class UsuarioRolModel {

    @Id
    @Column(name = "id_rol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;


    private Long idUsuario;

    private String rol;


}
