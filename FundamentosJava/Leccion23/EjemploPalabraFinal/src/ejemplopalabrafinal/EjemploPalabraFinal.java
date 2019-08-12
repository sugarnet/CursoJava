/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopalabrafinal;

/**
 *
 * @author almis
 */
public class EjemploPalabraFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Marca error: No se puede heredad de una clase final
        //ClaseFinal.persona=10
        
        //no es posible cambiar la referencia de la variable persona
        //ClaseFinal.persona=new Persona()
        
        System.out.println("Nombre persona: " + ClaseFinal.PERSONA.getNombre());
        
        //Pero si es posible cambiar el estado del objeto
        //referenciado por la variable persona
        ClaseFinal.PERSONA.setNombre("Diego");
        
        System.out.println("Nombre persona: " + ClaseFinal.PERSONA.getNombre());
    }
    
}
