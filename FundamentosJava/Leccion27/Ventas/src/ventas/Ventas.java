/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import com.dss.ventas.Orden;
import com.dss.ventas.Producto;

/**
 *
 * @author almis
 */
public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creamos varios productos
        Producto p1 = new Producto("Camisa", 300);
        Producto p2 = new Producto("Falda", 400);
        Producto p3 = new Producto("remera", 100);
        
		//creamos un objeto orden
        Orden o1 = new Orden();
        
		//agregamos los productos a la orden
        o1.agregarProducto(p1);
        o1.agregarProducto(p2);
        o1.agregarProducto(p3);
        
		//imprimimos la orden
        o1.mostrarOrden();
        
		//creamos una segunda orden
        Orden o2 = new Orden();
        
		//creamos nuevos productos
        Producto p4 = new Producto("Bufanda", 50);
        Producto p5 = new Producto("Sombrero", 150);
        
		//agregamos productos a la orden 2
        o2.agregarProducto(p4);
        o2.agregarProducto(p5);
        o2.agregarProducto(p2);
        o2.agregarProducto(p1);
        
		//imprimimos la orden 2
        System.out.println("");
        o2.mostrarOrden();
    }
    
}
