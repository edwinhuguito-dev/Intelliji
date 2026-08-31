package com.Huguito.poo.problem10;

public class MainPlataforma {
    public static void main(String[] args){

        PlataformaEducativa cole = new PlataformaEducativa();

        Instructor profe = new Instructor("profe001", "Huguito", "meChupaLaPinga@tuMamaCalata.com", "Matematica");
        Estudiante estu = new Estudiante("estu001", "Pinchunlong", "tucorreo@mai.com", "Principiante");
        Curso materia = new Curso("cur001", "Lengua2", 300, 30);

        System.out.println("--------PROFESORR----------");
        profe.dictarClases();
        System.out.println("--------PROFESORR DETALLES----------");
        profe.mostrarDetalles();

        System.out.println("--------ESTUDIANTE DETALLES----------");
        estu.mostrarDetalles();
        System.out.println("--------ESTUDIAR----------");
        estu.estudiar();


        System.out.println("--------REGISTRAR PROFE----------");
        cole.registrarInstructor(profe);
        System.out.println("--------REGISTRAR ESTUDIANTE----------");
        cole.registrarEstudiante(estu);
        System.out.println("--------CREAR CURSO----------");
        cole.crearCurso(materia);



        System.out.println("--------INFO CURSO----------");
        materia.mostrarInfoCurso();



        try{

            System.out.println("--------INSCRIBIR UN ESTUDIANTE AL CURSO----------");
            cole.inscripcion("estu001", "cur001");
            materia.evaluarAlumno("estu001", 18.5);


        } catch (InscripcionNoValidadException e){
            System.out.println("Error" + e.getMessage());
        }


        try{
            System.out.println("--------VOLVER A INSCRIBIR AL MISMO ALUMNO----------");
            cole.inscripcion("estu001", "cur001");



        } catch (InscripcionNoValidadException e){
            System.out.println("Error" + e.getMessage());
        }




    }

}
