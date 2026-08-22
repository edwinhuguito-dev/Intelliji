package com.Huguito.poo.problem06;

public class CuentaCorriente extends CuentaBancaria{


    public CuentaCorriente(String numeroCuenta, String titular) {
        super(numeroCuenta, titular);
    }






    @Override
    void retirar(double retiro) throws SaldoInsuficienteException {
        double limite = super.saldo + (super.saldo * 0.20);

        if(!(retiro < limite)){
            throw new SaldoInsuficienteException("No puedes retirar un monto mayor al saldo");
        }
        if(retiro > super.saldo && retiro < limite){
            super.saldo -= retiro;
            System.out.println("Su saldo es: " + super.saldo + " y tiene un limite de. " + limite);
        }


        System.out.println("Retiro exitoso su saldo es: " + super.saldo);
    }


}
