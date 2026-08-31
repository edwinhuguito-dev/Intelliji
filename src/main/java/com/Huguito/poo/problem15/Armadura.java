package com.Huguito.poo.problem15;

public class Armadura extends Objeto{

    private int bonoDefensa;

    public Armadura(String nombre, double peso, int cantidad, int  bonoDefensa) {
        super(nombre, peso, cantidad);
        this.bonoDefensa = bonoDefensa;
    }
}
