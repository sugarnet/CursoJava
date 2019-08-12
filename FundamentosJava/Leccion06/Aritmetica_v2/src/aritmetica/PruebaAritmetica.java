/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author almis
 */
public class PruebaAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos un objeto de la clase Aritmetica con el constructor vacío
        Aritmetica obj1 = new Aritmetica();
        
        //llamar al método sumar y recibir el valor devuelto
        int resultado = obj1.sumar(5, 4);
        
        //mostramos el resultado
        System.out.println("Resultado suma directa obj1: " + resultado);
        
        //si llamamos directamente el método sumar sin argumentos
        //el valor en cero, ya que los atributos del objeto nunca se inicializaron
        //ya que no se utilizó el constructor con argumentos, sino el constructor vacío
        System.out.println("Resultado suma atributos obj1: " + obj1.sumar());
        
        //ahora creamos un objeto con el constructor con argumentos
        Aritmetica obj2 = new Aritmetica(2, 1);
        
        //mostramos el resultado
        //al llamar directamente al método suma nos regresa el valor de la suma
        System.out.println("Resultado suma atributos obj2: " + obj2.sumar());
    }
    
}
