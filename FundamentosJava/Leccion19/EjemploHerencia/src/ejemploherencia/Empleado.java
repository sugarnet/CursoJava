/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

/**
 *
 * @author almis
 */
public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;

    public Empleado( String nombre, double sueldo) {
        super(nombre);//super debe ser la primera línea
        this.idEmpleado = ++contadorEmpleados;
        this.sueldo = sueldo;
    }
    
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public double getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
		//primero mandamos a llamar el método toString de la clase Persona para que podamos observar los valores de la clase Padre, y después imprimimos los valores de la clase hija
        return super.toString() + "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
            
}
