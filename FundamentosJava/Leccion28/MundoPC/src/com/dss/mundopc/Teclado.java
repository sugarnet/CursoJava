/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dss.mundopc;

/**
 *
 * @author almis
 */
public class Teclado extends DispositivoEntrada{
    
    private int idTeclado;
    private static int contadorTeclados;
    
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++contadorTeclados;
    }

    @Override
    public String toString() {
        return super.toString() + " Teclado{" + "idTeclado=" + idTeclado + '}';
    }
    
    
    
}
