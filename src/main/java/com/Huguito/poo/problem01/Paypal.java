package com.Huguito.poo.problem01;

public class Paypal extends MetodoPago implements Transaccionable{

    public String mail;
    public double fondos;

    public Paypal(String titular, String indenty, String mail, double fondos) {
        super(titular, indenty);
        this.mail = mail;
        this.fondos = fondos;

    }

    @Override
    public void detalles() {
        System.out.println("La identidad es: " + super.indenty + " y su nombre es: " + super.titular);
    }

    @Override
    public boolean procesarPago(double monto) {

        if(!(monto < fondos)){
            throw new FondoInsuficiente("No tienes fondos en Paypal");
        }
        fondos -= monto;
        return true;
    }
}
