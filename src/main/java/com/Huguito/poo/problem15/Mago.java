package com.Huguito.poo.problem15;

import com.Huguito.poo.problem13.GalacticException;

public class Mago extends Personaje{

    private int inteligencia;
    private int poderMagico;

    public Mago(String nombre, int nivel, int experiencia, int vidaActual, int vidaMaxima, int recursoActual, int recursoMaximo, int poder, int defensa, int racha, Inventario inventario, EstadoPersonaje estado, int inteligencia, int poderMagico) {
        super(nombre, nivel, experiencia, vidaActual, vidaMaxima, recursoActual, recursoMaximo, poder, defensa, racha, inventario, estado);
        this.inteligencia = inteligencia;
        this.poderMagico = poderMagico;

    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }



    @Override
    public void ganarExperiencia(int exp){
        if(exp <= 0){
            throw new GalacticException("La experiencia tiene que ser mayor a 0");
        }
        // bonificacion del 10% por ser mago
        int acu = (int)(exp + exp * 0.20);
        setExperiencia(getExperiencia() + acu);

    }



    @Override
    public int calcularPoderAtaque() {
        int power = (int)(getPoderMagico() + getInteligencia() * 0.20);
        return power;
    }
}
