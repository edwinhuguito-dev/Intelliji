package com.Huguito.poo.problem10;

import java.util.HashMap;

public class PlataformaEducativa {

    protected HashMap<String, Curso> catalogoCurso;
    protected HashMap<String, Instructor> instructores;
    protected HashMap<String, Estudiante> estudiantes;

    public PlataformaEducativa(){
        this.catalogoCurso = new HashMap<>();
        this.instructores = new HashMap<>();
        this.estudiantes = new HashMap<>();
    }


    public void registrarInstructor(Instructor instructor){
        this.instructores.put(instructor.id, instructor);
    }

    public void registrarEstudiante(Estudiante estudiante){

        this.estudiantes.put(estudiante.id, estudiante);
    }

    public void crearCurso(Curso curso){

        this.catalogoCurso.put(curso.codigo, curso);
    }

    public void inscripcion(String idEstudiante, String codigoCurso){

        Estudiante estu = this.estudiantes.get(idEstudiante);
        if(estu == null){
            throw new InscripcionNoValidadException("El estudiante con codigo " + idEstudiante + " no existe");
        }

        Curso cata = this.catalogoCurso.get(codigoCurso);
        if(cata == null){
            throw new InscripcionNoValidadException("El curso " + codigoCurso + " no existe");
        }

        if(cata.cuposMaxi <= cata.alumnosInscritos.size()){
            throw new InscripcionNoValidadException("El curso " + cata.titulo + " esta lleno");
        }

        if(cata.alumnosInscritos.containsKey(idEstudiante)){
            throw new InscripcionNoValidadException("El alumno ya esta inscrito");
        }


        cata.alumnosInscritos.put(estu.id, estu);
        System.out.println("Inscripcion exitosa " + estu.nombre);

    }











}
