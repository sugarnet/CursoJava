/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.cascade;

import ar.com.dss.sga.domain.Person;
import ar.com.dss.sga.domain.User;
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
public class PersistenceCascadeJPA {
    static final Logger LOGGER = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LocalPersonPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        Person person = new Person("Manu", "Ginobili", "mginobili@spurs.com", "223366");
        User user = new User("mginobili", "m123", person);
        
        entityTransaction.begin();
        
        entityManager.persist(user);
        
        entityTransaction.commit();
        
        LOGGER.info("User saved: {}", user);
        LOGGER.info("Person saved: {}", person);
        
        entityManager.close();
        
    }
}
