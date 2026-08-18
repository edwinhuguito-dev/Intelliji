package com.Huguito.practica02;

public class Problema01 {


    private double ingreso ;
    private double salida ;
    private double actual;

    public Problema01(double ingreso, double salida, double actual) {
        this.ingreso = ingreso;
        this.salida = salida;
        this.actual = actual;
    }

    // controladores de las variables GETTER AND SETTER


    public boolean setIngreso(String ingresoUsuario) {
        try{
            double montoIngresado = Double.parseDouble(ingresoUsuario);
            if (!(montoIngresado > 0)) {
                System.out.println("El monto ingresado no es valido");
                return false;
            }
            this.ingreso = montoIngresado;
            this.actual += this.ingreso;
            System.out.println("Déposito exitoso. Su saldo actual es de: " + this.actual);
            return true;

        } catch (NumberFormatException e){
            System.out.println("Hay un error en el monto solicitado; vuelva a ingresar.");
            return false;
        }

    }

    public boolean getSalida(String salidaUsuario) {
        try {
            double montoRetiro = Double.parseDouble(salidaUsuario);
            if (!(montoRetiro > 0)) {
                System.out.println("El monto solicitado no es valido.");
                return false;
            }
            if (this.actual <= 0) {
                System.out.println("Su saldo esta en negativo, no puede hacer el retiro.");
                return false;
            } else if (this.actual < montoRetiro) {
                System.out.println("Su saldo es menor al monto requerido, retire un monto menor.");
                return false;
            } else {
                this.salida = montoRetiro;
                this.actual -= this.salida;
                System.out.println("Su monto solicitado es de: " + this.salida + " transacion exitosa.");
                return true;
            }

        } catch (NumberFormatException e) {
            System.out.println("El monto solicitado es incorrecto.");
            return false;
        }
    }



    public void getActual() {
        System.out.println("Su saldo actual es de: " + this.actual);
    }


}
