/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Clase1;

/**
 *
 * @author almis
 */
public class Clase4 {
    
    public Clase4() {
        //cosntructor protegido al no ser una subclase
        //super(1,2)
        //acceso package, y al estar fuera de paquete está restringido
        //super(1,2,3)
        //Acceso privado, restringido
        //super(1,2,3,4)
    }
    
    public void pruebaDesdeClase4() {
        //Acceso a Clase1 desde Clase4
        //Clase4 no es subclase y está en otro paquete
        Clase1 clase1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo público: " + clase1.atrPublico);
        System.out.println("Atributo protegido: no se puede acceder desde un paquete externo al no ser una subclase");
        System.out.println("Atributo de paquete: no se puede acceder desde un paquete externo");
        System.out.println("Atributo de paquete: no se puede acceder");
        
        //constructor público
        new Clase1();
        
        //los demás constructores están restringidos
        System.out.println("");
        System.out.println("Atributo público: " + clase1.metodoPublico());
        System.out.println("Atributo protegido: no se puede acceder desde un paquete externo al no ser una subclase");
        System.out.println("Atributo de paquete: no se puede acceder desde un paquete externo");
        System.out.println("Atributo de paquete: no se puede acceder");
    }
    
}
