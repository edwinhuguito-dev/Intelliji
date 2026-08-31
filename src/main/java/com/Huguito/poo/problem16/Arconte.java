package com.Huguito.poo.problem16;

public class Arconte extends Heroe{
    private double probEsquive;

    public Arconte(String nombre, int vidaMax, int vidaActual, int mana, int poder, int defensa, double probEsquive) {
        super(nombre, vidaMax, vidaActual, mana, poder, defensa);
        this.probEsquive = probEsquive;
    }

    public double getProbEsquive() {
        return probEsquive;
    }

    public void setProbEsquive(double probEsquive) {
        this.probEsquive = probEsquive;
    }


    @Override
    public void recibirDano(int dano){
        double proba = Math.random() * 100;
        if(proba < getProbEsquive()){
            System.out.println(getNombre() + " HA ESQUIVADO EL ATAQUE");
        } else{
            super.recibirDano(dano);
        }

        System.out.println("DAÑO RECIBIDO CHAVO  " + (getVidaMax() - getVidaActual()));
    }



}
