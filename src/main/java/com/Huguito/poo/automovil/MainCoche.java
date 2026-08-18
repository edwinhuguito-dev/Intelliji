package com.Huguito.poo.automovil;

public class MainCoche {
    public static void main(String[] args){

        Vehiculo ve = new Vehiculo("TOYOTA", "4x4");
        Coche co = new Coche("NISSAN", "pickup", 4);
        Moto mo = new Moto("HONDA", "xxx", 0, false);
        Carrera ca = new Carrera("FORMULA1", "dunlo", 1, true);


        System.out.println(ve);
        System.out.println(co);
        System.out.println(mo);
        System.out.println(ca);




    }

}
