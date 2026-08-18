package com.Huguito.poo.automovil;

public class Coche extends Vehiculo {
    protected int nPuerta;

    public Coche(String marca, String modelo, int nPuerta) {
        super(marca, modelo);
        this.nPuerta = nPuerta;
    }

    public int getnPuerta() {
        return nPuerta;
    }

    public void setnPuerta(int nPuerta) {
        this.nPuerta = nPuerta;
    }

    @Override
    public String toString() {
        return super.toString() +" Npuertas" + nPuerta ;
    }
}
