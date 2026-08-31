package com.Huguito.poo.problem11;

public class MainHospital {
    public static void main(String[] args){

        HospitalSistema clini = new HospitalSistema();


        System.out.println("-------------- PACIENTES----------------");
        Paciente paci1 = new Paciente("11111111", "Huguito", 20, TipoSangre.A_NEGATIVO);
        Paciente paci2 = new Paciente("22222222", "Keiko", 30, TipoSangre.AB_POSITIVO);

        System.out.println("--------------DOCTORES----------------");
        Medico doc1 = new Medico("33333333", "Dr. Malito", 50, "Ginecologo");
        Medico doc2 = new Medico("44444444", "Dr. Buenito", 55, "Proctologo");

        System.out.println("--------------MEDICAMENTOS----------------");
        Medicamento cina1 = new Medicamento("medi001", "Pentron", 5.5, 500);
        Medicamento cina2 = new Medicamento("medi002", "PingaMicilina", 3.5, 100);

        System.out.println("-------------- INSTANCIAR CITAS ----------------");
        CitaMedica citas = new CitaMedica("cita001", paci1, doc1, "20/10/2026");




        System.out.println("--------------REGISTRAR PACIENTE----------------");
        clini.registrarPaciente(paci1);
        clini.registrarPaciente(paci2);

        System.out.println("--------------REGISTRAR MEDICO----------------");
        clini.registrarMedico(doc1);
        clini.registrarMedico(doc2);




        System.out.println("--------------REGISTRAR MEDICAMENTO----------------");
        clini.registrarMedicamento(cina1);
        clini.registrarMedicamento(cina2);


        System.out.println("-------------- AGENDAR CITA Y CONFIRMAR ----------------");
        clini.agendarCita("cita001", "11111111", "33333333", "20/10/2026");
        citas.confirmarCita();


        System.out.println("-------------- METODOS DE PRUEBA ----------------");
        doc1.realizarAtencion("11111111");
        doc1.emitirReceta("medi001", 5);
        paci1.agregarDiagnostico("cita001", "Mamahuevo");
        paci1.mostrarFicha();

        System.out.println("-------------- DESPACHAR MEDICAMENTO ----------------");

        clini.despacharRecetaMedicamento("medi001", 20);


        try{
            clini.agendarCita("cita001", "11111111", "33333333", "21/10/2026");



        } catch (HospitalException e) {
            System.out.println("Erro " + e.getMessage());
        }

        try{
            clini.despacharRecetaMedicamento("medi002", 500);



        } catch (HospitalException e) {
            System.out.println("Erro " + e.getMessage());
        }




    }


}
