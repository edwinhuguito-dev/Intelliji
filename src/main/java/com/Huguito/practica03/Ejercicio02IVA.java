package com.Huguito.practica03;

import java.util.Scanner;

public class Ejercicio02IVA {
    private String producto;
    private double precio;
    private double IVA;
    private double precioTotal;



    public Ejercicio02IVA(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
        this.IVA = this.impuesto(precio);
        this.precioTotal = this.IVA + this.precio;
    }


    public double impuesto(double precioBase) {
        return precioBase ;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public double getIVA() {
        return IVA;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public String datos(){
        return "El producto es: " + getProducto() + " y su precio base es: " + String.format("%.2f", getPrecio()) + " y el IGV del producto es: " +
                String.format("%.2f", getIVA()) + " y su precio final es: " + String.format("%.2f", getPrecioTotal());
    }

}
