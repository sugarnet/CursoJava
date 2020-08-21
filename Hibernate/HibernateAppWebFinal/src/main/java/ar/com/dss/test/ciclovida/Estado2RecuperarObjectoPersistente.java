package ar.com.dss.test.ciclovida;

import javax.persistence.*;
import ar.com.dss.domain.Contacto;

public class Estado2RecuperarObjectoPersistente {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();

        //definimos la variable
        Contacto contacto = null;

        em.getTransaction().begin();
        //recuperamos el objeto
        contacto = em.find(Contacto.class, 3);

        em.getTransaction().commit();

        //detached
        System.out.println("contacto = " + contacto);
    }

}
