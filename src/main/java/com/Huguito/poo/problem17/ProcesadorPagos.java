package com.Huguito.poo.problem17;

public class ProcesadorPagos {

    public void ejecutarPagos (MetodoPago tipo, double monto){
        try{
                tipo.procesarPago(100);
        } catch (TransaccionInvalidaException e){
            System.out.println("Pago rechazado: " + e.getMessage());
        }
    }

}
