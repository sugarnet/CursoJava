/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.service.rest;

import ar.com.dss.sga.domain.Person;
import ar.com.dss.sga.service.PersonService;
import java.util.List;
import java.util.Objects;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Diego
 */
@Path("/people")
@Stateless
public class PersonServiceRS {
    @Inject
    private PersonService personService;
    
    @GET
    @Produces(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Person> listPeople() {
        return personService.listPeople();
    }
    
    @GET
    @Produces(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Person findPersonById(@PathParam("id") int id) {
        return personService.findPersonById(new Person(id));
    }
    
    @POST
    @Produces(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response addPerson(Person person) {
        try {
            personService.addPerson(person);
            return Response.ok().entity(person).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @PUT
    @Produces(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Response updatePerson(@PathParam("id") int id, Person personUpdated) {
        try {
            Person person = personService.findPersonById(new Person(id));
            if(Objects.nonNull(person)) {
                personService.updatePerson(personUpdated);
                return Response.ok().entity(personUpdated).build();
            } else {
                
                return Response.status(Response.Status.NOT_FOUND).build();
            }
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int id) {
        try {
            personService.deletePerson(new Person(id));
            return Response.ok().build();
                
        } catch (Exception e) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
    
}
