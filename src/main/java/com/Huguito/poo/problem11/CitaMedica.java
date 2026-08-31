package com.Huguito.poo.problem11;

public class CitaMedica {

    protected String codigoCita;
    protected Paciente paciente;
    protected Medico medico;
    protected String fecha;
    protected EstadoCita estado;

    public CitaMedica(String codigoCita, Paciente paciente, Medico medico, String fecha) {
        this.codigoCita = codigoCita;
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.estado = EstadoCita.PROGRAMADA;
    }

    public void confirmarCita(){
        this.estado = EstadoCita.ATENDIDA;
    }


}
