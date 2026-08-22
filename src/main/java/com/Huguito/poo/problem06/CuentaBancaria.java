package com.Huguito.poo.problem06;

public abstract class CuentaBancaria {

    protected String numeroCuenta;
    protected String titular;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, String titular) {

        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0;
    }

    public double depositar(double monto){
        if(!(monto > 0)){
              throw new SaldoInsuficienteException("No puedes depositar un monto negativo");
        }
        this.saldo += monto;
        return this.saldo;
    }

    public String consultarSaldo(String numeroCuenta){
        return "Tu saldo actual es: " + this.saldo;
    }

    abstract void retirar(double retiro) throws SaldoInsuficienteException;
}
