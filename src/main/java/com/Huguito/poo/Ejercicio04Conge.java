package com.Huguito.poo;

public class Ejercicio04Conge extends Ejercicio04Produc {
    private String nameCaja;

    public Ejercicio04Conge(String nombre, double precio, String nameCaja){
        super(nombre, precio);
        this.nameCaja = nameCaja;
    }

    public double conge(int compra){
        return this.precio * compra;
    }
}
