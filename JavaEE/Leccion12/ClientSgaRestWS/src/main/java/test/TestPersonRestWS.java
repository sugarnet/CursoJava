/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Person;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Diego
 */
public class TestPersonRestWS {
    
    private static final String URL_BASE = "http://localhost:8080/sga-jee-web/webservice";
    private static Client client;
    private static WebTarget webTarget;
    private static Person person;
    private static List<Person> people;
    private static Invocation.Builder invocationBuilder;
    private static Response response;
    
    public static void main(String args[]) {
        client = ClientBuilder.newClient();
        
        webTarget = client.target(URL_BASE).path("/people");
        
        person = webTarget
                .path("/1")
                .request(MediaType.APPLICATION_XML)
                .get(Person.class);
        
        System.out.println("Person received: " + person);
        
        people = webTarget
                .request(MediaType.APPLICATION_XML)
                .get(Response.class)
                .readEntity(new GenericType<List<Person>>(){});
        
        System.out.println("");
        System.out.println("People in database:");
        people.stream().forEach(p -> System.out.println("Person: " + p));
        
        Person newPerson = new Person("Willy", "Vilas", "wvilas@gmail.com", "0800222333");
        invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
        response = invocationBuilder.post(Entity.entity(newPerson, MediaType.APPLICATION_XML));
        
        System.out.println("");
        System.out.println("Response: " + response.getStatus());
        Person recuperedPerson = response.readEntity(Person.class);
        System.out.println("Recupered person: " + recuperedPerson);
        
        Person updatedPerson = recuperedPerson;
        updatedPerson.setLastName("last name updated");
        String pathId = "/" + updatedPerson.getId();
        invocationBuilder = webTarget.path(pathId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.put(Entity.entity(updatedPerson, MediaType.APPLICATION_XML));
        
        System.out.println("");
        System.out.println("Response: " + response.getStatus());
        System.out.println("Updated person: " + response.readEntity(Person.class));
        
        Person deletedPerson = recuperedPerson;
        String pathDeleteId = "/" + deletedPerson.getId();
        invocationBuilder = webTarget.path(pathDeleteId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.delete();
        
        System.out.println("");
        System.out.println("Response: " + response.getStatus());
        System.out.println("Person deleted");
        
    }
    
}
