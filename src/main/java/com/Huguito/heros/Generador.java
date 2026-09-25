package com.Huguito.heros;

public abstract class Generador {

    public abstract Enemigo crear();

    public void aparecer(){
        System.out.println("Alerta de enemigo");

        Enemigo e = crear();

        e.atacar();

    }

}
