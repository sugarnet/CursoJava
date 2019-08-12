/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Person;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

/**
 *
 * @author Diego
 */
public class TestPersonRestWSSecurity {
    
    public static void main(String args[]) {
        HttpAuthenticationFeature httpAuthenticationFeature = HttpAuthenticationFeature.basicBuilder()
                .nonPreemptive()
                .credentials("admin", "admin")
                .build();
        
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.register(httpAuthenticationFeature);
        
        Client client = ClientBuilder.newClient(clientConfig);
        
        WebTarget webTarget = client.target("http://localhost:8080/sga-jee-web/webservice")
                .path("/people");
        
        Person person = webTarget.path("/1").request(MediaType.APPLICATION_XML)
                .get(Person.class);
        
        System.out.println(person);
        
    }
    
}
