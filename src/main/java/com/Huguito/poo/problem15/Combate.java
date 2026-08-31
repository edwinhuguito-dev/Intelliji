package com.Huguito.poo.problem15;

public class Combate {

    private Personaje atacante;
    private Personaje defensor;

    public Combate(Personaje atacante, Personaje defensor) {
        this.atacante = atacante;
        this.defensor = defensor;
    }





    public int calcularDano(Personaje agresor, Personaje receptor){
        int danoBruto = agresor.getPoder() - receptor.getDefensa();
        return Math.max(5, danoBruto);
    }


    public void atacar(Personaje agresor, Personaje receptor){
        int danoAgresor = calcularDano(agresor, receptor);
        int danoReceptor = calcularDano(receptor, agresor);

        receptor.recibirDano(danoAgresor);
        agresor.recibirDano(danoReceptor);

        System.out.println(agresor.getNombre() + " y " + receptor.getNombre() + " se estan sacando la mierda");
    }

    public void inciarCombate(){
        System.out.println("COMIENZA LA BRAN BATALLA ");
        while(atacante.getVidaActual() > 0 && defensor.getVidaActual() > 0){
            System.out.println(atacante.getVidaActual() +  " || "  + defensor.getVidaActual());
            atacar(atacante, defensor);
            if(atacante.getVidaActual() <= 0 || defensor.getVidaActual() <= 0){
                break;
            }

        }




        finalizarCombate();
    }

    public void finalizarCombate(){
        Personaje gana = atacante.getVidaActual() > 0 ? atacante : defensor;
        Personaje perde = gana == atacante ? defensor : atacante;

        System.out.println("--------- FIN DEL COMBATE -------------");
        System.out.println("El ganador es: " + gana.getNombre());
        gana.ganarExperiencia(50);

    }



}
