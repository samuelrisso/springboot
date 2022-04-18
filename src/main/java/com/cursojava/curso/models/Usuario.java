package com.cursojava.curso.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

//Entity con esto le indicamos que es una entidad que va a la BD
//Table con esta anotacion le indicamos a que tabla tiene que ir en la BD
@Entity
@Table(name = "usuarios")
@ToString @EqualsAndHashCode
public class Usuario {

    //Descargando la dependencia lombok con las anotaciones
    // @Getter @Setter creamos los geters y los seters de manera mas practica
    //Debemos indicarle a que columna corresponde con la anotacion @Column y si es primary key con el @Id
    @Id
    @Getter @Setter @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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
