/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosobreescritura;

/**
 *
 * @author almis
 */
public class EjemploSobreescritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado("Diego", 2000);
        System.out.println("Empleado: " + empleado.obtenerDetalles());
        
        Gerente gerente = new Gerente("Diego", 2000, "Sistemas");
        System.out.println("Gerente: " + gerente.obtenerDetalles());
        
        Empleado empleado2 = new Gerente("tete", 300, "X");
        System.out.println("Empleado 2: " + empleado2.obtenerDetalles());
    }
    
}
