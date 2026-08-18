package com.Huguito.poo.automovil;

public class Moto extends Coche{

    protected boolean sidecar;

    public Moto(String marca, String modelo, int nPuerta, boolean sidecar) {
        super(marca, modelo, nPuerta);
        this.sidecar = sidecar;
    }

    public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }

    @Override
    public String toString() {
        return super.toString() + " sidecar" + sidecar;
    }
}
