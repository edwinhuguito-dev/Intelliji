package com.Huguito.poo.problem01;

public class TarjetaCredito extends MetodoPago implements Transaccionable{

    public double limiteCredito;
    public double saldoActual;


    public TarjetaCredito(String titular, String indenty, double limiteCredito, double saldoActual) {
        super(titular, indenty);
        this.limiteCredito = limiteCredito;
        this.saldoActual = saldoActual;
    }

    @Override
    public void detalles() {
        System.out.println("La identidad es: " + super.indenty + " y su nombre es: " + super.titular);
    }

    @Override
    public boolean procesarPago(double monto) {

        if(!(monto < limiteCredito && monto < saldoActual)){
            throw new FondoInsuficiente("No tienes limite de credito");
        }
        saldoActual -= monto;
        return true;
    }


}
