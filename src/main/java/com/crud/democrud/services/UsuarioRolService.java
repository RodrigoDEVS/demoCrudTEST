package com.crud.democrud.services;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

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

    //Editar Rol
    public UsuarioRolModel editarRol(UsuarioRolModel usuarioRol){
        return usuarioRolRepository.save(usuarioRol);
    }

    //Obtener rol por id
    public Optional<UsuarioRolModel> obtenerPorId(Long id){
        return usuarioRolRepository.findById(id);
    }

    //Obtener rol por nombre
    public ArrayList<UsuarioRolModel> obtenerPorNombre(String rol){
        return usuarioRolRepository.findByRol(rol);
    }

    //Eliminar Rol
    public boolean eliminarRol(Long id){
        try{
            usuarioRolRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }

    }

}
