/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadatosscanner;

import java.util.Scanner;

/**
 *
 * @author almis
 */
public class EntradaDatosScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String captura;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un dato:");
        captura = scanner.nextLine();
        
        while(!captura.equals("")) {
            if(captura.toLowerCase().equals("quit")) {
                break;
            }
            
            System.out.println("Dato ingresado:" + captura);
            System.out.println("Ingrese nuevamente:");
            captura = scanner.nextLine();
        }
        
        System.out.println("Chau!!!");
    }
    
}
