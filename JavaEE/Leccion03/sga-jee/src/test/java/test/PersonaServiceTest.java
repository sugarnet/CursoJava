/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ar.com.dss.sga.domain.Person;
import ar.com.dss.sga.service.PersonService;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Diego
 */
public class PersonaServiceTest {
    
    private PersonService personService;

    @Before
    public void setUp() throws Exception {
        EJBContainer contenedor = EJBContainer.createEJBContainer();
        personService = (PersonService) contenedor.getContext().lookup("java:global/classes/PersonServiceImpl!ar.com.dss.sga.service.PersonService");
    }

    @Test
    public void testEJBPersonaService() {
        System.out.println("Iniciando test EJB PersonaService");
        assertTrue(personService != null);

        assertEquals(1, personService.listPeople().size());

        System.out.println("El no. de personas es igual a:" + personService.listPeople().size());

        this.desplegarPersonas(personService.listPeople());
        System.out.println("Fin test EJB PersonaService");
    }

    private void desplegarPersonas(List<Person> personas) {
        for (Person persona : personas) {
            System.out.println(persona);
        }
    }
    
}
