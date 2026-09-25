package com.Huguito.estructuraAbstracta;

public class DiscoAzu implements Disco{
    @Override
    public void encriptar() {
        System.out.println("Encriptado con Azure key Vault...");
    }

    @Override
    public String id() {
        return "disk-azu-4412";
    }
}
