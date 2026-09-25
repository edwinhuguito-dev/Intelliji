package com.Huguito.factoryMetho;

public class Main {
    public static void main(String[] args){
        envioCreator enviCa = new envioCamionCreator();
        enviCa.procedarEnvio();

        envioCreator enviMO = new envioMotoCreator();
        enviMO.procedarEnvio();

        envioCreator enviCo = new envioCorreCreator();
        enviCo.procedarEnvio();


    }
}
