package com.Huguito.poo.problem15;

public class Arma extends Objeto{

    private int bonoAtaque;

    public Arma(String nombre, double peso, int cantidad, int bonoAtaque) {
        super(nombre, peso, cantidad);
        this.bonoAtaque = bonoAtaque;
    }
}
