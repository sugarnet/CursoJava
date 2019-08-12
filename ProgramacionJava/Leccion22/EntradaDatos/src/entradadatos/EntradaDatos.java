/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author almis
 */
public class EntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String captura;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        try {
            System.out.println("Ingrese un dato:");
            captura = bufferedReader.readLine();
            
            while(!captura.equals("")) {
                System.out.println("Dato introducido: " + captura);
                System.out.println("Ingrese nuevamente:");
                captura = bufferedReader.readLine();
            }
            System.out.println("Chau!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
}
