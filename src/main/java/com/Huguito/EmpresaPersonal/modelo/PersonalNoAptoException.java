package com.Huguito.EmpresaPersonal.modelo;

public class PersonalNoAptoException extends RuntimeException{

    public PersonalNoAptoException(String mensaje){
        super(mensaje);
    }
}
