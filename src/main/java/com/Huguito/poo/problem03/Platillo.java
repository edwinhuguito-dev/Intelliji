package com.Huguito.poo.problem03;

public abstract class Platillo {

    protected String nombre;
    protected double precio;
    protected boolean disponible;

    public Platillo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = true;
    }

    abstract void preparar();

}
