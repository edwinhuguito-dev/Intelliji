package com.Huguito.abstracPeticion;

public class PeticionBuilder {

    String url;
    String metodo = "GET";
    String body = null;
    int timeout = 10;

    public PeticionBuilder(String url){
        this.url = url;
    }

    public PeticionBuilder metodo(String m){
        this.metodo = m;
        return this;
    }

    public PeticionBuilder body(String b){
        this.body = b;
        return this;
    }

    public PeticionBuilder timeout(int t){
        this.timeout = t;
        return this;
    }

    // METODO QUE FABRICA Y ENTREGA LA PETICION REAL

    public Peticion build(){
        return new Peticion(this);
    }



}
