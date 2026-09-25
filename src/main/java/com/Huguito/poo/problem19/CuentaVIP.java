package com.Huguito.poo.problem19;

public class CuentaVIP implements Auditable{

    private final String codigoCliente;
    private final int exclusividad;


    public CuentaVIP(String codigoCliente, int exclusividad) {
        this.codigoCliente = codigoCliente;
        this.exclusividad = exclusividad;
        validar();
    }

    private void validar(){
        if(codigoCliente == null || codigoCliente.isBlank()){
            throw new CuentaInvalidaException("El codigo del cliente no puede estar vacio");
        }
        if(!(exclusividad > 0 && exclusividad < 6)){
            throw new CuentaInvalidaException("Error el codigo tiene un rango de 1 y 5");
        }
    }




    @Override
    public void evaluarSeguridad(double montoOperacion) {
        if(montoOperacion > 10000 && (exclusividad > 0 && exclusividad < 3)){
            throw new CuentaInvalidaException("Error, nivel de exclusividad bajo");
        }
        System.out.println(STR. "Transaccion exitosa, el cliente \{codigoCliente} tiene un nivel de exclusivividad \{exclusividad}");
    }

}
