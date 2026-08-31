package com.Huguito.poo.problem16;

public class MainHeroe {
    public static void main(String[] args){

        Combate combate = new Combate();

        Arconte flechi = new Arconte("CHAVO", 50, 50, 100, 24, 18, 60);
        Guerrero gue = new Guerrero("CHOLOMON", 50,50, 100, 25,20, 5);
        Mago magi = new Mago("Huguito", 50, 50, 100, 30, 18, 15);

        combate.round(flechi, gue);

    }
}
