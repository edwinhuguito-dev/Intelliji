package com.Huguito.practica02;

import java.util.Objects;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    // CONSTRUCTOR
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    // GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //FUNCIONES

    public String nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    public boolean mayorEdad() {
        return this.edad >= 18;
    }

    // TO STRING


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}