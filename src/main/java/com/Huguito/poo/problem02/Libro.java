package com.Huguito.poo.problem02;

public class Libro extends ItemBi {

    protected String autor;
    protected int paginas;

    public Libro(String titulo, String coIden, String autor, int paginas) {
        super(titulo, coIden);
        this.autor = autor;
        this.paginas = paginas;
        this.prestado =false;
    }

    @Override
    void mostrarInfo() {
        System.out.println("El autor del libro " + super.titulo + " y su codigo es " + super.coIden +
                " y su autor es: " + this.autor +
                " y su numero de pagines es: " + this.paginas);
    }
}
