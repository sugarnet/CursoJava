/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.client.criteria;

import ar.com.dss.sga.domain.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Diego
 */
public class ApiCriteriaTest {
    private static final Logger LOGGER = LogManager.getRootLogger();
    
    public static void main(String args[]) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LocalPersonPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        CriteriaBuilder criteriaBuilder = null;
        CriteriaQuery<Person> criteriaQuery = null;
        Root<Person> fromPerson = null;
        TypedQuery<Person> query = null;
        Person person = null;
        
        LOGGER.info("\n1) Consulta de todas las personas");
        
        //El objeto entityManager crea instancia de criteriaBuilder
        criteriaBuilder = entityManager.getCriteriaBuilder();
        
        //se crea instancia de criteriaQuery
        criteriaQuery = criteriaBuilder.createQuery(Person.class);
        
        //se crea el objeto raiz del query
        fromPerson = criteriaQuery.from(Person.class);
        
        //seleccionamos lo necesario del from
        criteriaQuery.select(fromPerson);
        
        query = entityManager.createQuery(criteriaQuery);
        
        List<Person> people = query.getResultList();
        showPeople(people);
        
        LOGGER.info("\n2-a) Consulta de un registro con id=1");
        criteriaQuery.select(fromPerson).where(criteriaBuilder.equal(fromPerson.get("id"), 1));
        person = entityManager.createQuery(criteriaQuery).getSingleResult();
        LOGGER.info(person);
        
        LOGGER.info("\n2-b) Consulta de un registro con id=1, forma dinámica");
        criteriaQuery.select(fromPerson);
        
        List<Predicate> predicates = new ArrayList<>();
        Integer idPerson = 1;
        
        if(Objects.nonNull(idPerson)) {
            ParameterExpression<Integer> expression = criteriaBuilder.parameter(Integer.class, "id");
            predicates.add(criteriaBuilder.equal(fromPerson.get("id"), expression));
        }
        
        if(predicates.isEmpty()) {
            throw new RuntimeException("Without criteriaQuery");
        } else if(predicates.size() == 1) {
            criteriaQuery.where(predicates.get(0));
        } else {
            criteriaQuery.where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
        }
        
        query = entityManager.createQuery(criteriaQuery);
        if(Objects.nonNull(idPerson)) {
            query.setParameter("id", idPerson);
        }
        
        person = query.getSingleResult();
        LOGGER.info(person);
    }
    
    private static void showPeople(List<Person> people) {
        for(Person person : people) {
            LOGGER.info(person);
        }
    }
}
