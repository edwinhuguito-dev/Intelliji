package com.Huguito.poo.problem08;

public class Medico extends Persona{

    protected String especialidad;
    protected boolean disponible;

    public Medico(String dni, String nombre, int edad, String especialidad) {
        super(dni, nombre, edad);
        this.especialidad = especialidad;
        this.disponible = true;
    }


    public void realizarDiagnostico(){
        System.out.println("El medico " + this.nombre +
                " especialista en " + this.especialidad +
                " esta atendiendo al paciente "  );
    }


    @Override
    void mostrarDatosPersona() {
        System.out.println("Medico " +
                "especialidad " + this.especialidad +
                ", disponible " + this.disponible +
                ", dni " + this.dni +
                ", nombre " + this.nombre +
                ", edad " + this.edad
                );
    }
}
