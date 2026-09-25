package com.Huguito.estructuraAbstracta;

public class FabricaAzu implements FabricaCloud{
    @Override
    public Servidor crearServer() {
        return new ServerAzu();
    }

    @Override
    public Disco crearDisco() {
        return new DiscoAzu();
    }

    @Override
    public Red crearRed() {
        return new RedAzu();
    }
}
