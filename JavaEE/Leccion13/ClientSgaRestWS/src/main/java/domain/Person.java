/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Diego
 */
@XmlRootElement
public class Person {
    private Integer id;
    private String name;
    private String lastName;
    private String email;
    private String phone;

    public Person(){}
    
    public Person(String name, String lastName, String email, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + '}';
    }
    
    
}
