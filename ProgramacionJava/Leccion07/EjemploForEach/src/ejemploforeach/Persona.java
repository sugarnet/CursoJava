/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploforeach;

/**
 *
 * @author almis
 */
public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    private String nombre;

    public Persona(String nombre) {
        idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
}
