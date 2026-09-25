package com.Huguito.lambdas;

public class Main {
    public static void main(String[] args){


    }

    public static void printFormatted(String sss, StringFunction forms){
        String result = forms.run(sss);
        System.out.println(result);
    }

}
