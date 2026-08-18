package com.Huguito.empleado;

public class EmpleadoMain {
    public static void main(String[] args) {

        Empleado sirviente1 = new Empleado("Goku", 2530.5, 2026,2,50);

        Empleado sirviente2 = new Empleado("Freezer", 1530.5, 2024,3,40);

        Empleado sirviente3 = new Empleado("vegeta", 3530.5, 2023,5,60);

        Empleado sirviente4 = new Empleado("Antonio Fernandez");

        sirviente1.subirSueldo(5);
        sirviente2.subirSueldo(5);
        sirviente3.subirSueldo(5);
        sirviente4.subirSueldo(5);


        System.out.println("Nombre: " + sirviente1.getNombre() +
                " sueldo " + sirviente1.getSalario() + " Fecha alta " +
                sirviente1.getAltaContrato());

        System.out.println("Nombre: " + sirviente2.getNombre() +
                " sueldo " + sirviente2.getSalario() + " Fecha alta " +
                sirviente2 .getAltaContrato());

        System.out.println("Nombre: " + sirviente3.getNombre() +
                " sueldo " + sirviente3.getSalario() + " Fecha alta " +
                sirviente3.getAltaContrato());


        System.out.println(sirviente4.getSalario());



    }
}
