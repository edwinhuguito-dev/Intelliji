package com.Huguito.practica03;

public class Ejercicio11Char {

    private String phase;

    public Ejercicio11Char(String phase) {
        this.phase = phase;
    }

    public int contarTexto(){
        int contador = 0;
        String vocales = "aeiouAEIOU";

        for(int i = 0; i < this.phase.length(); i++){
            char letra = this.phase.charAt(i);

            if(vocales.indexOf(letra) != -1){
                contador ++;
            }
        }
        return contador;
    }
}
