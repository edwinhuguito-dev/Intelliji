package com.Huguito.Game;

public class Prestable implements Game{

    protected int cantidad;
    protected String adeudo;
    protected String titular;


    public Prestable(int cantidad, String titular) {
        this.cantidad = cantidad;
        this.titular = titular;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }
}
