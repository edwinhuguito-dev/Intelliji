package com.Huguito.practica03;

public class Ejercicio04anio {

    private int anio;

    public Ejercicio04anio(int anio) {
        this.anio = anio;
    }

    public String getAnio() {
        if (!((this.anio % 4 == 0 && this.anio != 100) || (this.anio % 400 == 0))) {
            return "El año no es bisiesto";

       }
    return"el año es bisiesto";
    }



}
