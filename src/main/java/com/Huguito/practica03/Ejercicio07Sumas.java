package com.Huguito.practica03;

public class Ejercicio07Sumas {

    private int number01;
    private int comodin;

    public Ejercicio07Sumas(int number01, int comodin) {
        this.number01 = number01;
        this.comodin = comodin;
    }

    public int result(){
        while(!(this.comodin == -1)){
            this.number01 += this.comodin;
        }
        return this.number01;
    }


}