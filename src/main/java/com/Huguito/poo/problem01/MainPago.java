package com.Huguito.poo.problem01;

public class MainPago {
    public static void main(String[] args){
        MetodoPago[] pagos = {
                new TarjetaCredito("Huguito", "45646", 1000.0, 500.0),
                new Paypal("Huguito2", "5416541", "Huguiot@gampi.com", 500.0)
        };

        for(MetodoPago metodo : pagos) {
            System.out.println("----- Procesando pago " + metodo.titular + "-----");
            metodo.detalles();

            try{
                Transaccionable transaccion = (Transaccionable) metodo;
                boolean resultado  = transaccion.procesarPago(50.0);


                if(resultado){
                    System.out.println("Pago exitosocon " + Transaccionable.MONEDA);
                }


            } catch (FondoInsuficiente e){
                System.out.println("Error transacion: " + e.getMessage());
            }
            System.out.println();
        }

    }
}
