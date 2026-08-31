package com.Huguito.poo.problem15;

public class Pocion extends Objeto{

    private int curacion;

    public Pocion(String nombre, double peso, int cantidad, int curacion) {
        super(nombre, peso, cantidad);
        this.curacion = curacion;
    }
}
