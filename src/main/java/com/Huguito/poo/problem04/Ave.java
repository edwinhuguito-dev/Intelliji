package com.Huguito.poo.problem04;

public class Ave extends Animal{

    protected double envergaduraAlas ;

    public Ave(String nombre, int edad, double envergaduraAlas) {
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }

    @Override
    void hacerSonido() {
        System.out.println("Esta ave hace CUAK CUAK CUAK");
    }
}
