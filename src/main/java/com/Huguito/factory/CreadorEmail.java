package com.Huguito.factory;

public class CreadorEmail extends NotificacionFactory{
    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionEmail();
    }
}
