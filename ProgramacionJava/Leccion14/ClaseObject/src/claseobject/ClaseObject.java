/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseobject;

/**
 *
 * @author almis
 */
public class ClaseObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado emp1 = new Empleado("Diego S", 30000);
        Empleado emp2 = new Empleado("Diego s", 30000);
        
        compararObjetos(emp1, emp2);
    }
    
    private static void compararObjetos(Empleado emp1, Empleado emp2) {
        System.out.println("Contenido del objeto 1: " + emp1);
        System.out.println("Contenido del objeto 2: " + emp2);
        
        if(emp1 == emp2) {
            System.out.println("Los objetos tienen la misma dirección de memoria");
        } else {
            System.out.println("Los objetos tienen diferente dirección de memoria");
        }
        
        if(emp1.equals(emp2)) {
            System.out.println("Los objetos son iguales");
        } else {
            System.out.println("Los objetos son diferentes");
        }
        
        if(emp1.hashCode() == emp2.hashCode()) {
            System.out.println("Los objetos tienen el mismo código hash");
        } else {
            System.out.println("Los objetos tienen diferente código hash");
        }
    }
    
}
