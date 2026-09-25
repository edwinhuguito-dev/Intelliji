package com.Huguito.poo.problem19;

public class CuentaCorriente implements Auditable{

    private final String numeroCuenta;
    private final double limiteSobregiro;


    public CuentaCorriente(String numeroCuenta, double limiteSobregiro) {
        this.numeroCuenta = numeroCuenta;
        this.limiteSobregiro = limiteSobregiro;

        validarDatos();
    }

    private void validarDatos(){
        if(numeroCuenta == null || numeroCuenta.isBlank()){
            throw new CuentaInvalidaException("El numero de cuenta no puede estar vacio");
        }
        if(limiteSobregiro <= 0){
            throw new CuentaInvalidaException("El limite debe ser mayor a 0");
        }
    }

    private void umbral(double montoOperacion){
        if(montoOperacion > 5000){
            throw new FraudeDetectadoException("Fraude detectado");
        }
    }

    @Override
    public void evaluarSeguridad(double montoOperacion) {
        if(montoOperacion <= 0){
            throw new CuentaInvalidaException("El monoto de la operacion no debe ser mayor a 5000");
        }
        umbral(montoOperacion);
        System.out.println(STR. "Cuenta corriente Nro: \{numeroCuenta} evaluada con exito");
        System.out.println(STR. "Monto de operacion analizado \{montoOperacion} | limite sobre giro \{limiteSobregiro}");
    }
}
