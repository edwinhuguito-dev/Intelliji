package com.Huguito.singleton;

public class MainMusica {
    public static void main(String[] args){
        SesionUsuario vistaLogin = SesionUsuario.getInstance();
        vistaLogin.iniciarSesion("Huguito", "Administrador");


        SesionUsuario vistaDashboard = SesionUsuario.getInstance();
        vistaDashboard.mostrarPerfil();

        SesionUsuario vistaConfig = SesionUsuario.getInstance();
        vistaConfig.serrarSesion();

        vistaConfig.mostrarPerfil();



    }
}
