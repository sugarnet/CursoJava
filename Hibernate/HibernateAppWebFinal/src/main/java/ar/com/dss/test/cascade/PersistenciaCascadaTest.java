package ar.com.dss.test.cascade;

import ar.com.dss.domain.Alumno;
import ar.com.dss.domain.Contacto;
import ar.com.dss.domain.Domicilio;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenciaCascadaTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("Nogales");
        domicilio.setNoCalle("10");
        domicilio.setPais("Argentina");
        
        Contacto contacto = new Contacto();
        contacto.setEmail("clara@mail.com");
        contacto.setTelefono("44332211");

        Alumno alumno = new Alumno();
        alumno.setNombre("Carlos");
        alumno.setApellido("Lara");
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);
        
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        
        System.out.println("alumno = " + alumno);
    }
}
