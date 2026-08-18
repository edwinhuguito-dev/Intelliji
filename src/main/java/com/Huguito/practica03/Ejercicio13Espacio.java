package com.Huguito.practica03;

public class Ejercicio13Espacio {

    private String phase;

    public Ejercicio13Espacio(String phase) {
        this.phase = phase;
    }

    public String eliminar(){
        return this.phase.replace(" ", "");
    }
}
