package com.Huguito.singleton;

public class ConfigManager {

    private static ConfigManager instancia;
    private String urlServidor;

    private ConfigManager(){
        this.urlServidor = "https://api.midomino.com";
    }

    public static ConfigManager getInstance(){
        if(instancia == null){
            instancia = new ConfigManager();
        }
        return instancia;
    }

    public String getUrlServidor(){
        return urlServidor;
    }

}
