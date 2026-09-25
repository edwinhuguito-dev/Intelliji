package com.Huguito.w3schoolsTutorial;

public class Factorial {
    public static void main(String[] args){

        int n = 7;
        int fact = 1;

        for(int i = 1; i <= n; i++){
            System.out.println("valor: " + i);
            fact *= i;
            System.out.println(fact);
        }

        System.out.println("************************************************");


        for(int i = 0; i < 10; i++){
            if(i == 4){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("************************************************");


        for(int i = 0; i < 6; i++){
            if(i == 2){
                continue;
            }
            if(i == 4){
                break;
            }

            System.out.println(i);

        }

        System.out.println("************************************************");

        int i = 0;
        while (i < 10){
            if (i == 4){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);
        System.out.println(cars[0]);


        String[] car = new String[4];
        car[0] = "Volvo";
        car[1] = "BMW";
        car[2] = "Ford";
        car[3] = "Mazda";

        System.out.println(car[2]);


        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;
        int longitud = ages.length;

        for(int age : ages){
            sum += age;
        }

        avg = sum / longitud;

        System.out.println("The avergae age is: " + avg);


        int edad[] = {20,22,18,35, 48,26,87,70};

        int longi = edad.length;

        int edadMenor = edad[0];

        for(int num : edad){
            if(edadMenor > num){
                edadMenor = num;
            }
        }

        System.out.println("La edad menor es: " + edadMenor);


        int[] numbi = {45, 12, 98, 33, 27};

        int max = numbi[0];
        int min = numbi[0];

        for (int y : numbi){
            if(y > max){
                max = y;
            }
            if(y < min){
                min = y;
            }
        }
        System.out.println("max " + max);
        System.out.println("Min " + min);




        int[][] myNumbers = {{1,4,2},{3,6,8,5,2}};

        for (int fila = 0;  fila < myNumbers.length; fila++){
            for (int columna = 0; columna < myNumbers[fila].length; columna++){

                System.out.println("myNumbers [" + fila + "] [" + fila + "] = " + myNumbers[fila][columna]);


            }
        }



        int[][] myNumb = {{1,4,2},{3,6,8,5,2}};
        for(int[] row : myNumb){
            for(int num : row){
                System.out.println(num);
            }
        }










    }
}
