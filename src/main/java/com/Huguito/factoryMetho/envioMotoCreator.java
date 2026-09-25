package com.Huguito.factoryMetho;

public class envioMotoCreator extends envioCreator{
    @Override
    protected Envio crearEnvio() {
        return new EnvioMoto();
    }
}
