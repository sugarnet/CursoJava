/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaconstructores;

/**
 *
 * @author almis
 */
public class Persona {
    
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    //constructor sin argumentos y privado
    //asigna el idPersona
    private Persona() {
        this.idPersona = contadorPersonas++;
    }
    
    //contructor completo sobrecargado
    public Persona(String nombre, int edad) {
        //se manda a llamar el constructor vacío para que asigne el idPersona
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
}
