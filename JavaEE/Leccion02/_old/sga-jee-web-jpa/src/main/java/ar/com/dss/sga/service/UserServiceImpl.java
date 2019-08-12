/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.service;

import ar.com.dss.sga.dao.UserDao;
import ar.com.dss.sga.domain.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Diego
 */
@Stateless
public class UserServiceImpl implements UserService{
    
    @Inject
    UserDao userDao;

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public User findById(User user) {
        return userDao.findById(user);
    }

    @Override
    public User findByUsername(User user) {
        return userDao.findByUsername(user);
    }

    @Override
    public User findByPassword(User user) {
        return userDao.findByPassword(user);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }
    
}
