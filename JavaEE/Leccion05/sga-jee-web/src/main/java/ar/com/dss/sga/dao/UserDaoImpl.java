/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.dao;

import ar.com.dss.sga.domain.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diego
 */
@Stateless
public class UserDaoImpl implements UserDao {
    
    @PersistenceContext(unitName = "PersonPU")
    EntityManager entityManager;

    @Override
    public List<User> listUsers() {
        return entityManager.createNamedQuery("User.findAll").getResultList();
    }

    @Override
    public User findById(User user) {
        return (User) entityManager.createNamedQuery("User.findById").getSingleResult();
    }

    @Override
    public User findByUsername(User user) {
        return (User) entityManager.createNamedQuery("User.findByUsername").getSingleResult();
    }

    @Override
    public User findByPassword(User user) {
        return (User) entityManager.createNamedQuery("User.findByPassword").getSingleResult();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(User user) {
        entityManager.remove(user);
    }
    
}
