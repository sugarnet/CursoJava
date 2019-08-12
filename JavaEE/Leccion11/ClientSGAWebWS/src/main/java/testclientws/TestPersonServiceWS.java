/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclientws;

import clientsga.ws.Person;
import clientsga.ws.PersonServiceImplService;
import clientsga.ws.PersonServiceWS;
import java.util.List;

/**
 *
 * @author Diego
 */
public class TestPersonServiceWS {
    
    public static void main(String args[]) {
        PersonServiceWS personServiceWS = new PersonServiceImplService().getPersonServiceImplPort();
        System.out.println("Starting service list people ws...");
        List<Person> people = personServiceWS.listPeople();
        
        people.stream().forEach(e -> System.out.println(e.getName()));
        System.out.println("Finish service list people ws...");
        
        /*Person person = new Person();
        person.setName("NameWS");
        person.setLastName("LastNameWS");
        person.setEmail("emailWS@email.com");
        person.setPhone("44558899");
        
        System.out.println("Starting service add person ws...");
        personServiceWS.addPerson(person);
        System.out.println("Finishing service add person ws...");*/
        
        /*System.out.println("Starting service update person ws...");
        Person personToUpd = people.get(people.size()-1);
        personToUpd.setName("NameWS Upd");
        personServiceWS.updatePerson(personToUpd);
        System.out.println("Finishing service update person ws...");*/
        
        people.stream().forEach(e -> System.out.println(e.getName()));
        
        Person personToDelete = people.get(people.size()-1);
        personServiceWS.deletePerson(personToDelete);
    }
}
