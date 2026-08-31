package com.Huguito.poo.problem14;

import java.time.LocalDateTime;

public abstract class GalaticSystemException extends RuntimeException {

    protected int codigoError;
    protected LocalDateTime timestamp;

    public GalaticSystemException(String message, int codigoError){
        super(message); // el mensaje del padre RuntimeExeption
        this.codigoError = codigoError;
        this.timestamp = LocalDateTime.now(); // captura la hora exacta
    }

    public int getCodigoError(){
        return codigoError;
    }


    public LocalDateTime getTimestamp(){
        return timestamp;
    }

}
