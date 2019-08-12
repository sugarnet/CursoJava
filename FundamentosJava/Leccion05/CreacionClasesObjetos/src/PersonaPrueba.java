/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author almis
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        //Creación de un Objeto
        Persona persona = new Persona();
        
        //Llamando a un método del objeto creado
        System.out.println("Valores por defecto del objeto Persona");
        persona.desplegarNombre();
        
        //Modificar valores
        persona.nombre = "Diego";
        persona.apellidoPaterno = "Scifo";
        persona.apellidoMaterno = "Ruffini";
        
        System.out.println("\nVolvemos a llamar al método");
        persona.desplegarNombre();
        
        
        
        
    }
}
