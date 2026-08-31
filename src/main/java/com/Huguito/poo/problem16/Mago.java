package com.Huguito.poo.problem16;

public class Mago extends Heroe{
    private int bonusMa;

    public Mago(String nombre, int vidaMax, int vidaActual, int mana, int poder, int defensa, int bonusMa) {
        super(nombre, vidaMax, vidaActual, mana, poder, defensa);
        this.bonusMa = bonusMa;
    }

    public int getBonusMa() {
        return bonusMa;
    }

    public void setBonusMa(int bonusMa) {
        this.bonusMa = bonusMa;
    }

    @Override
    public void atacar(Heroe objetivo){
        int min = (int)((getPoder() + getBonusMa()) * 0.7);
        int max = (int)((getPoder() + getBonusMa()) * 1.3);
        int danoBruto = (int)(Math.random() * (max - min + 1)) + min;

        objetivo.recibirDano(danoBruto);

        System.out.println("DAÑO RECIBIDO HUGUITO  " + (getVidaMax() - getVidaActual()));
    }


}
