package com.Huguito.practica03;

public class Ejercicio17rando {

    private int min;
    private int max;
    private int ale;

    public Ejercicio17rando(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int ramdom(){

        ale = (int) (Math.random() * (this.max - this.min + 1));
        ale += this.min;

        return ale;
    }


}
