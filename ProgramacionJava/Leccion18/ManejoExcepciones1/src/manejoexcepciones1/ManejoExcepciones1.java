/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones1;

import domain.Division;
import domain.OperationException;

/**
 *
 * @author almis
 */
public class ManejoExcepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Division division = new Division(5, 0);
            division.realizarOperacion();
        } catch (OperationException oe) {
            System.out.println("Ocurrió un error!");
            oe.printStackTrace();
        }
    }
    
}
