package com.Huguito.factoryMetho;

public class envioCorreCreator extends envioCreator {
    @Override
    protected Envio crearEnvio() {
        return new EnvioCorreo();
    }
}
