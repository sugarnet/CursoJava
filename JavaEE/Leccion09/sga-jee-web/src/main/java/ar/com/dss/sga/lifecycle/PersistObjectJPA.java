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
public class PersistObjectJPA {
    static final Logger LOGGER = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LocalPersonPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        Person person = new Person("Alma", "Scifo", "ascifo@yahoo.com.ar", "26345252");
        
        entityTransaction.begin();
        
        entityManager.persist(person);
        
        entityTransaction.commit();
        
        LOGGER.debug("Objeto persistido: " + person);
        
        entityManager.close();
   }
}
