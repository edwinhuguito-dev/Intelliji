package com.Huguito.practica01;

public class CajeroService {

    public String clave = "clave123";
    public int contador = 0;
    public String message = "Contraseña incorrecta.";

    public CajeroService() {
    }


    public boolean verificar(String inputUsuario) {

        contador ++;

        if(inputUsuario == null) {
            System.out.println("No puede quedar vacio el registro");
            return false;
        }

        if(!clave.equals(inputUsuario)) {
            System.out.println(message);
            return false;
        } else {
            System.out.println("Contraseña correcta.");
            return true;
        }
    }

    public void intentos (int contadorMain) {
        switch (contadorMain) {
            case 1:
                System.out.println("Te queda 2 intentos más.");
                break;
            case 2:
                System.out.println("Te queda 1 intento más.");
                break;
            case 3:
                System.out.println("Sistema cerrado.");
                break;
            default:

                break;
        }
    }






}
