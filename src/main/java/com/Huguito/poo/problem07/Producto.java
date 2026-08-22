package com.Huguito.poo.problem07;

public abstract class Producto {

    protected String id;
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(String id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int actulizarStock(int cantidad){
        if(!(cantidad > 0)){
            throw new ErrorMontoIndefinido("El monto a agregar tiene que ser mayora 0");
        }
        this.stock += cantidad;
        return this.stock;
    }

    abstract void mostrarInfoproducto();




}
