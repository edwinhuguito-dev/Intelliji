package com.Huguito.poo.problem17;

public class MainTransaccion {
    public static void main(String[] args){

        MetodoPago miBilletera1 = new BilleteraDigital("123456789", "HUguito");
        MetodoPago miBilletera2 = new TarjetaCredito("3216549873216548", "clave", 5,200.10);
        MetodoPago miBilletera3 = new TransferenciaBancaria("32165498798765432132", "LaGranEstafa");


        ProcesadorPagos pagos = new ProcesadorPagos();

        try{

            pagos.ejecutarPagos(miBilletera1, 50);
            System.out.println(STR. "La transaccion se realizo con exito \{EstadoTransaccion.APROBADO}" );

        } catch (TransaccionInvalidaException e){
            System.out.println("Error " + e.getMessage());
        }

    }
}
