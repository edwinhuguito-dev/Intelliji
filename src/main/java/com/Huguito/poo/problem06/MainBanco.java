package com.Huguito.poo.problem06;

public class MainBanco {
    public static void main(String[] args){

        Banco banco = new Banco();
        CuentaAhorros ahorros = new CuentaAhorros("001", "Huguito");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("002", "Edu");



        banco.agregarCuenta(ahorros);

        banco.agregarCuenta(cuentaCorriente);

        ahorros.depositar(10000);
        cuentaCorriente.depositar(15000);

        banco.realizarRetiro("001",5000);


        banco.realizarRetiro("002", 5000);

        banco.realizarRetiro("0033", 500);


        ahorros.consultarSaldo("001");

        cuentaCorriente.consultarSaldo("002");




    }
}
