/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.lifecycle;

import ar.com.dss.sga.domain.Person;
import static ar.com.dss.sga.lifecycle.UpdateObjectJPA.LOGGER;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Diego
 */
public class UpdateObjectJPALongSession {
    static final Logger LOGGER = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LocalPersonPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        entityTransaction.begin();
        
        Person person = entityManager.find(Person.class, 2);
        
        LOGGER.debug("Objeto recuperado: " + person);
        
        person.setName("Carlos");
        person.setLastName("Menem");
        person.setEmail("cmenem@server1.com");
        
        entityTransaction.commit();
        
        LOGGER.debug("Objeto actualizado: " + person);
        
   }
}
