package com.Huguito.probarTodasLasClases;

public enum Tallas {

    MINI("s"),
    MEDIANA("m"),
    GRANDE("."),
    MUY_GRANDE("xl");

   Tallas(String letra) {

       this.valor = letra;

   }

    private String valor;

   public String getAbreviatura() {
       return valor;
   }


}
