/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

import java.util.Scanner;

/**
 *
 * @author almis
 */
public class CicloWhile2 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("introduce el número de elementos a iterar:");
        int maxElementos;
        Scanner scanner = new Scanner(System.in);
        maxElementos = scanner.nextInt();
        int contador = 0;
        int limite = maxElementos;
        
        while(contador < limite) {
            System.out.println("contador = " + contador);
            contador++;
        }
    }
}
