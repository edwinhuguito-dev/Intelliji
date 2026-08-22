package com.Huguito.poo.problem03;

public class Bebida extends Platillo{

    protected int mililitros;

    public Bebida(String nombre, double precio, int mililitros) {
        super(nombre, precio);
        this.mililitros = mililitros;
    }

    @Override
    void preparar() {
        System.out.println("Se hecha hielo al vaso y se sirve");
    }
}
