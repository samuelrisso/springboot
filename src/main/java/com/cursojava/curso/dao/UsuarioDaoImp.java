package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//Esta anotacion hace referencia que va a tener la funcionalidad de poder acceder al repositorio de la BD
@Repository
//Esta anotacion hace referencia a la forma que va a tratar las consultas SQL como las va a armar y ejecutar (en fragmento de transaccion)
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    //el entity manager nos vas a servir para hacer la conexion con la BD
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        //esta consulta es muy parecida a SQL pero en realidad esta haciendo la consulta mediante HIBERNATE
        //va el nombre de la clase no la de la tabla
        //como se da cuenta a que tabla tiene que ir? La clase usuario es la que define a que tabla ira.
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();


    }
}
