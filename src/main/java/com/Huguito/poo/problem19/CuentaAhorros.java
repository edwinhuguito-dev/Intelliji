package com.Huguito.poo.problem19;

public class CuentaAhorros implements Auditable{

    private final String dniTitular;
    private final double saldoMinimo;

    public CuentaAhorros(String dniTitular, double saldoMinimo) {
        this.dniTitular = dniTitular;
        this.saldoMinimo = saldoMinimo;
        validar();
    }

    private void validar(){
        if(dniTitular == null || dniTitular.isBlank() || dniTitular.length() != 8){
            throw new CuentaInvalidaException("El dni del titular es 8 digitos y no puede ser vacio");
        }
        if(saldoMinimo <  100){
            throw new CuentaInvalidaException("El monto minino no puede ser menor a 100");
        }

    }

    private void validarIdentidadUsuario(String dniIngresado){
        if(dniIngresado == null || !dniIngresado.equals(dniTitular)){
            throw new CuentaInvalidaException("Error el dni no pertenece al usuario");
        }

    }


    @Override
    public void evaluarSeguridad(double montoOperacion) {

    }
    public void evaluarSeguridad(double montoOperacion, String dni){
        if(montoOperacion <= 0){
            throw new CuentaInvalidaException("El monto debe ser mayor a 0");
        }
        if(montoOperacion > 3000){
            validarIdentidadUsuario(dni);
        }
        System.out.println("Validacion de cuenta exitosa dni: " + dniTitular);
    }
}
