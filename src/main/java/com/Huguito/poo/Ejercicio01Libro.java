package com.Huguito.poo;

public class Ejercicio01Libro {

    private String ISBN;
    private String titulo;
    private int paginaNum;
    private String autor;
    private boolean prestado;


    public Ejercicio01Libro(String ISBN, String titulo, int paginaNum, String autor, boolean prestado) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.paginaNum = paginaNum;
        this.autor = autor;
        this.prestado = prestado;
    }

    public double precioImpre(){
        return this.paginaNum * 0.75;
    }

    public String info(){
        double precio = precioImpre();

        String estadoPrestado = this.prestado ? "Esta prestado" : "No esta prestado";

        return "El libor " + this.ISBN + " con titulo " + this.titulo +
                " y autor " + this.autor + " tiene " + this.paginaNum +
                " paginas, " + estadoPrestado +
                ". El precio de impresion es: " + precio;
    }

}
