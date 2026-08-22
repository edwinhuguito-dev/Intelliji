package com.Huguito.poo.problem07;

public class MainComerce {
    public static void main(String[] args){

        ProductoFisico laptop = new ProductoFisico("fu01", "Laptop gamer", 120, 500, 1.5);
        ProductoDigital game =  new ProductoDigital("ga01", "Juego de tronos", 100, 100, 5);


        laptop.mostrarInfoproducto();
        game.mostrarInfoproducto();

        laptop.aplicarDecuento(10);
        game.aplicarDecuento(20);

        CarritoCompras carritoCompras = new CarritoCompras();



        try{

            carritoCompras.agregarProducto(laptop, 100);
            carritoCompras.agregarProducto(game, 200);


        } catch(ErrorMontoIndefinido e){
            System.out.println("Error" + e.getMessage());
        }


        carritoCompras.mostrarResumenCarrito();

        try{

            carritoCompras.agregarProducto(laptop, 10);


        } catch (ErrorMontoIndefinido e){
            System.out.println("Error" + e.getMessage());
        }
        carritoCompras.calculartotal();
    }
}
