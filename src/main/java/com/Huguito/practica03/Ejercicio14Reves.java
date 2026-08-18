package com.Huguito.practica03;

public class Ejercicio14Reves {

    private String phase;

    public Ejercicio14Reves(String phase) {
        this.phase = phase;
    }


    public boolean devuelta(){

        String respu = this.phase.replace(" ", "").toLowerCase();
        String reves = new StringBuilder(respu).reverse().toString();

        return respu.equals(reves);
    }




}
