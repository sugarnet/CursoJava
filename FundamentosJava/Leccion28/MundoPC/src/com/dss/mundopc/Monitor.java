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
public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    private Monitor() {
        this.idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
}
