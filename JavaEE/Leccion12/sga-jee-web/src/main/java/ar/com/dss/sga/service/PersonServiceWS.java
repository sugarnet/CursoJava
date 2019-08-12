/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.service;

import ar.com.dss.sga.domain.Person;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Diego
 */
@WebService
public interface PersonServiceWS {
    
    @WebMethod
    public List<Person> listPeople();
    
    @WebMethod
    public void addPerson(Person person);
    
    @WebMethod
    public void updatePerson(Person person);
    
    @WebMethod
    public void deletePerson(Person person);
}
