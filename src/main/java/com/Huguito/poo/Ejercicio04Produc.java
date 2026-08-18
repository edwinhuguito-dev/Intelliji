package com.Huguito.poo;

import java.util.Scanner;

public class Ejercicio04Produc {

    protected static int id = 0;
    protected String nombre;
    protected double precio;

    public Ejercicio04Produc(){

    }

    public Ejercicio04Produc(String nombre, double precio){

        this.nombre = nombre;
        if(!(precio > 0)){
            System.out.println("El precio tiene que ser positivo");
        }
        this.precio = precio;
        id++;
    }

    public String product(int canti){
        double precioTotal = canti * this.precio;
        return "El producto es: " + this.nombre + " y su precio total es: " + precioTotal;
    }
}