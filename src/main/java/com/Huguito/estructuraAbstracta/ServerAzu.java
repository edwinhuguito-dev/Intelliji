package com.Huguito.estructuraAbstracta;

public class ServerAzu implements Servidor{
    @Override
    public void iniciar() {
        System.out.println("Azure VM iniciando");
    }

    @Override
    public void conectar(Red r) {
        System.out.println("Asignado a VNet de Azure ");
    }

    @Override
    public void montar(Disco d) {
        System.out.println("Disco administrado " + d.id() + " montado");
    }
}
