package com.Huguito.poo.problem11;

public class Medicamento {

    protected String codigo;
    protected String nombre;
    protected double precio;
    protected int stock;

    public Medicamento(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }


    public void mostrarInfoMedicamento(){
        System.out.println("Medicamento " +
                "codigo " + this.codigo +
                ", nombre " + this.nombre +
                ", precio " + this.precio +
                ", stock " + this.stock
                );
    }

}
