package com.Huguito.practica01;

public class UsoFactorial {


    int numero ;

    public UsoFactorial(int numero) {

        this.numero = numero;
    }


    public int factorial(){
        int resultado = 1;

        for(int i = numero; i > 0; i--){
            resultado = resultado * i;
        }
        return resultado;

    }

}

