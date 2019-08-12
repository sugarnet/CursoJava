/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author almis
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos el objeto
        Persona p1 = new Persona("Juan", "Perez", false);
        
        //accedemos al atributo  nombre
        System.out.println("Nombre de p1: " + p1.getNombre());
        
        //creamos el objeto
        Persona p2 = new Persona("Karla", "Gonzalez", false);
        
        //imprimimos el estado completo del objeto
        System.out.println("Estado del objeto p2: " + p2);
        
        //marcamos como eliminada la persona
        p2.setBorrado(true);
        
        //imprimimos el estado completo del objeto
        System.out.println("Estado del objeto p2: " + p2);
        
        //creamos el tercer objeto vacío
        Persona p3 = new Persona();
        //imprimimos el estado completo del objeto
        System.out.println("Estado del objeto p3: " + p3);
        
    }
    
}
