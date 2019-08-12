/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejopersonas;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

/**
 *
 * @author almis
 */
public class ManejoPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaJDBC personasJDBC = new PersonaJDBC();
        //Prueba del metodo insert
        personasJDBC.insert("Alberto", "Juarez");
        //Prueba del metodo update
        personasJDBC.update(2, "Nombre3", "Apellido3");
        //Prueba del metodo delete
        //personasJDBC.delete(1);
        //Prueba del metodo select
        //Uso de un objeto persona para encapsular la informacion
        //de un registro de base de datos
        List<Persona> personas = personasJDBC.select();
        for (Persona persona : personas) {
            System.out.print(persona);
            System.out.println("");
        }
    }

}
