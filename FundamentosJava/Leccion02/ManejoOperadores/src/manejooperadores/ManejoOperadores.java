/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejooperadores;

/**
 *
 * @author almis
 */
public class ManejoOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Operadores aritméticos:");
        int a = 1 + 2;
        int b = a * 4;
        int c = b / 2;
        int d = c - a;
        int e = -d;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        
        System.out.println("\nOperador Módulo (residuo): ");
        System.out.println("x mod 10: " + a % 2);
        
        System.out.println("\nOperador Compuesto:");
        a += 2; // es igual a      ->     a = a + 2;
        b -= 4;
        c *= a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        System.out.println("\nOperador incremento:");
        a++; // es igual a      ->     a = a + 1;
        System.out.println("a = " + a);
        
        //Preincremento/Predecremento, se incrementa/decrementa antes de asignar el valor
        c = ++a;
        
        //Postincremento/decremento, se incrementa/decrementa después de asignar el valor
        //La siguiente vez que se evalúa b es cuando se incrementa
        d = b++;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        System.out.println("\nOperador relacional:");
        boolean res = a < b;
        System.out.println("res = " + res);
        
        System.out.println("\nOperador ternario:");
        int min = (a < b) ? a : b;
        System.out.println("min = " + min);
        
        System.out.println("\nOperador de asignación:");
        int i, j, k;
        i = j = k = 100;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }
    
}
