package com.Huguito.poo.problem12;

public class MainLogistica {
    public static void main(String[] args) {
        CentroLogistico logi = new CentroLogistico();


        Producto prod1 = new Producto("pro001", "zapatillas", "Tacna", 1.5, 2000);
        Producto prod2 = new Producto("pro002", "planchas", "Areguipa", 2.3, 500);

        Transportista trans1 = new Transportista("tra001", "Huguito", "Tacna", "lice001", 2100);
        Transportista trans2 = new Transportista("tra002", "kenedy", "Arequipa", "lice002", 600);


        logi.registrarProducto(prod1);
        logi.registrarProducto(prod2);

        logi.registrarTransportista(trans1);
        logi.registrarTransportista(trans2);


        System.out.println("--------------------- PRUEBA EXITOSO --------------------------");

        try {
            // Envía 100 zapatillas (100 * 2.5 = 250 kg, que entra perfecto en los 2100 kg de trans1)
            logi.generarEnvio("guia001", "pro001", "tra001", 100, "Moquegua");

        } catch (LogisticaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n-------------- PRUEBA DE ERROR: SOBREPESO ----------------");
        try {
            // Intenta enviar 1000 zapatillas (1000 * 2.5 = 2500 kg, supera los 2100 kg de trans1 que ya está ocupado o excede capacidad)
            logi.generarEnvio("guia002", "pro001", "tra001", 1000, "Tacna");
        } catch (LogisticaException e) {
            System.out.println("Error capturado con éxito: " + e.getMessage());
        }

        System.out.println("\n-------------- PRUEBA DE ERROR: STOCK INSUFICIENTE ----------------");
        try {
            // Intenta pedir más de las 500 planchas disponibles
            logi.generarEnvio("guia003", "pro002", "tra002", 999, "Cusco");
        } catch (LogisticaException e) {
            System.out.println("Error capturado con éxito: " + e.getMessage());
        }

    }
}
