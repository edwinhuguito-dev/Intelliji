package com.Huguito.practica03;

public class Ejercicio12Mayusculas {

    private String phase;

    int contaMa = 0;
    int contaMi = 0;


    public Ejercicio12Mayusculas(String phase) {
        this.phase = phase;
    }

    public void contarMayus(){


        for(int i = 0; i < this.phase.length(); i++){

            if(Character.isUpperCase(this.phase.charAt(i))) { contaMa ++;}
            if(Character.isLowerCase(this.phase.charAt(i))) { contaMi ++;}
        }
    }

    public String getPhase() {
        return "La frase tiene: " + contaMa + " letras en mayuculas y tiene: " + contaMi + " en minusculas.";
    }
}
