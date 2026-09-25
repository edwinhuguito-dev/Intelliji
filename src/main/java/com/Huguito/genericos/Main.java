package com.Huguito.genericos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//    public static <T> void printArray(T[] array){
//        for(T item : array){
//            System.out.println(item);
//        }
//    }
//
//
//
//
//    public static void main(String[] args){
//        String[] name = {"Jenny", "Liam"};
//        Integer[] num = {1, 2, 3, 4};
//
//
//        printArray(name);
//        printArray(num);
//
//    }









        // USAMOS UN ARRAY GENERICO DE INTEGER
        Integer[] intNums = {10, 20, 30, 40};
        Gene<Integer> im = new Gene<>(intNums);

        System.out.println(STR."Integer average: \{im.average()}");


        // USAMOS UN ARRAY GENERICO DE DOUBLE

        Double[] doubleNumb = {1.5, 2.5, 3.5, 4.5, 6.5};
        Gene<Double> dou = new Gene<>(doubleNumb);
        System.out.println(STR. "Double average: \{dou.average()}");

        System.out.println("**********************************************************");


        String texto = "Contacta a nuestro soporte en ayuda@huguito.com o al correo alternativo ventas123@tienda.net para más info.";

        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto);


        System.out.println("Correos encontrados");
        while(matcher.find()){
            System.out.println("- " + matcher.group());
        }

    }
}
