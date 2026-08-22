package com.Huguito.poo.problem04;

public class Mamifero extends Animal{

    protected boolean tienePelaje;


    public Mamifero(String nombre, int edad) {
        super(nombre, edad);
        this.tienePelaje = true;
    }

    @Override
    void hacerSonido() {
        System.out.println("Este animal hace MIAU MIAU MIAU");
    }
}
