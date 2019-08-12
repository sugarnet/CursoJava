/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.associations;

import ar.com.dss.sga.domain.Person;
import ar.com.dss.sga.domain.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Diego
 */
public class ClientAssociationsJPA {
    static final Logger LOGGER = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LocalPersonPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        List<Person> people = entityManager.createNamedQuery("Person.findAll").getResultList();
        
        entityManager.close();
        
        for(Person person : people) {
            LOGGER.info("Person: {}", person);
            
            for (User user : person.getUsers()) {
                
                LOGGER.info("User: {}", user);
            }
        }
    }
}
