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
        //variables locales
        int operandoA = 6;
        int operandoB = 2;
        
        //creamos un objeto de la clase Aritmetica con argumentos
        Aritmetica obj1 = new Aritmetica(operandoA, operandoB);
        
        //imprimir operandos
        System.out.println("operando A: " + operandoA + ", operando B: " + operandoB);
        System.out.println();
        
        //resultado de la suma
        System.out.println("Resultado suma: " + obj1.sumar());
        
        //resultado de la resta
        System.out.println("Resultado resta: " + obj1.restar());
        
        //resultado de la multiplicación
        System.out.println("Resultado multiplicación: " + obj1.multiplicar());
        
        //resultado de la división
        System.out.println("Resultado división: " + obj1.dividir());
        

    }
    
}
