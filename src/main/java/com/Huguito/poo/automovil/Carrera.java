package com.Huguito.poo.automovil;

public class Carrera extends Coche{

    protected boolean capo;

    public Carrera(String marca, String modelo, int nPuerta, boolean capo) {
        super(marca, modelo, nPuerta);
        this.capo = capo;
    }

    public boolean isCapo() {
        return capo;
    }

    public void setCapo(boolean capo) {
        this.capo = capo;
    }

    @Override
    public String toString() {
        return super.toString() + " capo" + capo;
    }
}
