/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.service;

import ar.com.dss.sga.dao.PersonDao;
import ar.com.dss.sga.domain.Person;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Diego
 */
@Stateless
public class PersonServiceImpl implements PersonService, PersonServiceRemote{
    
    @EJB
    private PersonDao personDao;
    
    @Override
    public List<Person> listPeople() {
        /*List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Diego", "Scifo", "diegoscifo@yahoo.com.ar", "2634571423"));
        people.add(new Person(2, "Sol", "Mauna", "soledadmauna@hotmail.com.ar", "2615399030"));
        people.add(new Person(3, "Alma", "Scifo", "almascifo@hotmail.com.ar", ""));
        return people;*/
        return personDao.listPeople();
    }

    @Override
    public Person findPersonById(Person person) {
        return personDao.findPersonById(person);
    }

    @Override
    public Person findPersonByEmail(Person person) {
        return personDao.findPersonByEmail(person);
    }

    @Override
    public void addPerson(Person person) {
        personDao.addPerson(person);
    }

    @Override
    public void updatePerson(Person person) {
        personDao.updatePerson(person);
    }

    @Override
    public void deletePerson(Person person) {
        personDao.deletePerson(person);
    }
}
