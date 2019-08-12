/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.lifecycle;

import ar.com.dss.sga.domain.Person;
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
public class RemoveObjectJPA {
    static final Logger LOGGER = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LocalPersonPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        entityTransaction.begin();
        
        Person person = entityManager.find(Person.class, 2);
        
        entityTransaction.commit();
        
        LOGGER.debug("Objeto recuperado: " + person);
        
        
        EntityTransaction et2 = entityManager.getTransaction();
        
        et2.begin();
        
        entityManager.remove(person);
        
        et2.commit();
        
        LOGGER.debug("Objeto eliminado: " + person);
        
   }
}
