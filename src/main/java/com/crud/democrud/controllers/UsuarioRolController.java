package com.crud.democrud.controllers;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.services.UsuarioRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/roles")
public class UsuarioRolController {

    @Autowired
    UsuarioRolService usuarioRolService;

    //Obtener todos los Roles
    @GetMapping
    public ArrayList<UsuarioRolModel> obtenerRoles(){
        return usuarioRolService.obtenerRoles();
    }

    //Agregar Roles
    @PostMapping()
    public UsuarioRolModel guardarRol(@RequestBody UsuarioRolModel usuarioRol){
        return this.usuarioRolService.guardarRol(usuarioRol);
    }

    //Editar Roles
    @PostMapping("/edit")
    public UsuarioRolModel editarRol(@RequestBody UsuarioRolModel usuarioRol){
        return this.usuarioRolService.guardarRol(usuarioRol);
    }
}
