/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.dao;

import ar.com.dss.sga.domain.Person;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diego
 */
@Stateless
public class PersonDaoImpl implements PersonDao{
    
    @PersistenceContext(unitName = "PersonPU")
    EntityManager entityManager;

    @Override
    public List<Person> listPeople() {
        return entityManager.createNamedQuery("Person.findAll").getResultList();
    }

    @Override
    public Person findPersonById(Person person) {
        //return entityManager.find(Person.class, person.getId());
        return (Person) entityManager.createNamedQuery("Person.findById").setParameter("id", person.getId()).getSingleResult();
    }

    @Override
    public Person findPersonByEmail(Person person) {
        return (Person) entityManager.createNamedQuery("Person.findByEmail").setParameter("email", person.getEmail()).getSingleResult();
        /*Query query = entityManager.createQuery("from person p where p.email =: email");
        query.setParameter("email", person.getEmail());
        return (Person) query.getSingleResult();*/
    }

    @Override
    public void addPerson(Person person) {
        entityManager.persist(person);
    }

    @Override
    public void updatePerson(Person person) {
        entityManager.merge(person);
    }

    @Override
    public void deletePerson(Person person) {
        entityManager.remove(entityManager.merge(person));
    }
    
}
