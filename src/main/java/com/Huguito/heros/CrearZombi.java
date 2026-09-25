package com.Huguito.heros;

public class CrearZombi extends Generador{
    @Override
    public Enemigo crear() {
        return new Zombi();
    }
}
