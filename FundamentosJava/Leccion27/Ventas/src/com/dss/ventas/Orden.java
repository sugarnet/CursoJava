/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dss.ventas;

/**
 *
 * @author almis
 */
public class Orden {
    private final int idOrden;
    private final Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden() {
        this.idOrden = ++contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto) {
		//si los productos agregados no superan el máximo de productos agregamos el nuevo producto
        if(contadorProductos < MAX_PRODUCTOS) {
			//agreamos el producto al arrego e incrementamos el contador
            productos[contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el máximo de " + MAX_PRODUCTOS + " Productos");
        }
    }
    
    public double calcularTotal() {
        double total = 0;
        
        for (int i = 0; i < contadorProductos; i++) {
            total += productos[i].getPrecio();
        }
        
        return total;
    }
    
    public void mostrarOrden() {
        System.out.println("# de Orden: " + this.idOrden);
        System.out.println("Total de la Orden #" + this.idOrden + ": $" + calcularTotal());
        System.out.println("Productos de la Orden #" + this.idOrden + ":");
        
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
        
    }
}
