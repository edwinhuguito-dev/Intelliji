package com.Huguito.poo.problem20;

public class CentroLogistico {
    public void orquestar(Liquidable unidad, double distanciaRecorrido, double montoCarga){
        try{
            double costoFinal = unidad.liquidarServicio(distanciaRecorrido, montoCarga);
            System.out.println("Operacion de liquidacion exitosa. Costo real es : " + costoFinal);
        } catch(VehiculoInvalidoException e){
            System.out.println("Error " + e.getMessage());

        } catch (RestriccionOperativaException e){
            System.out.println("Incidencia operativa bloqueada " + e.getMessage());
        }
        System.out.println("------------------------------------------------------");
    }
}
