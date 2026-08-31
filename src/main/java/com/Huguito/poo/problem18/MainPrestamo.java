package com.Huguito.poo.problem18;

public class MainPrestamo {
    public static void main(String[] args){
        Prestamoable prestaInmu = new PrestamoHipotecario("mu001", 0.001, 80000);
        Prestamoable prestaCarro = new PrestamoVehicular("car001", 2020, 30000);
        Prestamoable prestaPerso = new PrestamoPersonal("321654987","Las Sirenitas VIP", 2000);






        GestorPrestamo gestor = new GestorPrestamo();

        gestor.procesarSolicitud(prestaInmu, 1, 5000);
        System.out.println("**************************************************");
        gestor.procesarSolicitud(prestaCarro, 10, 3000);
        System.out.println("**************************************************");
        gestor.procesarSolicitud(prestaPerso,20, 500);

    }
}
