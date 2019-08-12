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
public class Clase3 extends Clase1{
    
    public Clase3() {
        //Constructor protegido: al ser una subclase puede acceder, aunque esté en otro paquete
        super(1, 2);
        //Acceso de paquete, al estar en otro paquete está restringido
        //super(1, 2, 3);
        //Acceso privado: denegado
        //super(1,2,3,4);
    }
    
    public void pruebaDesdeClase3() {
        //Accceso a Clase1 desde Clase3
        Clase1 clase1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo público: " + clase1.atrPublico + " o heredado: " + atrPublico);
        System.out.println("Atributo protegido (heredado): " + atrProtegido);
        System.out.println("Atributo de paquete: no se puede acceder desde paquete externo");
        System.out.println("Atributo privado: acceso denegado");
        
        //constructor público
        new Clase1();
        //Los demás constructores no se pueden probar así, sino desde el constructor de esta clase
        //ya que esta es una subclase en otro paquete
        
        System.out.println("");
        System.out.println("Método público: " + clase1.metodoPublico());
        System.out.println("Método protegido (heredado): " + metodoProtegido());
        System.out.println("Método de paquete: no se puede acceder desde un paquete externo");
        System.out.println("Método privado: acceso denegado");
    }
}
