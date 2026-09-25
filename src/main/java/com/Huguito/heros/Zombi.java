package com.Huguito.heros;

public class Zombi implements Enemigo{
    @Override
    public void atacar() {
        System.out.println("El zombi te muerde.");
    }
}
