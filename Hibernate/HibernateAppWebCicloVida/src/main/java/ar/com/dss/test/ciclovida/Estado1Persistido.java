package ar.com.dss.test.ciclovida;

import javax.persistence.*;
import ar.com.dss.domain.Contacto;

public class Estado1Persistido {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();
        
        //1. estado transitivo
        Contacto contacto = new Contacto();
        contacto.setEmail("rfort");
        contacto.setTelefono("11223344");
        
        //2.persistimos el objeto
        em.getTransaction().begin();
        
        em.persist(contacto);
        
        em.getTransaction().commit();
        
        //3. detached (separado)
        System.out.println("contacto = " + contacto);
    }
    
}
