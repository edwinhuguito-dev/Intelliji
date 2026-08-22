package com.Huguito.poo.problem06;

import java.util.HashMap;

public class Banco{

    protected HashMap<String, CuentaBancaria> linea;

    public Banco() {
        this.linea = new HashMap<>();
    }

    void agregarCuenta(CuentaBancaria cuenta){
     linea.put(cuenta.numeroCuenta, cuenta);
    }



    public void realizarRetiro(String numeroCuenta, double monto) {
        if(!linea.containsKey(numeroCuenta)){
            throw new SaldoInsuficienteException(" No existe la cuenta");
        }

        CuentaBancaria cuentaEncontrada = linea.get(numeroCuenta);
        try{
            cuentaEncontrada.retirar(monto);



        } catch(SaldoInsuficienteException e){
            System.out.println("Error " + e.getMessage());
        }






    }
}
