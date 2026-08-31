package com.Huguito.poo.problem13;

public class NaveCombate extends NaveEspacial {

    protected int cantidadMisiles;

    public NaveCombate(String matricula, String nombreCapitan, int nivelBlindaje, int combustibleActual, int poder, int cantidadMisiles) {
        super(matricula, nombreCapitan, nivelBlindaje, combustibleActual, poder);
        this.cantidadMisiles = cantidadMisiles;
    }

    @Override
    void calcularPoderCombate() {
        this.poder = (this.nivelBlindaje / 2) + (this.cantidadMisiles * 10);
    }

    public void dipararMisil(){
        this.cantidadMisiles -= 1;
        if(this.cantidadMisiles <= 0){
            throw new GalacticException("Error, No tienes misiles para dispararar, agregar misisles");
        }
    }
}