/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.service;

import ar.com.dss.sga.domain.Person;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Diego
 */
@Local
public interface PersonService {
    List<Person> listPeople();
    Person findPersonById(Person person);
    Person findPersonByEmail(Person person);
    void addPerson(Person person);
    void updatePerson(Person person);
    void deletePerson(Person person);
}
