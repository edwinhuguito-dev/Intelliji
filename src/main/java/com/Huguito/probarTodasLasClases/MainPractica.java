package com.Huguito.probarTodasLasClases;

import java.util.Locale;
import java.util.Scanner;

public class MainPractica{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una talla: MINI, MEDIANA, GRANDE, MUY_GRANE");

        String entradaDatos = entrada.next().toUpperCase();

        Tallas latalla = Enum.valueOf(Tallas.class, entradaDatos);

        System.out.println("La talla es: " + latalla);

        System.out.println("Abreviatura: " + latalla.getAbreviatura());















    }

}