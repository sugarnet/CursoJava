/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrareturn;

/**
 *
 * @author almis
 */
public class PalabraReturn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado = sumar(3, 6);
        //int resultado = sumar(0, 0);
        System.out.println("El resultado es: " + resultado);
    }
    
    public static int sumar(int a, int b) {
        
        if(a == 0 && b == 0) {
            System.out.println("Puede proporcionar valores diferente a cero");
            return 0;
        }
        return a + b;
    }
    
}
