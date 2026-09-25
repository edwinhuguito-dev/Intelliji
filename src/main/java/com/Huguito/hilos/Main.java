package com.Huguito.hilos;

public class Main extends Thread {
    public static int amount = 0;
    public static void main(String[] args) {
//    public static void main(String[] args){
//
//        MiHilo hilo = new MiHilo();
//        hilo.start();
//
//
//        MiTarea tarea = new MiTarea();
//        Thread hilo2 = new Thread(tarea);
//        hilo2.start();
//
//
//    }

//    public static class Gene implements Runnable{
//        public static void mainGene(String[] args){
//            Gene obj = new Gene();
//            Thread thread = new Thread(obj);
//            thread.start();
//            System.out.println("This code is outside");
//        }
//    }
//    public void run(){
//        System.out.println("this code es running ina thread");
//    }


//        Main thread = new Main();
//        thread.start();
//        System.out.println("This code is outside of the thread");
//    }
//    public void run(){
//        System.out.println("This code is running in a trhread");


//        Main obj = new Main();
//        Thread thread = new Thread(obj);
//        thread.start();
//        System.out.println("This code is outside of the thread");
//    }
//    public void run(){
//        System.out.println("This code is running in a thread");


        Main thread = new Main();
        thread.start();
        // ESPERAMOS A QUE TERMINE EL HILO

        while(thread.isAlive()){
            System.out.println("Waiting...");
        }
        // ACTUALIZAMOS EL AMOUNT PRINT IS VALUE
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run(){
        amount++;
    }
}
