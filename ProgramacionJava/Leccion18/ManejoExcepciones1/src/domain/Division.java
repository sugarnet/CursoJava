/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author almis
 */
public class Division {
    
    private int numerador;
    private int denominador;
    
    public Division(int numerador, int denominador) throws OperationException {
        if(denominador == 0) {
            throw new OperationException("Error: División por cero!!!");
        }
        
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public void realizarOperacion() {
        System.out.println("El resultado de la operación es: " + numerador / denominador);
    }
    
}
