/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author almis
 */
public class EjemploPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado empleado = new Empleado("Diego", 2000);
        imprimirDetalles(empleado);
        
        Gerente gerente = new Gerente("Sol", 2500, "Turismo");
        imprimirDetalles(gerente);
        
    }
    
	//Observamos que el tipo que recibe el metodo es de tipo padre (Empleado)
	//Sin embargo al momento de ejecutar el metodo, se ejecuta el del hijo (Gerente)
	//eso es el polimorfismo, multiples formas pero en tiempo de ejecucion
    public static void imprimirDetalles(Empleado empleado) {
        System.out.println(empleado.obtenerDetalles());
    }
    
}
