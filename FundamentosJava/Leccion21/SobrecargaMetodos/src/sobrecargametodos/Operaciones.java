/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargametodos;

/**
 *
 * @author almis
 */
public class Operaciones {
    
    //método sumar
    public static int sumar(int a, int b) {
        System.out.println("Método sumar(int, int)");
        return a + b;
    }
    
    //sobrecarga del método sumar
    public static double sumar(double a, double b) {
        System.out.println("Método sumar(double, double)");
        return a + b;
    }
    
    public static double sumar(int a, double b) {
        System.out.println("Método sumar(int, double)");
        return a + b;
    }
    
    public static double sumar(double a, int b) {
        System.out.println("Método sumar(double, int)");
        return a + b;
    }
        
}
