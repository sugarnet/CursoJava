/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.service;

import ar.com.dss.sga.domain.User;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Diego
 */
@Local
public interface UserService {
    List<User> listUsers();
    User findById(User user);
    User findByUsername(User user);
    User findByPassword(User user);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
}
