package com.Huguito.factory;

public class CreadorSMS extends NotificacionFactory{
    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionSMS();
    }
}
