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
public class Orden {
    
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora) {
        if(contadorComputadoras < MAX_COMPUTADORAS) {
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("No hay más espacio para agregar computadoras!");
        }
    }
    
    public void mostrarOrden() {
        System.out.println("Número de Orden: " + idOrden);
        System.out.println("Cantidad de computadoras: " + contadorComputadoras);
        System.out.println("Computadoras: ");
        
        for(int i = 0; i < contadorComputadoras; i++) {
            System.out.println("Ítem " + i + " " + computadoras[i]);
        }
        
        
    }
    
}
