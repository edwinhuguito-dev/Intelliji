package com.Huguito.heros;

public class CrearRobot extends Generador{
    @Override
    public Enemigo crear() {
        return new Robot();
    }
}
