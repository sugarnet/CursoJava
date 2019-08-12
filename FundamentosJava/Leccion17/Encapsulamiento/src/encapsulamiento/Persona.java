/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author almis
 */
public class Persona {
    
    //atributos privados
    private String nombre;
    private String apellido;
    private boolean borrado;

    //constructor vacío
    public Persona() {
    }

    //constructor con 3 argumentos
    public Persona(String nombre, String apellido, boolean borrado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.borrado = borrado;
    }

    //métodos públicos para acceder y modificar los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    //método que imprime el estado del objeto
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", borrado=" + borrado + '}';
    }
    
    
    
}
