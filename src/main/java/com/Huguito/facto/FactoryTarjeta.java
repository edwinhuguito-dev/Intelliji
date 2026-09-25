package com.Huguito.facto;

public class FactoryTarjeta extends ProcesadorPagoFactory{


    @Override
    public MetodoPago crearMetodoPago()
    {
        return new PagoTarjeta();
    }
}
