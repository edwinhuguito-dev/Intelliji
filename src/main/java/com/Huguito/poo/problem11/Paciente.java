package com.Huguito.poo.problem11;

import java.util.HashMap;

public class Paciente extends PersonaHospital{

    protected TipoSangre tipoSangre;
    protected HashMap<String, String> historialMedico;

    public Paciente(String dni, String nombre, int edad, TipoSangre tipoSangre) {
        super(dni, nombre, edad);
        this.tipoSangre = tipoSangre;
        this.historialMedico = new HashMap<>();
    }


    @Override
    void mostrarFicha() {
        System.out.println("Paciente " +
                "tipoSangre " + this.tipoSangre +
                ", historialMedico " + this.historialMedico +
                ", dni " + this.dni +
                ", nombre " + this.nombre +
                ", edad " + this.edad
        );


    }

    public void agregarDiagnostico(String codigoCita, String diagnostico){
        this.historialMedico.put(codigoCita,diagnostico);
    }


}
