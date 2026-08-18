package com.Huguito.practica03;

import java.util.Random;

public class Ejercicio18Contra {

    private int longi;

    private String pass = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+=<>?";



    public Ejercicio18Contra(int longi) {
        this.longi = longi;
    }

    public String contrasena(){
        Random random = new Random();
        String resultado = "";

        for(int i = 0; i < this.longi; i++){
            int rando = random.nextInt(pass.length());
            char k = pass.charAt(rando);

            resultado += k;
        }
        return resultado;
    }
}
