package com.Huguito.poo.problem15;

import com.Huguito.poo.problem13.GalacticException;

public class Guerrero extends Personaje{
    private int fuerza;
    private int resistencia;

    public Guerrero(String nombre, int nivel, int experiencia, int vidaActual, int vidaMaxima, int recursoActual, int recursoMaximo, int poder, int defensa, int racha, Inventario inventario, EstadoPersonaje estado, int fuerza, int resistencia) {
        super(nombre, nivel, experiencia, vidaActual, vidaMaxima, recursoActual, recursoMaximo, poder, defensa, racha, inventario, estado);
        this.fuerza = fuerza;
        this.resistencia = resistencia;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }



    @Override
    public void recibirDano(int dano){
        if(dano < 0){
            throw new GalacticException("El daño recibido tiene que se mayor a 0");
        }
        int danoNeto = Math.max(0, dano - getDefensa());

        int reduccionPorcentaje = (int) (this.resistencia * 0.10);

        int danoFinal = Math.max(0, danoNeto - reduccionPorcentaje);

        int vidaRestante = getVidaActual() - danoFinal;
        setVidaActual(Math.max(0, vidaRestante));

        if(getVidaActual() == 0){
            setEstado(EstadoPersonaje.DERROTADO);
        } else if(getVidaActual() <= 10){
            setEstado(EstadoPersonaje.ATURDIDO);
        } else{
            setEstado(EstadoPersonaje.NORMAL);
        }

    }


    @Override
    public int calcularPoderAtaque() {

        int power = (int)(getFuerza() * 1.5);

        return power;
    }
}
