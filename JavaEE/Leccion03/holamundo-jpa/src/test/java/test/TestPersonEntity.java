/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.domain.Person;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Diego
 */
public class TestPersonEntity {
    
    static EntityManager entityManager = null;
    static EntityTransaction entityTransaction = null;
    static EntityManagerFactory entityManagerFactory = null;
    
    Logger log = LogManager.getRootLogger();
    
    @BeforeClass
    public static void init() throws Exception {
        entityManagerFactory = Persistence.createEntityManagerFactory("PersonPU");
    }
    
    @Before
    public void setup() {
        try {
            entityManager = entityManagerFactory.createEntityManager();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testPersonEntity() {
        log.debug("Iniciando test Person Entity con JPA");
        
        assertTrue(Objects.nonNull(entityManager));
        
        entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        Person person1 = new Person("Diego", "Scifo", "diegoscifo@server1.com", "2634571423");
        
        log.debug("Objeto a persistir: " + person1);
        
        entityManager.persist(person1);
        
        entityTransaction.commit();
        
        assertTrue(Objects.nonNull(person1.getId()));
        log.debug("Objeto persistido: " + person1);
        log.debug("Fin test Person Entity con JPA");
    }
    
    @After
    public void tearDown() throws Exception {
        if(Objects.nonNull(entityManager)) {
            entityManager.close();
        }
    }
} 
