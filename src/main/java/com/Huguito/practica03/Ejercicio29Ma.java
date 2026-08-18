package com.Huguito.practica03;

import java.util.Scanner;

public class Ejercicio29Ma {

    private char[][] hu;
    private char espacio;
    private char x;


    int y = 3;
    int equis = 3;


    //   y[00][01][02][03][04]
    //   y[10][11][12][13][14]
    //   y[20][21][22][23][24]
    //   y[30][31][32][33][34]
    //   y[40][41][42][43][44]
    //     xxxxxxxxxxxx



    public Ejercicio29Ma() {
        this.hu = new char[5][5];
        this.x = 'X';
        this.espacio = '@';


    }

    public void bus(){

        for(int i = 0; i < this.hu.length; i++){
            for(int j = 0; j < this.hu[i].length; j++){

                this.hu[i][j] = this.espacio;
            }
        }
        this.hu[y][equis] = this.x;
    }

    public void mt(){
        for(int i = 0; i < this.hu.length; i++){
            for(int j = 0; j < this.hu[i].length; j++){

                System.out.print("[" + this.hu[i][j] + "] ");
                if(i == 5){
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }

    public String move(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa 'derecha', 'izquierda', 'arriba', 'abajo'");
        String inpu = scanner.nextLine();

        if(y >= 0 && y < 5 && equis >= 0 && equis < 5){

            if(inpu.equals("derecha") && equis < 4){
                this.hu[y][equis] = this.espacio;
                equis ++;
                this.hu[y][equis] = this.x;
                return "Movimiento exitoso a la derecha";
            }

            if(inpu.equals("izquierda") && equis > 0){
                this.hu[y][equis] = this.espacio;
                equis --;
                this.hu[y][equis] = this.x;
                return "Movimiento exitoso a la izquierda";
            }

            if(inpu.equals("arriba") && y > 0){
                this.hu[y][equis] = this.espacio;
                y --;
                this.hu[y][equis] = this.x;
                return "Movimiento exitoso hacia arriba";
            }

            if(inpu.equals("abajo") && y < 4){
                this.hu[y][equis] = this.espacio;
                y ++;
                this.hu[y][equis] = this.x;
                return "Movimiento exitoso hacia abajo";
            }
            return "Movimiento invalido";
        }
        return "Error: fuera de limites";
    }
}
