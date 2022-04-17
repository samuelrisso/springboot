package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    //inyeccion de dependencias
    @Autowired
    private UsuarioDao usuarioDao;

    //esta anotacion indica la direccion de url que va a ejecutar este metodo
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Samuel");
        usuario.setApellido("Risso");
        usuario.setEmail("Samuel@email.com");
        usuario.setTelefono("123123");

        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(Long id) {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "usuario123")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Samuel");
        usuario.setApellido("Risso");
        usuario.setEmail("asdsa@gmail.com");
        usuario.setTelefono("123123");

        return usuario;
    }

    @RequestMapping(value = "usuario1234")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Samuel");
        usuario.setApellido("Risso");
        usuario.setEmail("asdasd@gmail.com");
        usuario.setTelefono("123213");

        return usuario;
    }

    @RequestMapping(value = "usuario12345")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Samuel");
        usuario.setApellido("Risso");
        usuario.setEmail("asdasd@gmail.com");
        usuario.setTelefono("123213");

        return usuario;
    }
}
