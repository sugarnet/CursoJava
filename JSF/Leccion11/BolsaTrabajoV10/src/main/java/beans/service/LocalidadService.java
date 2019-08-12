/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.service;

import beans.domain.Localidad;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diego
 */
@Stateless
public class LocalidadService {
    @PersistenceContext
    EntityManager entityManager;
    
    public List<Localidad> findAll() {
        return entityManager.createNamedQuery("Localidad.findAll").getResultList();
    }
}
