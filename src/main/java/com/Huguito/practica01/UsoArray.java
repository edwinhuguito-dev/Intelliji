package com.Huguito.practica01;

public class UsoArray {
    public static void main(String[] args) {


        int[] miArray = new int[5];

        miArray[0] = 5;
        miArray[1] = 15;
        miArray[2] = 51;
        miArray[3] = 53;
        miArray[4] = 95;



//        System.out.println(miArray[0]);
//        System.out.println(miArray[1]);
//        System.out.println(miArray[2]);
//        System.out.println(miArray[3]);
//        System.out.println(miArray[4]);

        for(int i = 0; i < miArray.length; i++){
            System.out.println("Valor del indice: " + i + " Es igual a: " + miArray[i]);
        }




    }

}
