/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.service;

import ar.com.dss.sga.dao.PersonDao;
import ar.com.dss.sga.domain.Person;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

/**
 *
 * @author Diego
 */
@Stateless
@WebService(endpointInterface = "ar.com.dss.sga.service.PersonServiceWS")
public class PersonServiceImpl implements PersonService, PersonServiceRemote, PersonServiceWS {
    
    @Inject
    PersonDao personDao;
    
    @Resource
    private SessionContext sessionContext;
    
    @Override
    public List<Person> listPeople() {
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
        try {
        personDao.updatePerson(person);
        } catch (Throwable t) {
            sessionContext.setRollbackOnly();
            t.printStackTrace(System.out);
        }
    }

    @Override
    public void deletePerson(Person person) {
        personDao.deletePerson(person);
    }

}
