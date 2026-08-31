package com.Huguito.poo.problem15;

import com.Huguito.poo.problem13.GalacticException;

public class Arquero extends Personaje{

    private int precision;
    private int flechas;

    public Arquero(String nombre, int nivel, int experiencia, int vidaActual, int vidaMaxima,
                   int recursoActual, int recursoMaximo, int poder, int defensa, int racha,
                   Inventario inventario, EstadoPersonaje estado, int precision, int flechas) {
        super(nombre, nivel, experiencia, vidaActual, vidaMaxima, recursoActual, recursoMaximo, poder, defensa, racha, inventario, estado);
        this.precision = precision;
        this.flechas = flechas;
    }


    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }



    @Override
    public void curar(int cantidad){
        if(cantidad <= 0){
            throw new GalacticException("La cantidad tiene que ser mayor a 0");
        }
        //bonificacion
        int acu = (int)(cantidad + cantidad * 0.30);
        setVidaActual(Math.min(getVidaActual() + acu,getVidaMaxima()));
    }

    @Override
    public int calcularPoderAtaque() {
        int power = (int)(getPoder() + getPrecision() * 0.20);

        return power;
    }
}
