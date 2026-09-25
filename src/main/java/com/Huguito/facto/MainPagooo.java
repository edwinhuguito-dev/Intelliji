package com.Huguito.facto;

public class MainPagooo {
    public static void main(String[] args){
        ProcesadorPagoFactory tarje = new FactoryTarjeta();
        tarje.realizarCobro(350.29);


        ProcesadorPagoFactory pay = new FactoryPaypal();
        pay.realizarCobro(400.23);

    }
}
