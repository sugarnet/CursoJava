/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabranull;

/**
 *
 * @author almis
 */
public class PalabraNull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p1 = new Persona("Juan");
        System.out.println("Nombre p1: " + p1.obtenerNombre());
        
        Persona p2 = p1;//p2 apunta al mismo objeto que p1;
        System.out.println("Nombre p2: " + p2.obtenerNombre());
        
        //hacemos que p1 ya no apunte al objeto p1
        p1 = null;
        
        //comprobamos que p2 sigue accediendo al objeto
        System.out.println("Nombre p2: " + p2.obtenerNombre());
        
        //la siguiente linea marca error de NullPointerException
        //System.out.println("Nombre p1: " + p1.obtenerNombre());
        //solo en caso de que no sea nulo podemos utilizar este métodoen esta variable
        
        if(p1 != null) {
            System.out.println("Nombre p1: " + p1.obtenerNombre());
        }
    }
    
}

class Persona {
    String nombre; // valor por default es null
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtenerNombre() {
        return this.nombre; //uso opcional de this
    }
}
