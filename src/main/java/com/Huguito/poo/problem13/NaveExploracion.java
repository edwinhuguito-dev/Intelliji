package com.Huguito.poo.problem13;

public class NaveExploracion extends NaveEspacial{

    protected int rangoSensoresKm;


    public NaveExploracion(String matricula, String nombreCapitan, int nivelBlindaje, int combustibleActual, int poder, int rangoSensoresKm) {
        super(matricula, nombreCapitan, nivelBlindaje, combustibleActual, poder);
        this.rangoSensoresKm = rangoSensoresKm;
    }


    @Override
    void calcularPoderCombate() {
        this.poder = (this.combustibleActual / 10) + (this.rangoSensoresKm * 2);
        System.out.println("el poder de combate de la nave " + this.matricula + " capitaneada por " + this.nombreCapitan + " tiene un nivel de blindaje de " + this.nivelBlindaje +
                " y su poder de combates es de " + this.poder);

    }
}
