package com.Huguito.facto;

public abstract class ProcesadorPagoFactory {


    public abstract MetodoPago crearMetodoPago();

    public void realizarCobro(double monto){

        System.out.println("---- INICIANDO TRANSACCION ----");

        MetodoPago pago = crearMetodoPago();

        pago.procesarPago(monto);

        System.out.println("---- TRANSACCION REGISTRADA EN BASE DE DATOS ----");

    }

}
