package com.Huguito.poo.problem11;

public class Medico extends PersonaHospital implements AtencionMedica{

    protected String especialidad;
    protected boolean disponible;

    public Medico(String dni, String nombre, int edad, String especialidad) {
        super(dni, nombre, edad);
        this.especialidad = especialidad;
        this.disponible = true;
    }

    @Override
    public void realizarAtencion(String idPaciente) {
        System.out.println("El especialista " + this.especialidad + " esta atendiendo al paciente " + idPaciente);
    }


    @Override
    void mostrarFicha() {
        System.out.println( "Medico " +
                "especialidad " + this.especialidad +
                ", disponible " + this.disponible +
                ", dni " + this.dni +
                ", nombre " + this.nombre +
                ", edad " + this.edad
        );
    }

    public void emitirReceta(String medicamento, int cantidad){
        System.out.println("La receta es " + medicamento + " la cantidad es " + cantidad);
    }

}
