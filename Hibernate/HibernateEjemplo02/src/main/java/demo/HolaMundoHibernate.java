package demo;

import ar.com.dss.domain.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HolaMundoHibernate {
    public static void main(String[] args) {
        String hql = "SELECT p FROM Persona p";
        EntityManagerFactory fabrica 
                = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager entityManager = fabrica.createEntityManager();
        
        Query query = entityManager.createQuery(hql);
        List<Persona> personas = query.getResultList();
//        for(Persona p: personas){
//            System.out.println("Persona:" + p);
//        }
        
        personas.stream().forEach(System.out::println);
    }
}
