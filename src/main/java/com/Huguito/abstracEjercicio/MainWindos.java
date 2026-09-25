package com.Huguito.abstracEjercicio;

import com.Huguito.abstracFactory.Fabrica;

public class MainWindos {
    private static FabricaUI configurarFabrica() {
        String os = System.getProperty("os.name", "Windows 11").toUpperCase();

        if (os.contains("WIN")) {
            return new FabricaWin();
        } else {
            return new FabricaMac();
        }

    }
    public static void main(String[] args){
        FabricaUI fabrica = configurarFabrica();

        Aplicacion app = new Aplicacion(fabrica);

        app.renderizarUI();

    }



}
