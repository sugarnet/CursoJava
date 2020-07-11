package ar.com.dss.controller;

import ar.com.dss.domain.Persona;
import ar.com.dss.service.PersonaService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/personas")
public class PersonaController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        PersonaService personaService = new PersonaService();
        
        List<Persona> personas = personaService.listarPersonas();
        request.setAttribute("personas", personas);
        
        try {
            request.getRequestDispatcher("/WEB-INF/listado.jsp").forward(request, response);
        } catch (ServletException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
