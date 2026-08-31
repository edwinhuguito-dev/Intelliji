package com.Huguito.poo.problem09;

public class Plato implements Preparable{

    protected String codigo;
    protected String nombre;
    protected double precio;
    protected int timePre;

    public Plato(String codigo, String nombre, double precio, int timePre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.timePre = timePre;
    }


    @Override
    public void prepararItem() {
        System.out.println("El plato " + this.nombre + " se esta preparando");
    }


    @Override
    public String toString() {
        return "Plato{" +
                "codigo='" + this.codigo + '\'' +
                ", nombre='" + this.nombre + '\'' +
                ", precio=" + this.precio +
                ", timePre=" + this.timePre +
                '}';
    }
}
