/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextoestatico;

/**
 *
 * @author almis
 */
public class Persona {
    private String nombre;
    private int idPersona;
    private static int contadorPersonas;
    
    public Persona(String nombre) {
        //cada vez que creamos un objeto persona incrementamos el contador para obtener un nuevo idPersona
        contadorPersonas++;
        //asignamos el nuevo valor a idPersona
        idPersona = contadorPersonas;
        //asignamos el nombre recibido
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", idPersona=" + idPersona + '}';
    }
    
    public static int getContadorPersonas() {
        return contadorPersonas;
    }
}
