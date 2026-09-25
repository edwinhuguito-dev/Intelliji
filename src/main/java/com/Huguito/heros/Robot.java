package com.Huguito.heros;

public class Robot implements Enemigo {
    @Override
    public void atacar() {
        System.out.println("El robot te dispara laser.");
    }
}
