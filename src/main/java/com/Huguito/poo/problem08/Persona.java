package com.Huguito.poo.problem08;

public abstract class Persona {
    protected String dni;
    protected String nombre;
    protected int edad;

    public Persona(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    abstract void mostrarDatosPersona();

}
