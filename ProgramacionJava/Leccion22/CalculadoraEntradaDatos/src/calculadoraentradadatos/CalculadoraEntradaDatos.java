/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraentradadatos;

import java.util.Scanner;

/**
 *
 * @author almis
 */
public class CalculadoraEntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese el primer valor: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        System.out.println("Ingrese el segundo valor: ");
        int b = scanner.nextInt();
    
        System.out.println("El resultado de la suma es: " + Operacion.sumar(a, b));
    }
    
}
