/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.web;

import ar.com.dss.sga.domain.Person;
import ar.com.dss.sga.service.PersonService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Diego
 */
@WebServlet("/people")
public class PeopleServlet extends HttpServlet{
    
    @Inject
    PersonService personService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Person> people = personService.listPeople();
        
        System.out.println("People: " + people);
        req.setAttribute("people", people);
        req.getRequestDispatcher("/peopleList.jsp").forward(req, resp);
    }
    
    
    
}
