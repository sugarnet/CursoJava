/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplovarargs;

/**
 *
 * @author almis
 */
public class EjemploVarArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirNumeros(1,5,6,9,74,85,96,41,66,93);
        
        System.out.println("");
        
        imprimirNumeroForEach(9,8,54,6,32,22,48,71);
        
        System.out.println("");
        
        variosParametros("Diego", true, 7,9,6);
    }
    
    public static void imprimirNumeros(int... numeros) {
        for(int i=0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }
    }
    
    public static void imprimirNumeroForEach(int... numeros) {
        for(int numero : numeros) {
            System.out.println("Elemento: " + numero);
        }
    }
    
    public static void variosParametros(String nombre, boolean valido, int... numeros) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Válido: " + valido);
        
        for(int numero : numeros) {
            System.out.println("Elemento: " + numero);
        }
    }
    
}
