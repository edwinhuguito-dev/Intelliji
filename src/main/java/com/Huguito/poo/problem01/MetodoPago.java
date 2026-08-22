package com.Huguito.poo.problem01;

public abstract class MetodoPago {

    protected String titular;
    protected String indenty;

    public MetodoPago(String titular, String indenty) {
        this.titular = titular;
        this.indenty = indenty;
    }

    public abstract void detalles();



}
