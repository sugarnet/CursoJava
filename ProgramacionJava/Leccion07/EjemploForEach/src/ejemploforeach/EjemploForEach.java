/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploforeach;

/**
 *
 * @author almis
 */
public class EjemploForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creamos un arreglo de Personas
        Persona personas[] = {new Persona("Diego"), new Persona("Sol"), new Persona("Alma")};
        
		//Iteramos cada elemento del arreglo de personas
        for (Persona persona : personas) {
			//Accedemos a las propiedades y/o metodos del objeto
            System.out.println("Persona: " + persona);
        }
        
        System.out.println("");
        
		//Creamos un arreglo de enteros
        int numeros[] = {10, 20, 30, 40};
        
		//Iteramos el arreglo
        for(int numero : numeros) {
            System.out.println("Numero: " + numero);
        }
    }
    
}
