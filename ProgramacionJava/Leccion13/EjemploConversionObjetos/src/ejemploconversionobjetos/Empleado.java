/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconversionobjetos;

/**
 *
 * @author almis
 */
public class Empleado {
    
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
}
