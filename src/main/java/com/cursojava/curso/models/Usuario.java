package com.cursojava.curso.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//con esto le indicamos que es una entidad que va a la BD
@Entity
//con esta anotacion le indicamos a que tabla tiene que ir en la BD
@Table(name = "usuarios")
@ToString @EqualsAndHashCode
public class Usuario {

    //Descargando la dependencia lombok con las anotaciones
    // @Getter @Setter creamos los geters y los seters de manera mas practica
    //Debemos indicarle a que columna corresponde con la anotacion @Column y si es primary key con el @Id
    @Id
    @Getter @Setter @Column(name = "id")
    private Long id;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "apellido")
    private String apellido;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "telefono")
    private String telefono;
    @Getter @Setter @Column(name = "password")
    private String password;



}
