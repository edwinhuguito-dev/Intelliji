package com.Huguito.facto;

public class FactoryPaypal extends ProcesadorPagoFactory{


    @Override
    public MetodoPago crearMetodoPago()
    {
        return new PagoPaypal();
    }
}
