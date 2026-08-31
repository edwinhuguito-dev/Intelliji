package com.Huguito.poo.problem08;

public class MainHospital {
    public static void main(String[] args) {


        Hospital hospita = new Hospital();


        Medico doctor1 = new Medico("11111111", "Huguito", 30, "Proctologo");
        Paciente enfermo1 = new Paciente("22222222", "PorHuevon", 20, "Es un chupa pinga");
        Medico doctor02 = new Medico("33333333", "San putin", 32, "Ginecologo");
        Paciente enfermo2 = new Paciente("44444444", "Enfermito", 35, "Gripe");


        hospita.registrarMedico(doctor1);
        hospita.registrarMedico(doctor02);

        hospita.registrarPaciente(enfermo1);
        hospita.registrarPaciente(enfermo2);


        hospita.asignarCita("11111111", "22222222");
        hospita.asignarCita("11111111", "44444444");





    }

}
