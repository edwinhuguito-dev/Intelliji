package com.Huguito.poo.problem12;

public class GuiaRemision implements Rastreable{

    protected String numeroGuia;
    protected Producto producto;
    protected Transportista transportista;
    protected int cantidadEnviadad;
    protected EstadoEnvio estado;
    protected String destino;

    public GuiaRemision(String numeroGuia, Producto producto, Transportista transportista, int cantidadEnviadad, String destino) {
        this.numeroGuia = numeroGuia;
        this.producto = producto;
        this.transportista = transportista;
        this.cantidadEnviadad = cantidadEnviadad;
        this.estado = EstadoEnvio.CREADO;
        this.destino = destino;
    }

    @Override
    public String obtenerUbicacionActual() {
        return "La ubicacion actual es " + this.estado;
    }

    void despacharGuia(){



        this.estado = EstadoEnvio.EN_TRANSITO;

        System.out.println("Se despacho la guia " + this.estado);

    }


}
