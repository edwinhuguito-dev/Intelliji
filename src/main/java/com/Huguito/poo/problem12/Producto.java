package com.Huguito.poo.problem12;

public class Producto extends RecursoLogistico{

    protected double pesoKg;
    protected int stockAlmacen;

    public Producto(String codigoId, String nombre, String region, double pesoKg, int stockAlmacen) {
        super(codigoId, nombre, region);
        this.pesoKg = pesoKg;
        this.stockAlmacen = stockAlmacen;

    }



    @Override
    void mostrarFichaTecnica() {
        System.out.println("Producto " +
                "pesoKg " + this.pesoKg +
                ", stockAlmacen " + this.stockAlmacen +
                ", codigoId " + this.codigoId +
                ", nombre " + this.nombre +
                ", region " + this.region
                );

    }

    public void actualizarStock(int cantidadCambio){

         this.stockAlmacen -= cantidadCambio;

        System.out.println("stock actualizado " + this.stockAlmacen);
    }

}
