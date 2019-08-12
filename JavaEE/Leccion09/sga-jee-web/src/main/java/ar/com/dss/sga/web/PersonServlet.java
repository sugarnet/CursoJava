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
import java.util.Objects;
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
@WebServlet({"/people", "/PersonServlet"})
public class PersonServlet extends HttpServlet {

    @Inject
    PersonService personService;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("action");

        if (Objects.isNull(action)) {
            listPeople(request, response);
        } else {
            switch (action) {
                case "add":
                    addPerson(request, response);
                    break;

                case "edit":
                    editPerson(request, response);
                    break;

                case "update":
                    updatePerson(request, response);
                    break;

                case "delete":
                    deletePerson(request, response);
                    break;

                default:
                    listPeople(request, response);
            }
        }

    }

    private void deletePerson(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.valueOf(request.getParameter("id"));
        Person person = new Person(id);

        person = personService.findPersonById(person);
        personService.deletePerson(person);

        listPeople(request, response);
    }

    private void updatePerson(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String id = request.getParameter("id");

        Person person = new Person(Integer.valueOf(id), name, lastName, email, phone);

        personService.updatePerson(person);

        listPeople(request, response);

    }

    private void addPerson(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String lastName = request.getParameter("lastname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        Person person = new Person(name, lastName, email, phone);

        personService.addPerson(person);

        listPeople(request, response);
    }

    private void editPerson(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.valueOf(request.getParameter("id"));
        Person person = new Person(id);
        person = personService.findPersonById(person);
        request.setAttribute("person", person);
        request.getRequestDispatcher("/editPerson.jsp").forward(request, response);
    }

    private void listPeople(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Person> people = personService.listPeople();
        System.out.println("Personas: " + people);
        request.setAttribute("people", people);
        request.getRequestDispatcher("/peopleList.jsp").forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
