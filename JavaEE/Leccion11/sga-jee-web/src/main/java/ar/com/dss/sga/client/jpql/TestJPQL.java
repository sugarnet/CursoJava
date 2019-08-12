/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.client.jpql;

import ar.com.dss.sga.domain.Person;
import ar.com.dss.sga.domain.User;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Diego
 */
public class TestJPQL {
    static final Logger LOGGER = LogManager.getRootLogger();

    public static void main(String[] args) {
        String jpql = null;
        Query query = null;
        List<Person> people = null;
        List<User> users = null;
        Person person = null;
        Iterator iterator = null;
        Object[] row = null;
        List<String> names = null;
     
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LocalPersonPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        LOGGER.debug("\n1) Query of all people");
        jpql = "select p from Person p";
        people = entityManager.createQuery(jpql).getResultList();
        printPeople(people);
        
        LOGGER.debug("\n2) Query of person with id=1");
        jpql = "select p from Person p where p.id=1";
        person = (Person) entityManager.createQuery(jpql).getSingleResult();
        LOGGER.debug("Person: {}", person);
        
        LOGGER.debug("\n3) Query of people with name Diego");
        jpql = "select p from Person p where p.name = 'Diego'";
        people = entityManager.createQuery(jpql).getResultList();
        printPeople(people);
        
        LOGGER.debug("\n4) Query single data, it makes an Object array with three columns");
        jpql = "select p.name as Nombre, p.lastName as Apellido, p.email as Correo from Person p";
        iterator = entityManager.createQuery(jpql).getResultList().iterator();
        while(iterator.hasNext()) {
            row = (Object[]) iterator.next();
            String name = (String) row[0];
            String lastName = (String) row[1];
            String email = (String) row[2];
            
            LOGGER.debug("{} {} -> {}", name, lastName, email);
        }
        
        LOGGER.debug("\n5) Get Object person and person id, it makes an array with two columms");
        jpql = "select p, p.id from Person p";
        iterator = entityManager.createQuery(jpql).getResultList().iterator();
        while(iterator.hasNext()) {
            row = (Object[]) iterator.next();
            person = (Person) row[0];
            int id = (int) row[1];
            
            LOGGER.debug("Person: {}", person);
            LOGGER.debug("Id Person: {}", id);
        }
        
        LOGGER.debug("\n6) Query of all people");
        jpql = "select new ar.com.dss.sga.domain.Person(p.id) from Person p";
        people = entityManager.createQuery(jpql).getResultList();
        printPeople(people);
        
        LOGGER.debug("\n7) Return man and min from Person id");
        jpql = "select min(p.id) as MinId, max(p.id) as MaxId, count(p.id) as CantPerson from Person p";
        iterator = entityManager.createQuery(jpql).getResultList().iterator();
        while(iterator.hasNext()) {
            row = (Object[]) iterator.next();
            Integer min = (Integer) row[0];
            Integer max = (Integer) row[1];
            Long cant = (Long) row[2];
            
            LOGGER.debug("IdMin: {}, IdMax: {}, CantRows: {}", min, max, cant);
        }
        
        LOGGER.debug("\n8) Number of people that are differents");
        jpql = "select count(distinct p.name) as cant from Person p";
        Long differents = (Long) entityManager.createQuery(jpql).getSingleResult();
        LOGGER.debug("Differents people: {}", differents);

        LOGGER.debug("\n9) Concat and convert to uppercase the name and last name");
        jpql = "select upper(concat(p.name, ' ', p.lastName)) as Nombre from Person p";
        names = entityManager.createQuery(jpql).getResultList();
        int index = 1;
        for(String name : names) {
            
            LOGGER.debug("{}) {}", index, name);
            index++;
        }
        
        LOGGER.debug("\n10) Get people that contains in his name the letter 'a'");
        jpql = "select p from Person p where lower(p.name) like :param";
        String letter = "%a%";
        query = entityManager.createQuery(jpql);
        query.setParameter("param", letter);
        people = query.getResultList();
        printPeople(people);
        
        LOGGER.debug("\n11) Use between");
        jpql = "select p from Person p where p.id between 1 and 3";
        people = entityManager.createQuery(jpql).getResultList();
        printPeople(people);
        
        LOGGER.debug("\n12) Order by");
        jpql = "select p from Person p order by p.lastName asc";
        people = entityManager.createQuery(jpql).getResultList();
        printPeople(people);
        
        LOGGER.debug("\n13) subquery");
        jpql = "select p from Person p where p.id in (select p1.id from Person p1 where p1.id < 5)";
        people = entityManager.createQuery(jpql).getResultList();
        printPeople(people);
        
        LOGGER.debug("\n14) join with lazy loading");
        jpql = "select u from User u join u.person p";
        users = entityManager.createQuery(jpql).getResultList();
        printUsers(users);
        
        LOGGER.debug("\n15) join with eager loading");
        jpql = "select u from User u join fetch u.person p";
        users = entityManager.createQuery(jpql).getResultList();
        printUsers(users);
    }    
    public static void printPeople(List<Person> people) {
        for (Person person : people) {
            LOGGER.debug("Person: {}", person);
        }
    }
    
    public static void printUsers(List<User> users) {
        for (User user : users) {
            LOGGER.debug("Person: {}", user);
        }
    }
}
