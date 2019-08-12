/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojavadoc;

import com.dss.javadoc.Aritmetica;

/**
 *
 * Clase para probar el concepto de javadoc
 * @author almis
 * @version 1.0
 */
public class EjemploJavaDoc {

    /**
     * Método que realiza la prueba de la clase Aritmética
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aritmetica aritmetica = new Aritmetica(3, 2);
        
        System.out.println("El resultado es " + aritmetica.sumar());
    }
    
}
