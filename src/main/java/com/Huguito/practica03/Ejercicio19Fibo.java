package com.Huguito.practica03;

public class Ejercicio19Fibo {

    private int num;


    public Ejercicio19Fibo(int num) {
        this.num = num;
    }


    public int fibona(){

        if(!(this.num > 1)){
            System.out.println("Tiene que ingresar un munero mayor o igual a 1");
            return -1;
        }

        int a = 1;
        int b = 1;
        int resul = 0;

        for(int i = 1; i < this.num; i++){

            resul = a + b; // 2 | 3 | 5 | 8 | 13 | 21 | 34 |
            a = b; //         1 | 2 | 3 | 5 | 8  | 13 | 21 |
            b = resul; //     2 | 3 | 5 | 8 | 13 | 21 | 34
        }
        return resul;

    }

}
