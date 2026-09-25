package com.Huguito.estructuraAbstracta;

public interface FabricaCloud {
    Servidor crearServer();
    Disco crearDisco();
    Red crearRed();
}
