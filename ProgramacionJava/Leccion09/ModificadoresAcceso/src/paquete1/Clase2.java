/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author almis
 */
public class Clase2 {
    
    public Clase2() {
        //Prueba constructores
        System.out.println("");
        //Constructor público
        new Clase1(1);
        //Constructor protegido
        new Clase1(1, 2);
        //Constructor de paquete
        new Clase1(1, 2, 3);
        //Constructor privado
        //new Clase1(1,2,3,4);
        System.out.println("Acceso denegado a constructor privado");
    }
    
    public void pruebaDesdeClase2() {
        //Acceso a Clase1 desde Clase2
        Clase1 clase1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo público: " + clase1.atrPublico);
        System.out.println("Atributo protegido: " + clase1.atrProtegido);
        System.out.println("Atributo de paquete: " + clase1.atrPaquete);
        System.out.println("Atributo privado: Acceso denegado");
    }
    
    
    
}
