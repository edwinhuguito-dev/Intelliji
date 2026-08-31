package com.Huguito.poo.problem10;

import java.util.HashMap;

public class Curso implements Evaluable{

    protected String codigo;
    protected String titulo;
    protected double precio;
    protected int cuposMaxi;

    protected HashMap<String, Estudiante> alumnosInscritos;

    public Curso(String codigo, String titulo, double precio, int cuposMaxi){
        this.codigo = codigo;
        this.titulo = titulo;
        this.precio = precio;
        this.cuposMaxi = cuposMaxi;
        this.alumnosInscritos = new HashMap<>();
    }


    public void mostrarInfoCurso(){
        System.out.println("Curso " +
                "codigo " + this.codigo +
                ", titulo " + this.titulo +
                ", precio " + this.precio +
                ", cuposMaxi " + this.cuposMaxi +
                ", alumnosInscritos " + this.alumnosInscritos
        );
    }

    @Override
    public void evaluarAlumno(String idAlumno, double nota) {

        if(!(nota >= 0 && nota <= 20)){
            throw new InscripcionNoValidadException("La nota de calificacion debe ser entre 0 y 20");
        }
        double cali = nota;

        Estudiante ide = this.alumnosInscritos.get(idAlumno);

        if(ide == null){
            throw new InscripcionNoValidadException("El ID del alumno no existe");
        }
        System.out.println("El alumno " + this.codigo + " tiene una calificacion de " + cali);
    }
}
