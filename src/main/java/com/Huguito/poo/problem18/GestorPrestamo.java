package com.Huguito.poo.problem18;

public class GestorPrestamo {

    public void procesarSolicitud(Prestamoable prestamo, int diasAtra, double montoBBase){

        try{
            prestamo.calcularYAplicarCuota(diasAtra , montoBBase);

            System.out.println("Estado de prestamo APROBADO");


        } catch (PrestamoException e){
            System.out.println(STR."Error \{e.getMessage()}");
            System.out.println("Estado del prestamo RECHAZADO");
        }












    }
}
