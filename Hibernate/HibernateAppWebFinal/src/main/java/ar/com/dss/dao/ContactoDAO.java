package ar.com.dss.dao;

import java.util.List;
import javax.persistence.Query;
import static ar.com.dss.dao.GenericDAO.em;
import ar.com.dss.domain.Contacto;

public class ContactoDAO extends GenericDAO {

    public List<Contacto> listar() {
        String consulta = "SELECT c FROM Contacto c";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Contacto contacto) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(contacto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }

    public void actualizar(Contacto contacto) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(contacto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }

    public void eliminar(Contacto contacto) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(contacto));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    public Contacto buscarPorId(Contacto contacto){
        em = getEntityManager();
        return em.find(Contacto.class, contacto.getIdContacto());
    }

}
