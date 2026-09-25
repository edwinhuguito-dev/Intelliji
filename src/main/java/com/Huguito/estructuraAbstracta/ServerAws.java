package com.Huguito.estructuraAbstracta;

public class ServerAws implements Servidor{
    @Override
    public void iniciar() {
        System.out.println("EC2 (AWS) iniciando");
    }

    @Override
    public void conectar(Red r) {
        System.out.println("    -> Asignacion  VPC  de AWS");
    }

    @Override
    public void montar(Disco d) {
        System.out.println("    -> Volumen EBS " + d.id() + " montado.");
    }
}
