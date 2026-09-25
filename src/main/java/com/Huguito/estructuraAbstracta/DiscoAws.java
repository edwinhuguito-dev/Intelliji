package com.Huguito.estructuraAbstracta;

public class DiscoAws implements Disco{
    @Override
    public void encriptar() {
        System.out.println("Encriptado con AWS KMS...");
    }

    @Override
    public String id() {
        return "vol-aws-9901";
    }
}
