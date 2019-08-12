/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import com.dss.mundopc.Computadora;
import com.dss.mundopc.Monitor;
import com.dss.mundopc.Orden;
import com.dss.mundopc.Raton;
import com.dss.mundopc.Teclado;

/**
 *
 * @author almis
 */
public class MundoPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Monitor m1 = new Monitor("LG", 25);
        Teclado t1 = new Teclado("USB", "Genius");
        Raton r1 = new Raton("USB", "Genius");
        String n1 = "PC 1";
        Computadora c1 = new Computadora(n1, m1, t1, r1);
        
        Monitor m2 = new Monitor("Samsung", 25);
        Teclado t2 = new Teclado("USB", "Microsoft");
        Raton r2 = new Raton("USB", "Microsoft");
        String n2 = "PC 2";
        Computadora c2 = new Computadora(n2, m2, t2, r2);
        
        Monitor m3 = new Monitor("LG", 22);
        Teclado t3 = new Teclado("USB", "Logitec");
        Raton r3 = new Raton("USB", "Logitec");
        String n3 = "PC 1";
        Computadora c3 = new Computadora(n3, m3, t3, r3);
        
        Monitor m4 = new Monitor("Samsung", 34);
        Teclado t4 = new Teclado("USB", "Genius");
        Raton r4 = new Raton("USB", "Genius");
        String n4 = "PC 1";
        Computadora c4 = new Computadora(n4, m4, t4, r4);
        
        Monitor m5 = new Monitor("LG", 21.5);
        Teclado t5 = new Teclado("USB", "Microcase");
        Raton r5 = new Raton("USB", "Microcase");
        String n5 = "PC 1";
        Computadora c5 = new Computadora(n5, m5, t5, r5);
        
        Monitor m6 = new Monitor("Samsung", 18.5);
        Teclado t6 = new Teclado("USB", "Logitec");
        Raton r6 = new Raton("USB", "Logitec");
        String n6 = "PC 1";
        Computadora c6 = new Computadora(n6, m6, t6, r6);
        
        Orden o1 = new Orden();
        o1.agregarComputadora(c1);
        o1.agregarComputadora(c2);
        o1.agregarComputadora(c3);
        o1.agregarComputadora(c4);
        
        o1.mostrarOrden();
        
        Orden o2 = new Orden();
        o2.agregarComputadora(c5);
        o2.agregarComputadora(c6);
        o2.agregarComputadora(c2);
        o2.agregarComputadora(c3);
        o2.agregarComputadora(c4);
        
        System.out.println("");
        o2.mostrarOrden();
        
        Orden o3 = new Orden();
        o3.agregarComputadora(c1);
        o3.agregarComputadora(c5);
        
        System.out.println("");
        o3.mostrarOrden();
    }
    
}
