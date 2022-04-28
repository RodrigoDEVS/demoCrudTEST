package com.crud.democrud.services;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioRolService {

    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    //Obtener los Roles
    public ArrayList<UsuarioRolModel> obtenerRoles(){
        return (ArrayList<UsuarioRolModel>) usuarioRolRepository.findAll();
    }

    //Agregar un Rol
    public UsuarioRolModel guardarRol(UsuarioRolModel usuarioRol){
        return usuarioRolRepository.save(usuarioRol);
    }
}
