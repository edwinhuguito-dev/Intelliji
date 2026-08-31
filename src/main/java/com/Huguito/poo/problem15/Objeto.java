package com.Huguito.poo.problem15;

public abstract class Objeto {
    private String nombre;
    private double peso;
    private int cantidad;

    public Objeto(String nombre, double peso, int cantidad) {
        this.nombre = nombre;
        this.peso = peso;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
