package com.Huguito.poo.problem03;

public class ComidaRapida extends Platillo {

    protected boolean esParaLlevar;

    public ComidaRapida(String nombre, double precio) {

        super(nombre, precio);

        this.esParaLlevar = true;
    }

    @Override
    void preparar() {
        System.out.println("Se pone a calentar la freidora y se frie la carne");
    }
}
