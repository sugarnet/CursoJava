/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.client;

import beans.domain.Person;
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
public class ClientEntityPerson {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersonPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        entityTransaction.begin();
        
        Person person1 = new Person("Sol", "Mauna", "soledad@server2.com", "2634571888");
        
        log.debug("Objeto a persistir: " + person1);
        
        entityManager.persist(person1);
        
        entityTransaction.commit();
        
        log.debug("Objeto persistido: " + person1);
        log.debug("Fin test Person Entity con JPA");
        entityManager.close();
    }
}
