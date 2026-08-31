package com.Huguito.poo.problem16;

public class Combate {


    public void round(Heroe player1, Heroe player2){
    System.out.println("=========== SE INICIA LA BATALLA POR SABER QUIEN ES MAS CHUPA PINGA ===========");
    while(player1.getVidaActual() > 0 && player2.getVidaActual() > 0){
        player1.atacar(player2);
        if(player2.getVidaActual() <= 0){
            break;
        }
        player2.atacar(player1);
        if(player1.getVidaActual() <= 0 || player2.getVidaActual() <= 0){
            break;
        }
    }
        Heroe win = (player1.getVidaActual() > 0 ? player1 : player2);
        System.out.println("========== FIN DE LA BATALLA ===========");
        System.out.println(STR."El heroe ganador es: \{win.getNombre()}");
    }

}
