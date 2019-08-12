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
public class Empleado extends Persona {
    
    private double sueldo;
    
    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);//super debe ser la primera línea
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        //primero mandamos a llamar el método toString de la clase padre para que
        //podamos observar los valores, y después imprimimos los valores de la clase
        //hija
        return super.toString() + " Empleado{" + "sueldo=" + sueldo + '}';
    }
    
    
    
}
