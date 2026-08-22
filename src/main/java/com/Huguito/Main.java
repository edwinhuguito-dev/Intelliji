package com.Huguito;


import com.Huguito.poo.problem02.ItemNoDisponibleException;
import com.Huguito.practica01.Miperrito;
import com.Huguito.practica01.Persona;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu edad.");
        int edad = entrada.nextInt();

        SwichEdad objetoClaseSwich = new SwichEdad();
        String miEdad = objetoClaseSwich.evaluarEdad(20);

        System.out.println(miEdad);

        entrada.close();



        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu edad.");
        int edad = entrada.nextInt();


        CineService objetoCineService = new CineService();
        double precioFinal = objetoCineService.calcularPrecioBoleto(edad);

        System.out.println("El precio de tu boleto es: " + precioFinal);
        entrada.close();



        String clave = "Lunes";
        String pass = "";

        while(clave.equals(pass) == false){
            pass = JOptionPane.showInputDialog("Ingresar clave");
            UsoWhile objeto1 = new UsoWhile();
            String respuesta1 = objeto1.bucle1();
            System.out.println(respuesta1);
        }
        UsoWhile objeto2 = new UsoWhile();
        String respuesta2 = objeto2.bucle2();
        System.out.println(respuesta2);




        String clave = "Lunes";
        String pass = "";

        UsoWhile validator = new UsoWhile();

        while(!clave.equals(pass)) {
            pass = JOptionPane.showInputDialog("Ingresar Clave");

            if(!clave.equals(pass)) {
                System.out.println(validator.bucle1());
            }
        }

        System.out.println(validator.bucle2());




        int numeroRandom = (int) (Math.random() * 100) + 1;
        int numeroUsuario = 0;
        int contador = 0;

        // 2. Instanciamos nuestro servicio una sola vez
        NumeroAleatorio juego = new NumeroAleatorio();

        // 3. Usamos un while porque no sabemos cuántos intentos tomará
        while (numeroUsuario != numeroRandom) {
            // Pedimos el número y lo convertimos a entero
            String input = JOptionPane.showInputDialog("Adivina un número del 1 al 100:");

            // Si el usuario presiona cancelar, salimos para evitar errores
            if (input == null) {
                break;
            }

            numeroUsuario = Integer.parseInt(input);
            contador++; // Sumamos un intento por cada jugada

            // Evaluamos y utilizamos los métodos de tu servicio
            if (numeroUsuario < numeroRandom) {
                System.out.println(juego.mas());
            } else if (numeroUsuario > numeroRandom) {
                System.out.println(juego.menos());
            } else {
                System.out.println(juego.correcto() + contador + " intentos.");
            }


        }


        double alturaUsuario = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingresa tu talla."));
        String generoUsuario = JOptionPane.showInputDialog("Ingresa tu genero, por favor.");

        PesoPersona pesoPersona = new PesoPersona(generoUsuario, alturaUsuario);

        double resultado = pesoPersona.calcularPesoIdeal();


        JOptionPane.showMessageDialog(null,"Genero: " + pesoPersona.getGenero() + " altura: " +
                pesoPersona.getAltura() + " y su peso ideal es: " + resultado);



        Scanner scanner = new Scanner(System.in);
        CajeroService cajeroService = new CajeroService();

        while(cajeroService.contador < 3) {


            System.out.println("Ingresa tu contraseña, por favor.");
            String inputUsuario = scanner.nextLine();
            boolean accesoConcedido = cajeroService.verificar(inputUsuario);

            if (accesoConcedido) {
                System.out.println("¡Bienvenido al sistema!");
                break;
            } else {
                cajeroService.intentos(cajeroService.contador);
            }
        }

        scanner.close();



        int inputUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero."));


        // creamos el objeto

        UsoFactorial usoFactorial = new UsoFactorial(inputUsuario);



        System.out.println("El factorial de " + inputUsuario + " es: " + usoFactorial.factorial());





            try {
                Empresa empresa = new Empresa("123", "empresal");

                Empleado empleado1 = new Empleado("3216541","Huguito", 20, Departamento.CONTABILIDAD, true, empresa);
                Empleado empleado2 = new Empleado("321sdf6541","juan", 25, Departamento.INFORMATICA, false, empresa);

                System.out.println("Sueldo empleado 1: " + empleado1.calcularSueldo());
                System.out.println("Sueldo empleado 2: " + empleado2.calcularSueldo());

                Empleado.setSalarioBase(2000);
                System.out.println("Sueldo empleado 1: " + empleado1.calcularSueldo());
                System.out.println("Sueldo empleado 2: " + empleado2.calcularSueldo());

            } catch (Exception e) { // <-- Aquí cambiamos IllegalArgumentException por Exception
                System.out.println("Ocurrió un error: " + e.getMessage());
            }




        int numb1 = 50;
        int numb2 = 10;

        double numb3 = 3.5;
        double numb4 = 5.9;

        String text1 = "Hola como estas";
        String text2 = "Soy Huguito";
        String text3 = "Ya es de noche";

        String textonum = "El mas pendejo de la muni";


        textonum.getBytes();

        System.out.println(numb1);







