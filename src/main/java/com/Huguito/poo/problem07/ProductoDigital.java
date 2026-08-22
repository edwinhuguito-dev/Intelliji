package com.Huguito.poo.problem07;

public class ProductoDigital extends Producto implements Descuentable{

    protected double tamanoEnMB;

    public ProductoDigital(String id, String nombre, double precio, int stock, double tamanoEnMB) {
        super(id, nombre, precio, stock);
        this.tamanoEnMB = tamanoEnMB;
    }



    @Override
    public void aplicarDecuento(double porcentaje) {
        this.precio = this.precio - (this.precio * (porcentaje / 100));
        System.out.println("Se aplico un descuento del " + porcentaje + " al producto " + this.nombre);
    }

    @Override
    void mostrarInfoproducto() {
        System.out.println("ProductoDigital " +
                "tamanoEnMB " + tamanoEnMB +
                ", id " + id +
                ", nombre " + nombre +
                ", precio " + precio +
                ", stock " + stock);

    }

}
