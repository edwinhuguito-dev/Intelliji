package com.Huguito.abstracPeticion;

public class Peticion {
    private final String url;
    private final String metodo;
    private final String body;
    private final int timeout;

    Peticion(PeticionBuilder b){
        this.url = b.url;
        this.metodo = b.metodo;
        this.body = b.body;
        this.timeout = b.timeout;
    }

    public void enviar(){
        System.out.println(" WORLD " + metodo + " -> " + url + " (Timeout: " + timeout + " S" );
        if (body != null){
            System.out.println(" Body: " + body);
        }
    }


}
