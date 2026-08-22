package com.Huguito.poo.problem06;

public class CuentaAhorros extends CuentaBancaria{


    public CuentaAhorros(String numeroCuenta, String titular) {
        super(numeroCuenta, titular);
    }

    @Override
    void retirar(double retiro) throws SaldoInsuficienteException {
        if(retiro > super.saldo){
            throw new SaldoInsuficienteException("No puedes retirar un monto mayor al saldo");
        }
        super.saldo -= retiro;
    }
}
