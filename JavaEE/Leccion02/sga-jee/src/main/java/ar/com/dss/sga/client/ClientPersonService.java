/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.client;

import ar.com.dss.sga.domain.Person;
import ar.com.dss.sga.service.PersonServiceRemote;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Diego
 */
public class ClientPersonService {
    public static void main(String args[]) {
        System.out.println("Iniciando llamada al EJB desde el cliente");
        
        try {
            Context context = new InitialContext();
            //java:global/<Nombre_Componente_desplegado_en_glassfish>/<Implementacion_interface>!<path_a_la_interface>
            PersonServiceRemote personServiceRemote = 
                    (PersonServiceRemote) context.lookup("java:global/sga-jee/PersonServiceImpl!ar.com.dss.sga.service.PersonServiceRemote");
            
            List<Person> people = personServiceRemote.listPeople();
            
            for(Person person : people) {
                System.out.println(person);
            }
            System.out.println("Fin llamada al EJB desde el cliente");
            
        } catch (NamingException ne) {
            ne.printStackTrace();
        }
    }
}
