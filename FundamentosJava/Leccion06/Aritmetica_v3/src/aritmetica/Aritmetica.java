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
    //recordar que si agregamos un constructor distinto al vacío ya no se crea este constructor
    //y nosotros debemos crearlo si lo necesitamos
    public Aritmetica() {
    }
    
    //constructor con dos argumentos
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    //hacer la suma
    int sumar() {
        return a + b;
    }
    
    //hacer la resta
    int restar() {
        return a - b;
    }
    
    //multiplicar
    int multiplicar() {
        return a * b;
    }
    
    //dividir
    int dividir() {
        return a / b;
    }
}
