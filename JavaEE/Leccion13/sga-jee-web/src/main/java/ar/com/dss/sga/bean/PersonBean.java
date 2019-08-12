/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.bean;

import ar.com.dss.sga.domain.Person;
import ar.com.dss.sga.service.PersonService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Diego
 */
@Named("personBean")
@RequestScoped
public class PersonBean implements Serializable {
    
    @Inject
    private PersonService personService;
    
    private Person personSelected;
    
    private List<Person> people;
    
    public PersonBean(){}
    
    @PostConstruct
    public void init() {
        people = personService.listPeople();
        personSelected = new Person();
    }
    
    public void editListener(RowEditEvent event) {
        Person person = (Person) event.getObject();
        personService.updatePerson(person);
    }
    
    public void deleteListener() {
        personService.deletePerson(this.personSelected);
        this.personSelected = null;
        people = personService.listPeople();
    }
    
    public void resetPersonSelected() {
        this.personSelected = new Person();
    }
    
    public void addPerson() {
        personService.addPerson(this.personSelected);
        this.setPersonSelected(null);
        this.init();
    }

    public Person getPersonSelected() {
        return personSelected;
    }

    public void setPersonSelected(Person personSelected) {
        this.personSelected = personSelected;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
    
}
