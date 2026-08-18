package com.Huguito.practica02;

public class Libro {

    private String ISBN;
    private String titulo;
    private  int paginas;
    private String autor;
    private boolean prestado;


    // CONSTRUCTOR VACIO
    public Libro (){

    }

    // CONSTRUCTOR CON DATOS
    public Libro(String ISBN, String titulo, int paginas, String autor, boolean prestado) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
        this.prestado = true;

    }

    // GETTER AND SETTER


    public boolean isPrestado(double precio){
        double coste = this.paginas * precio;
        if(!this.prestado) {
            System.out.println("El libro " + this.ISBN + " es "  + this.titulo + " y su autor es " + this.autor
            + " y tiene " + this.paginas + " páginas, y está prestado.");
            return false;
        } else {
            System.out.println("El libro " + this.ISBN + " es " + this.titulo + " y su autor es " + this.autor
                    + " y tiene " + this.paginas + " páginas, y NO está prestado.");
            System.out.println("El costes de imprimir el libro es: " + coste + " soles.");
            return true;
        }
    }
}
