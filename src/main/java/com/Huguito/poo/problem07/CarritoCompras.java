package com.Huguito.poo.problem07;

import java.util.HashMap;
import java.util.Map;

public class CarritoCompras {

    private HashMap<Producto, Integer> product;

    public CarritoCompras() {
        this.product = new HashMap<>();
    }

    public void agregarProducto(Producto producto, int cantidad){
        if(cantidad > producto.stock){
            throw new ErrorMontoIndefinido("Stock agotado");
        }
        producto.stock -= cantidad;
        product.put(producto, cantidad);
    }

    public double calculartotal(){
        double totalPagar = 0.0;

        for(Map.Entry<Producto, Integer> entry : product.entrySet()){
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();

            double subtotal = producto.precio * cantidad;
            totalPagar += subtotal;

        }
        return totalPagar;
    }

    public void mostrarResumenCarrito(){

        if(product.isEmpty()){
            System.out.println("Tu carrito esta vacio.");
            return;
        }

        for(Map.Entry<Producto, Integer> entry : product.entrySet()){
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            double subtotal = producto.precio * cantidad;

            System.out.println("pagar " + producto.nombre + " " + producto.precio + " " + cantidad + " " + subtotal);

            System.out.println("total a pagar: " + calculartotal());
        }




    }


}
