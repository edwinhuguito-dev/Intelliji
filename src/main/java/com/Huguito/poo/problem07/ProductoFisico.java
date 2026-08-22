package com.Huguito.poo.problem07;

public class ProductoFisico extends Producto implements Descuentable{

    protected double pesoEnKg;

    public ProductoFisico(String id, String nombre, double precio, int stock, double pesoEnKg) {
        super(id, nombre, precio, stock);
        this.pesoEnKg = pesoEnKg;

    }





    @Override
    public void aplicarDecuento(double porcentaje) {
        this.precio = this.precio - (this.precio * (porcentaje / 100));
        System.out.println("Se aplico un descuento del " + porcentaje + " al producto " + this.nombre);
    }



    @Override
    void mostrarInfoproducto() {
        System.out.println("ProductoFisico " +
                "pesoEnKg " + pesoEnKg +
                ", id " + id +
                ", nombre " + nombre +
                ", precio " + precio +
                ", stock " + stock
                );
    }
}
