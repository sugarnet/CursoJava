/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ds.peliculas.excepciones;

/**
 *
 * @author almis
 */
public class AccesosDatosException extends Exception{
    
    private String mensaje;

    public AccesosDatosException(String message) {
        this.mensaje = message;
    }
    
}
