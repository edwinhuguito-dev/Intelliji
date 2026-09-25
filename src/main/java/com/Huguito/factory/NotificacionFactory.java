package com.Huguito.factory;

public abstract class NotificacionFactory {

    public abstract Notificacion crearNotificacion();

    public void procesarEnvio(String mensaje){
        Notificacion notificacion = crearNotificacion();

        notificacion.enviar(mensaje);
    }


}
