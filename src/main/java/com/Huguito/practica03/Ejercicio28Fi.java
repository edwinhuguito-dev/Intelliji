package com.Huguito.practica03;

import java.util.Random;

public class Ejercicio28Fi {

    private int[][] su;
    Random random = new Random();

    public Ejercicio28Fi() {

        int i = random.nextInt(1,5);
        int j = random.nextInt(1,9);

        this.su = new int[i][j];
    }

    public void resu(){
        for(int i = 0; i < this.su.length; i++){
            for(int j = 0; j < this.su[i].length; j++){

                this.su[i][j] = random.nextInt(1,50);

            }
        }
    }

    public int sufi(){

        if(this.su.length == 0){
            return 0;
        }

        int filaAleatoria = random.nextInt(0, this.su.length);

        System.out.println("Se selecciono la fila aleatoria " + filaAleatoria);

        int sumaFila = 0;
        for(int j = 0; j < this.su[filaAleatoria].length; j++){
            sumaFila += this.su[filaAleatoria][j];
        }
        return sumaFila;
    }
}
