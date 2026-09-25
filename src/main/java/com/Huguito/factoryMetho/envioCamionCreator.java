package com.Huguito.factoryMetho;

public class envioCamionCreator extends envioCreator{
    @Override
    protected Envio crearEnvio() {
        return new EnvioCamion();
    }
}
