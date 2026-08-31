package com.Huguito.poo.problem15;

public class MainPersonaje {
    public static void main(String[] args){


        // Arma, Armadura, Habilidad, || inventario, objeto, pocion, || Arquero, Guerrero, Mago


        Arma arma1 = new Arma("Hacha", 2.5, 1, 20);
        Arma arma2 = new Arma("Flecha", 1.5, 1, 20);
        Arma arma3 = new Arma("Guantes", 0.5, 1, 20);

        Armadura armadura1 = new Armadura("Thor", 3.5, 2, 15);
        Armadura armadura2 = new Armadura("Robin", 1.5, 2, 15);
        Armadura armadura3 = new Armadura("Merlin", 1.5, 2, 15);

        Habilidad habilidad1 = new Habilidad("Meteoro Pegaso", 30, 10, 2, TipoHabilidad.FISICA);
        Habilidad habilidad2 = new Habilidad("FootWin", 20, 10, 2, TipoHabilidad.DISTANCIA);
        Habilidad habilidad3 = new Habilidad("Kamehame ha", 25, 10, 2, TipoHabilidad.MAGICA);

        Inventario inventario = new Inventario();

        Pocion pocion1 = new Pocion("Fuerza de toro", 0.2, 10, 40);
        Pocion pocion2 = new Pocion("Sabiduria genius", 0.2, 15, 30);
        Pocion pocion3 = new Pocion("Velocidad felina", 0.2, 20, 35);

        inventario.agregarObjeto(pocion1);
        inventario.agregarObjeto(pocion2);
        inventario.agregarObjeto(pocion3);





        Arquero arquero = new Arquero("Flechin", 2, 30,80, 100, 30, 80, 40, 70, 3, inventario,  EstadoPersonaje.NORMAL, 40,50);
        Guerrero guerrero = new Guerrero("Sanzon", 3, 50, 50,100, 40,100, 60, 90,2, inventario, EstadoPersonaje.NORMAL, 70,80);
        Mago mago = new Mago("Oscuro", 3,50, 40,100, 10, 100,80, 70,2, inventario, EstadoPersonaje.NORMAL,50,70);








        Combate combate = new Combate(arquero , guerrero);
        combate.inciarCombate();
        System.out.println(arquero.calcularPoderAtaque());

        //System.out.println(combate.inciarCombate());







    }
}
