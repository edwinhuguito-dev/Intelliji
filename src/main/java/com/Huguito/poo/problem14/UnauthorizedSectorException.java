package com.Huguito.poo.problem14;

public class UnauthorizedSectorException extends GalaticSystemException {

    public UnauthorizedSectorException(String message) {
        super(message, 403);
    }
}
