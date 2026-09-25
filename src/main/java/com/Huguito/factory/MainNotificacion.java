package com.Huguito.factory;

public class MainNotificacion {
    public static void main(String[] args){
        NotificacionFactory clienteEmail = new CreadorEmail();
        clienteEmail.procesarEnvio("Tu codigo de acceos es 3333");


        NotificacionFactory clienteSMS = new CreadorSMS();
        clienteSMS.procesarEnvio("Tu paquete llego a tu destino");
    }
}
