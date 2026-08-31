package com.Huguito.poo.problem12;

import java.util.HashMap;

public class CentroLogistico {

    protected HashMap<String, Producto>inventarioGeneral;
    protected HashMap<String, Transportista>flotaTransporte;
    protected HashMap<String, GuiaRemision>registroEnvios;


    public CentroLogistico(){
        this.inventarioGeneral = new HashMap<>();
        this.flotaTransporte = new HashMap<>();
        this.registroEnvios = new HashMap<>();
    }

    public void registrarProducto(Producto producto){
        this.inventarioGeneral.put(producto.codigoId, producto);
    }
    public void registrarTransportista(Transportista transportista){
        this.flotaTransporte.put(transportista.codigoId, transportista);
    }
    public void generarEnvio(String numeroGuia, String codigoProducto, String idTransportista, int cantidad, String destino){
        Producto pro = this.inventarioGeneral.get(codigoProducto);
        if(pro == null){
            throw new LogisticaException("El producto con id "+ codigoProducto + " no existe");
        }
        if(pro.stockAlmacen < cantidad){
            throw new LogisticaException("No hay suficiente stock");
        }
        Transportista chofe = this.flotaTransporte.get(idTransportista);
        if(chofe == null || !chofe.disponible){
            throw new LogisticaException("No se puede iniciar el transporte poque el conductor no esta disponible o no hay chofer");
        }
        if((pro.pesoKg * cantidad) > chofe.capacidadMaxKg){
            throw new LogisticaException("No puedes transportar un peso mayor a la capacidad del vehiculo");
        }

        pro.actualizarStock(cantidad);
        chofe.disponible = false;
        chofe.asignarRuta(destino);
        GuiaRemision guia = new GuiaRemision("guia001", pro, chofe, 200, destino);

        this.registroEnvios.put(guia.numeroGuia, guia);
        guia.despacharGuia();
        System.out.println("El envio del pedido se envio correctamente");
    }


}
