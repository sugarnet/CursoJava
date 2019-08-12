/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxingunboxing;

/**
 *
 * @author almis
 */
public class AutoboxingUnboxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //códiggo innecesario
        /*Integer integerObj = new Integer(10);
        Float floatObj = new Float(10.3F);
        Double doubleObj = new Double(20.4);*/
        
		//Autoboxing (se convierten de tipos primitivos a tipos Object)
        Integer integerObj = 10;
        Float floatObj = 10.3F;
        Double doubleObj = 20.4;
        
        System.out.println("Autoboxing");
        System.out.println("Integer Object: " + integerObj);
        System.out.println("Float Object: " + floatObj);
        System.out.println("Double Object: " + doubleObj);
        
		//Autounboxing (se convierten de objetos a tipos primitivos)
        int entero = integerObj;
        //int otroEntero = 3.2f; //error
        float flotante = floatObj;
        double doble = doubleObj;
        
        System.out.println("");
        System.out.println("Primitivo entero: " + entero);
        System.out.println("Primitivo flotante: " + flotante);
        System.out.println("Primitivo doble: " + doble);
    }
    
}
