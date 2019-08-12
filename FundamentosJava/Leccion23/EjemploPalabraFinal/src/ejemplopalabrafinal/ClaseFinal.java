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
//clase marcada como final
public final class ClaseFinal {
    
    //variables marcadas como finales
    public static final int VAR_PRIMITIVO = 10;
    public static final Persona PERSONA = new Persona();
    
    public final void metodoFinal() {
        
    }
}
//Marca error: No se puede heredad de una clase final
//class ClaseHija extends ClaseFinal{ }