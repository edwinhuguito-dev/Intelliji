package com.Huguito.poo.problem10;

public abstract class MiembroPlataforma {

    protected String id;
    protected String nombre;
    protected String correo;

    public MiembroPlataforma(String id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }


    abstract void mostrarDetalles();

}
