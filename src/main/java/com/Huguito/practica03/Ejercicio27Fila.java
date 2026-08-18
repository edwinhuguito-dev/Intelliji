package com.Huguito.practica03;

public class Ejercicio27Fila {

    private int[][] araara;

    public Ejercicio27Fila() {
        this.araara = new int[3][4];
    }

    public void relle(){

        for(int i = 0; i < this.araara.length; i++){
            for(int j = 0; j < this.araara[i].length; j++){
                this.araara[i][j] = i + j;
            }
        }
    }

    public int sumafi(int numerofila){
        if(numerofila < 0 || numerofila >= this.araara.length){
            return -1;
        }

        int sumaFila = 0;

        for(int j = 0; j < this.araara[numerofila].length; j++){
            sumaFila += this.araara[numerofila][j];
        }
        return sumaFila;

    }




}
