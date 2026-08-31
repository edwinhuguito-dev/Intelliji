package com.Huguito.poo.problem10;

public class Estudiante extends MiembroPlataforma{

    protected String nivelAcademico;

    public Estudiante(String id, String nombre, String correo, String nivelAcademico) {
        super(id, nombre, correo);

        if(nivelAcademico.equals("Principiante") || nivelAcademico.equals("Avanzado")){
            this.nivelAcademico = nivelAcademico;
        } else {
            throw new InscripcionNoValidadException( "Los niveles son Principiante o Avanzado");
        }
    }



    @Override
    void mostrarDetalles() {
        System.out.println("Estudiante " +
                "nivelAcademico " + this.nivelAcademico +
                ", id " + this.id +
                ", nombre " + this.nombre +
                ", correo " + this.correo
        );
    }

    public void estudiar(){
        System.out.println("El estudiante " + this.nombre + " tiene un nivel academico " + this.nivelAcademico + " esta tomando clases");
    }

}
