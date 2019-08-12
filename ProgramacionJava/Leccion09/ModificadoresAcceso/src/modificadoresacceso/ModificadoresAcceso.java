/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadoresacceso;

import paquete1.Clase2;
import paquete2.Clase3;
import paquete2.Clase4;

/**
 *
 * @author almis
 */
public class ModificadoresAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Prueba de acceso a Clase1 desde otras clases
        //acceso a Clase1 desde Clase2
        System.out.println("*** Acceso desde Clase2 a Clase1 (mismo paquete) ***");
        new Clase2().pruebaDesdeClase2();
        
        //acceso a Clase1 desde Clase3
        //Clase3 extiende de Clase1
        System.out.println("");
        System.out.println("*** Acceso desde Clase3 a Clase1 (diferente paquete pero es subclase) ***");
        new Clase3().pruebaDesdeClase3();
        
        //acceso a Clase1 desde Clase4
        //Clase4  NO es subclase de Clase1 y está en otro paquete
        System.out.println("");
        System.out.println("*** Acceso desde Clase4 a Clase1 (diferente paquete, NO es subclase) ***");
        new Clase4().pruebaDesdeClase4();
    }
    
}
