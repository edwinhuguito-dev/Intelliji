package com.Huguito.poo;

public class Ejercicio04Fresh extends Ejercicio04Produc {
    private int caducidad;

    public Ejercicio04Fresh(){

    }

    public Ejercicio04Fresh(String nombre, double precio, int caducidad) {
        super(nombre, precio);
        this.caducidad = caducidad;


        if (caducidad >= 3 && caducidad <= 6) {
            this.precio -= this.precio * 0.40;
        } else if (caducidad < 3 && caducidad >= 0) {
            this.precio -= this.precio * 0.70;
        }
    }

    public double fresh(int canti){
        return this.precio * canti;
    }
}
