/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.util.Objects;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Rectangle;

/**
 *
 * @author Diego
 */
@WebServlet(name = "ServletController", urlPatterns = {"/ServletController"})
public class ServletController extends HttpServlet {

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
        
        String action = request.getParameter("action");
        action = Objects.isNull(action) ? "" : action;
        
        Rectangle rectangleRequest = new Rectangle(3, 6);
        Rectangle rectangleSession = new Rectangle(4, 7);
        Rectangle rectangleApp = new Rectangle(5, 8);
        
        switch(action) {
            case "addVars":
                request.setAttribute("rectangleRequest", rectangleRequest);

                HttpSession httpSession = request.getSession();
                httpSession.setAttribute("rectangleSession", rectangleSession);

                ServletContext servletContext = this.getServletContext();
                servletContext.setAttribute("rectangleApp", rectangleApp);

                request.setAttribute("message", "The vars was added!");

                request.getRequestDispatcher("index.jsp").forward(request, response);
                
                break;
                
            case "listVars":
                request.getRequestDispatcher("/WEB-INF/scopeVars.jsp").forward(request, response);
                break;
                
            default:
                request.setAttribute("message", "Action not implemented!");
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
        }
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
