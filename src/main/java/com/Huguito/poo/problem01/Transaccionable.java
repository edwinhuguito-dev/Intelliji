package com.Huguito.poo.problem01;

public interface Transaccionable {

    String MONEDA = "USD";

    boolean procesarPago(double monto);

}
