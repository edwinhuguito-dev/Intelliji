package com.Huguito.Game;

public class VideoJuego implements Game {

    protected String nombre;
    protected double precio;
    protected boolean prestado;
    protected int vecesPresatado;

    public VideoJuego(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // PRESTAR estado defecto true que indica esta disponible
    // si presta cambia "prestado a a false" que indica no esta disponible

    // DEVOLVER pone "prestado en false" y solo se puede devoler si
    // prestado esta en TRUE


    @Override
    public boolean prestar() {
        vecesPresatado ++;
        return prestado = true;
    }

    @Override
    public boolean devolver() {
        if(!prestado){return false;}
        return prestado = false;
    }
}
