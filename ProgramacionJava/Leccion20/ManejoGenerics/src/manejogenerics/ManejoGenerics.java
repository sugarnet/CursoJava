/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejogenerics;

/**
 *
 * @author almis
 */
public class ManejoGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClaseGenerica<Integer> objInteger = new ClaseGenerica<Integer>(15);
        objInteger.getType();
        
        ClaseGenerica<String> objString = new ClaseGenerica<>("Diego");
        objString.getType();
        
    }
    
}
