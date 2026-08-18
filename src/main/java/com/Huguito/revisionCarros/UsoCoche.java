package com.Huguito.revisionCarros;

public class UsoCoche {
    public static void main(String[] args) {

        try{
            // USAMOS EL RECORD PARA EL COMPRADOR
            Comprador cliente = new Comprador("Huguito", "123458ss");
            System.out.println("Cliente: " + cliente.nombre() + " DNI: " + cliente.dni());

            // CREAMOS EL COCHE USANDO EL "ENUM" (EstadoVehiculo.NUEVO)
            Coche miCarro = new Coche("Rojo", 1200.0, EstadoVehiculo.NUEVO);

            // PROBANDO EL METODO DE LA INTERFAZ

            double impuesto = miCarro.calcularImpuestoMatricula();
            System.out.println("Color del carro:. " + miCarro.getColor());
            System.out.println("Impuesto de matricula: $" + impuesto);

            // LEYENDO LA ANOTACIÓN DESDE LA CLASE MEDIANTE REFREXION
            CertificadoGarantia garantia = miCarro.getClass().getAnnotation(CertificadoGarantia.class);
            if(garantia != null) {
                System.out.println("Garantia de fabrica: " + garantia.anios());
            }

        } catch (PesoInvalidoException e) {
            // CAPTURANDO NUESTRA EXCEPCION PERSONALIZADA POR SI ALGO FALLA

            System.out.println("Excepcion capturada: " + e.getMessage());
        }

    }
}
