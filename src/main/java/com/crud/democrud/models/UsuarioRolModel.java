package com.crud.democrud.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class UsuarioRolModel {

    @Id
    @Column(name = "id_rol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    private Long idUsuario;
    private String rol;

    /*@ManyToMany(mappedBy = "roles")
    private List<UsuarioModel> users;*/


    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
