/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dss.javadoc;

/**
 *
 * Esta clase permite realizar operaciones aritméticas
 * 
 * @author almis
 * @version 1.0
 */
public class Aritmetica {
    /**
     * Primer operando
     */
    private int operandoA;
    
    /**
     * Segundo operando
     */
    private int operandoB;
    
    /**
     * Contructor con parámetros
     * @param operandoA Primer Parámetro
     * @param operandoB Segundo Parámetro
     */
    public Aritmetica(int operandoA, int operandoB){
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }
    
    /**
     * Suma el primer y segundo parámetro
     * @return int con la suma del primer y segundo parámetro
     */
    public int sumar() {
        return operandoA + operandoB;
    }
    
}
