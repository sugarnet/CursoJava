/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ar.com.dss.sga.domain.Person;
import ar.com.dss.sga.service.PersonServiceRemote;
import com.sun.enterprise.security.ee.auth.login.ProgrammaticLogin;
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
        
        String authFile = "login.conf";
        
        System.setProperty("java.security.auth.login.config", authFile);
        
        ProgrammaticLogin programmaticLogin = new ProgrammaticLogin();
        programmaticLogin.login("admin", "admin".toCharArray());
        
        try {
            Context context = new InitialContext();
            PersonServiceRemote personServiceRemote = (PersonServiceRemote) 
                    context.lookup("java:global/sga-jee-web/PersonServiceImpl!ar.com.dss.sga.service.PersonServiceRemote");
            
            List<Person> people = personServiceRemote.listPeople();
            
            people.stream().forEach(p -> System.out.println(p));
            
        } catch (NamingException ne) {
            ne.printStackTrace();
        }
    }
}
