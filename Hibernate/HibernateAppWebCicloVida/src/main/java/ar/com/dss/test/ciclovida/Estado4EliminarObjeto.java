package ar.com.dss.test.ciclovida;

import javax.persistence.*;
import ar.com.dss.domain.Contacto;

public class Estado4EliminarObjeto {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();

        //definimos la variable
        Contacto contacto = null;

        //recuperamos el objeto
        //1. transitivo
        contacto = em.find(Contacto.class, 3);

        em.getTransaction().begin();

        //3. remove
        em.remove(em.merge(contacto));

        em.getTransaction().commit();

        //3. transitivo
        System.out.println("contacto = " + contacto);
    }

}
