package com.Huguito.poo.problem11;

public abstract class PersonaHospital {

    protected String dni;
    protected String nombre;
    protected int edad;

    public PersonaHospital(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    abstract void mostrarFicha();
}
