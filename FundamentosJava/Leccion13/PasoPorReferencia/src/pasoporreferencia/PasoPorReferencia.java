/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferencia;

/**
 *
 * @author almis
 */
public class PasoPorReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona = new Persona();
        persona.cambiarNombre("Juan");
        imprimirNombre(persona); //imprime Juan
        modificarPersona(persona);
        imprimirNombre(persona); //imprime Carlos
        
    }
    
    public static void modificarPersona(Persona arg) {
        arg.cambiarNombre("Carlos");
    }
    
    public static void imprimirNombre(Persona p) {
        System.out.println("El nombre de la persona es: " + p.obtenerNombre());
    }
    
}
