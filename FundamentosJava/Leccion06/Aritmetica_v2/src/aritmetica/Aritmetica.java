/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author almis
 */
public class Aritmetica {
    
    //atributos de la clase
    int a;
    int b;
    
    //constructor vacío
    public Aritmetica() {
    }
    
    //constructor con dos argumentos

    public Aritmetica(int arg1, int arg2) {
        a = arg1;
        b = arg2;
    }
    
    //este método toma nuevos valores
    int sumar(int a, int b) {
        return a + b;
    }
    
    //este método tomas los atributos de la clase
    int sumar() {
        return a + b;
    }
}
