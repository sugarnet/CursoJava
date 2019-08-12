/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextoestatico;

/**
 *
 * @author almis
 */
public class ContextoEstatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Juan");
        System.out.println("Persona 1: " + p1);
        
        Persona p2 = new Persona("Karla");
        System.out.println("Persona 2: " + p2);
        
        //imprimimos el contadorPerosnas
        System.out.println("Nro de personas: " + Persona.getContadorPersonas());
    }
    
}
