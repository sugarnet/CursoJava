/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.client.transactions;

import ar.com.dss.sga.domain.Person;
import ar.com.dss.sga.service.PersonServiceRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Diego
 */
public class TestTransactions {
    private static final Logger LOGGER = LogManager.getRootLogger();
    
    public static void main(String args[]) throws NamingException {
        Context context = new InitialContext();
        
        PersonServiceRemote personServiceRemote = (PersonServiceRemote) context.lookup("java:global/sga-jee-web/PersonServiceImpl!ar.com.dss.sga.service.PersonServiceRemote");
        
        Person person = personServiceRemote.findPersonById(new Person(1));
        
        person.setLastName("error................................................................................");
        personServiceRemote.updatePerson(person);
        
        LOGGER.info("Object modified {}", person);
        LOGGER.info("Fin prueba");
        
    }
    
}
