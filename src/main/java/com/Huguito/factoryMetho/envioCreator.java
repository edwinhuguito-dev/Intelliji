package com.Huguito.factoryMetho;

public abstract class envioCreator {
    protected abstract Envio crearEnvio();

    public void procedarEnvio(){
        Envio envio = crearEnvio(); // llamar a metodo factory
        envio.enviarPaquete();

    }


}
