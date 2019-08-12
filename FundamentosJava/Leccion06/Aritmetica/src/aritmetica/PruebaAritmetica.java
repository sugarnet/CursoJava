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
        // creamos un objeto de la clase Aritmetica
        Aritmetica aritmetica = new Aritmetica();
        
        //llamar al método sumar y recibir el valor devuelto
        int resultado = aritmetica.sumar(5, 3);
        
        //mostramos el resultado
        System.out.println("Resultado: " + resultado);
    }
    
}
