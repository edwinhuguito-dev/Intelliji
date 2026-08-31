package com.Huguito.poo.problem16;

public class Guerrero extends Heroe{

    private int resistencia;

    public Guerrero(String nombre, int vidaMax, int vidaActual, int mana, int poder, int defensa, int resistencia) {
        super(nombre, vidaMax, vidaActual, mana, poder, defensa);
        this.resistencia = resistencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public void recibirDano(int dano){
        int resis = Math.max(0, dano - (getDefensa() + getResistencia()));
        setVidaActual(Math.max(0, getVidaActual() - resis));


        System.out.println("DAÑO RECIBIDO CHOLOMON " + (getVidaMax() - getVidaActual()));
    }

}
