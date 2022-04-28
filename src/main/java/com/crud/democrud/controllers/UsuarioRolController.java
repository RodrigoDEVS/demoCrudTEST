package com.crud.democrud.controllers;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.services.UsuarioRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

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

    //Obtener rol por id
    @GetMapping("{id}")
    public Optional<UsuarioRolModel> obtenerPorId(@PathVariable("id")Long id){
        return this.usuarioRolService.obtenerPorId(id);
    }

    //Obtener rol por nombre
    @GetMapping("/query")
    public ArrayList<UsuarioRolModel> obtenerPorNombre(@RequestParam("rol") String rol){
        return this.usuarioRolService.obtenerPorNombre(rol);
    }

    //Eliminar Rol
    @DeleteMapping("/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioRolService.eliminarRol(id);
        if(ok){
            return "Se eliminó el rol con id: " + id;
        }else{
            return "no se puso eliminar el rol con id: " + id;
        }
    }
}
