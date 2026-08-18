package com.Huguito.practica03;

import java.util.Scanner;

public class Ejercicio01Nombre {

    public void saludar() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escribe tu nombre: ");
    String nombre = scanner.nextLine();
    System.out.println("Hola como estas "+nombre);
    scanner.close();

    }
}
