package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario")
    public Usuario getUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Samuel");
        usuario.setApellido("Risso");
        usuario.setEmail("SamuelRisso@gmail.com");
        usuario.setTelefono("3517555114");

        return usuario;
    }
}
