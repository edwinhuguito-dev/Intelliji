package com.Huguito.poo.problem17;

public class Transaccion {
    private final String idTransaccion;
    private final double montoBase;
    private EstadoTransaccion estado;
    private final Cliente cliente;

    public Transaccion(String idTransaccion, double montoBase, EstadoTransaccion estado, Cliente cliente) {
        this.idTransaccion = idTransaccion;
        this.montoBase = montoBase;
        this.estado = EstadoTransaccion.PENDIENTE;
        this.cliente = cliente;
    }

    public void aprobar(){
        if(this.estado != EstadoTransaccion.PENDIENTE){
            throw new TransaccionInvalidaException("Solo se puede aprobar transacciones pendientes");
        }
        this.estado = EstadoTransaccion.APROBADO;
    }

    public void rechazar(){
        if(this.estado != EstadoTransaccion.PENDIENTE){
            throw new TransaccionInvalidaException("Solo se puede rechazar transacciones pendientes");
        }
        this.estado = EstadoTransaccion.RECHAZADO;
    }

    public String getIdTransaccion(){return idTransaccion;}
    public double getMontoBase(){return montoBase;}
    public EstadoTransaccion getEstado(){return estado;}
    public Cliente getCliente(){return cliente;}


}
