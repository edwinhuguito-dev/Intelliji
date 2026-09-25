package com.Huguito.estructuraAbstracta;

public class FabricaAws implements FabricaCloud{
    @Override
    public Servidor crearServer() {
        return new ServerAws();
    }

    @Override
    public Disco crearDisco() {
        return new DiscoAws();
    }

    @Override
    public Red crearRed() {
        return new RedAws();
    }
}
