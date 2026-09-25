package com.Huguito.abstracPeticion;

public class MainPeticion {
    public static void main(String[] args){
        Peticion p1 = new PeticionBuilder("https://api.com/usuarios")
                .build();
        p1.enviar();

        System.out.println();

        // peticion compleja

        Peticion p2 = new PeticionBuilder("https://api.com/login")
                .metodo("POST")
                .body("{\"user\":\"admin\"}")
                .timeout(30)
                .build();
        p2.enviar();


    }
}