//        Miperrito pe = new Miperrito("Huguito", "fino", 30);
//
//        System.out.println(pe.mostrarInfo());
//        System.out.println(pe.mostrarInfo());        System.out.println(pe.mostrarInfo());
//        System.out.println(pe.mostrarInfo());        System.out.println(pe.mostrarInfo());        System.out.println(pe.mostrarInfo());        System.out.println(pe.mostrarInfo());        System.out.println(pe.mostrarInfo());        System.out.println(pe.mostrarInfo());




//      sintaxis de un array es: tipoDeDato[] nombre =  new tipoDeDato[10]; ese 10 indica el numoero
//      elementos que va a tener ese array



//        miArray[0] = 15;     int[] miArray = {15, 25, 8, -7, 92};
//        miArray[1] = 25;
//        miArray[2] = 8;
//        miArray[3] = -7;
//        miArray[4] = 92;



//        List<Persona> listaArray = new LinkedList<Persona>();
//        listaArray.add(new Persona(2, "Huguito", 20));
//        listaArray.add(new Persona(3, "Putin", 40));
//        listaArray.add(new Persona(4, "Goku", 10));
//        listaArray.add(new Persona(1, "luisina", 30));
//
//
//
//        LinkedList<Persona> linstaLinked = new LinkedList<Persona>();
//        linstaLinked.add(new Persona(1, "luisina", 30));
//        linstaLinked.add(new Persona(2, "Huguito", 20));
//        linstaLinked.add(new Persona(3, "Putin", 40));
//        linstaLinked.add(new Persona(4, "Goku", 10));
//
//
//        listaArray.remove(1);
//
//
//        String nombreBorrar = "luisina";
//        for(Persona persona2 : linstaLinked){
//            if(persona2.getNombre().equals(nombreBorrar)){
//                linstaLinked.remove(persona2);
//                break;
//            }
//        }
//
//
//        for(Persona persona : listaArray){
//            System.out.println("Prueba " + persona.getNombre());
//        }
//
//        System.out.println("************************");
//
//        for(Persona persona : linstaLinked){
//            System.out.println("Prueba " + persona.getNombre());
//        }
//
//
//        System.out.println("************************");
//
//        System.out.println("ArrayList: " + listaArray.size());
//        System.out.println("ArrayList: " + linstaLinked.size());
//
//        System.out.println("************************");
//
//        System.out.println("ArrayList: " + listaArray.getFirst().toString());
//        System.out.println("ArrayList: " + listaArray.getLast().toString());
//
//        System.out.println("************************");
//
//        System.out.println("ArrayList: " + linstaLinked.getFirst().toString());
//        System.out.println("ArrayList: " + linstaLinked.getLast().toString());
//
//        System.out.println("************************");
//
//        listaArray.clear();
//        linstaLinked.clear();
//
//
//        System.out.println("************************");
//
//        System.out.println(listaArray.isEmpty());
//        System.out.println(linstaLinked.isEmpty());


        int[] arre = {22,35,31,56,65,765,7,34,766,98,32};


        for(int i : arre){
            if(i % 2 == 0){
                System.out.println(" ");
            } else{
                System.out.println(i);

            }
        }

        System.out.println("************************");

        ArrayList<producto> carrito = new ArrayList<producto>();
        carrito.add(new producto("manzana", "pera", "naranja"));
        carrito.add(new producto("uva", "durazno", "limon"));
        carrito.add(new producto("lechuga", "papa", "aji"));
        carrito.add(new producto("rocoto", "alverja", "tomate"));

        System.out.println(carrito.size());

        System.out.println("************************");

        carrito.remove(2);

        System.out.println("************************");

        for(producto car : carrito){
            System.out.println(car);
        }

        */


        int[] par = {14, 8 , 33, 2 , 99, 45, 12, 7, 50, 21};




        int mayor = par[0];

        for(int i = 1; i < par.length; i++){
            if(par[i] > mayor){
               mayor = par[i];
            }

        }
        System.out.println(mayor);




        ArrayList<String> asis = new ArrayList<>();
        asis.add(0,"Juan");
        asis.add(1,"pepito");
        asis.add(2,"maria");
        asis.add(3,"lucia");
        asis.add(4,"luisina");

        asis.add(2,"PTM");

        for(String li : asis){
            System.out.println(li);
        }



    }
}