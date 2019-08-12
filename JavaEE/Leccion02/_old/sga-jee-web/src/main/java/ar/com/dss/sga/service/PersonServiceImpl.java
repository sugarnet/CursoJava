/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.service;

import ar.com.dss.sga.domain.Person;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Diego
 */
@Stateless
public class PersonServiceImpl implements PersonService{
    @Override
    public List<Person> listPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Diego", "Scifo", "diegoscifo@yahoo.com.ar", "2634571423"));
        people.add(new Person(2, "Sol", "Mauna", "soledadmauna@hotmail.com.ar", "2615399030"));
        people.add(new Person(3, "Alma", "Scifo", "almascifo@hotmail.com.ar", ""));
        return people;
    }

    @Override
    public Person findPersonById(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person findPersonByEmail(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addPerson(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePerson(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePerson(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
