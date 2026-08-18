package com.Huguito.practica01;

public class Miperrito {


        private String nombre;
        private String especie;
        private int edad;

        public Miperrito(String nombre, String especie, int edad) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
        }


        public String mostrarInfo(){

            return "el nombre es: " + this.nombre + " y su especie es: " + this.especie;
        }

        public int cumplirAnos(){
            return this.edad;
        }




}
