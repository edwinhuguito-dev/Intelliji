package com.Huguito.poo.problem04;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected int energia;


    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.energia = 50;
    }


    abstract void hacerSonido();

    public void comer(int cantidad){
        this.energia += cantidad;

        if(this.energia >= 0 && this.energia <= 25){
            System.out.println(this.nombre + " sigue con poquita eneriga (" + this.energia + "). Cuidado");
        } else if(this.energia >= 26 && this.energia <= 50){
            System.out.println(this.energia + " tiene energia media (" + this.energia + ").");
        } else if(this.energia >= 51 && this.energia <= 75){
            System.out.println(this.energia + " tiene buena energia (" + this.energia + ").");
        } else if(this.energia >= 76 && this.energia <= 100) {
            System.out.println(this.energia + " tiene al 100% de energia (" + this.energia + ").");
        } else {
            this.energia = 100;
        }

    }

}
