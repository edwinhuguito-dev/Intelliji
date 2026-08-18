package com.Huguito.practica03;

public class Ejercicio10Positivo {

    private int number;

    public Ejercicio10Positivo(int number) {
        this.number = number;
    }

    public String getNumber() {

        if(!(this.number >= 0)){return "El numero " + this.number + " no es positivo";}
        return  "el numero " + this.number + " es positivo";
    }
}
