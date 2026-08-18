package com.Huguito.practica01;

public class TiendaService {

    double precio ;

    public TiendaService(double precio) {
        this.precio = precio;
    }

    public double descuento(){
        if (precio <= 0) {
            System.out.println("Ingresa un valor válido, por favor.");
            return 0;
        } else if (precio <= 100) {
            System.out.print("No calificas para un descuento.");
            return 0;
        } else if (precio <= 500) {
            System.out.print("El precio es de: ");
            return precio - (precio * 0.10);
        } else {
            System.out.print("El descuento es de: ");
            return precio - (precio * 0.20);
        }
    }


}
