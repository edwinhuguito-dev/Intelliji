package com.Huguito.poo.problem08;

public class Paciente extends Persona{

    protected String historialMedico;

    public Paciente(String dni, String nombre, int edad, String historialMedico) {
        super(dni, nombre, edad);
        this.historialMedico = historialMedico;
    }



    @Override
    void mostrarDatosPersona() {
        System.out.println("Paciente " +
                "historialMedico " + this.historialMedico +
                ", dni " + this.dni +
                ", nombre " + this.nombre +
                ", edad " + this.edad
        );
    }
}
