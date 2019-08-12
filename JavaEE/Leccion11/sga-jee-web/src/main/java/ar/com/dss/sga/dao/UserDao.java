/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.dao;

import ar.com.dss.sga.domain.User;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface UserDao {
    List<User> listUsers();
    User findById(User user);
    User findByUsername(User user);
    User findByPassword(User user);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
}
