/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ar.com.dss.sga.domain.Person;
import ar.com.dss.sga.domain.User;
import ar.com.dss.sga.service.PersonService;
import ar.com.dss.sga.service.UserService;
import java.util.List;
import java.util.Objects;
import javax.ejb.embeddable.EJBContainer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Diego
 */
public class TestEntities {
    
    private static final Logger LOGGER = LogManager.getRootLogger();
    /*static EntityManager entityManager = null;
    static EntityTransaction entityTransaction = null;
    static EntityManagerFactory entityManagerFactory = null;
    
    
    @BeforeClass
    public static void init() throws Exception {
        entityManagerFactory = Persistence.createEntityManagerFactory("ConsolaJpqlPU");
    }
    
    @Before
    public void setup() {
        try {
            entityManager = entityManagerFactory.createEntityManager();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testPersonEntity() {
        log.debug("Iniciando test Person Entity con JPA");
        
        assertTrue(Objects.nonNull(entityManager));
        
        entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        Person person1 = new Person("Diego", "Scifo", "diegoscifo@yahoo.com.ar", "2634571423");
        
        log.debug("Objeto a persistir: " + person1);
        
        entityManager.persist(person1);
        
        entityTransaction.commit();
        
        assertTrue(Objects.nonNull(person1.getId()));
        log.debug("Objeto persistido: " + person1);
        log.debug("Fin test Person Entity con JPA");
    }
    
    @After
    public void tearDown() throws Exception {
        if(Objects.nonNull(entityManager)) {
            entityManager.close();
        }
    }*/
    
    private PersonService personService;
    private UserService userService;

    EJBContainer contenedor;

    @Before
    public void setUp() throws Exception {
        contenedor = EJBContainer.createEJBContainer();
        
        LOGGER.info("Abriendo contenedor embebido Glassfish");
        
        personService = (PersonService) contenedor.getContext().lookup("java:global/classes/PersonServiceImpl!ar.com.dss.sga.service.PersonService");
        userService = (UserService) contenedor.getContext().lookup("java:global/classes/UserServiceImpl!ar.com.dss.sga.service.UserService");
    }

    @Test
    public void testEJB() {
        this.testEJBPersonService();
        this.testEJBUserService();
    }
    
    private void testEJBPersonService() {
        LOGGER.info("Iniciando test EJB PersonaService");
        assertTrue(personService != null);

        assertEquals(2, personService.listPeople().size());

        LOGGER.info("El no. de personas es igual a:" + personService.listPeople().size());

        this.desplegarPersonas(personService.listPeople());
        LOGGER.info("Fin test EJB PersonaService");
    }

    private void testEJBUserService() {
        LOGGER.info("Iniciando test EJB UsuarioService");
        assertTrue(userService != null);

        assertEquals(1, userService.listUsers().size());

        LOGGER.info("El no. de usuarios es igual a:" + userService.listUsers().size());

        this.desplegarUsuarios(userService.listUsers());
        LOGGER.info("Fin test EJB UsuarioService");
    }

    private void desplegarUsuarios(List<User> usuarios) {
        for (User u : usuarios) {
            LOGGER.info(u);
        }
    }

    private void desplegarPersonas(List<Person> personas) {

        for (Person p : personas) {
            LOGGER.info(p);
        }
        //Esto genera un error ya que el servidor embebido no soporta Java 8
        //personas.forEach((persona) -> {
        //    System.out.println(persona);
        //});
    }
    
}
