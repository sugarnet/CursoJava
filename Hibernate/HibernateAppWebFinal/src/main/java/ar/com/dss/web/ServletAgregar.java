package ar.com.dss.web;

import ar.com.dss.domain.Alumno;
import ar.com.dss.domain.Contacto;
import ar.com.dss.domain.Domicilio;
import ar.com.dss.service.AlumnoService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletAgregar", urlPatterns = {"/ServletAgregar"})
public class ServletAgregar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String calle = request.getParameter("calle");
        String noCalle = request.getParameter("noCalle");
        String pais = request.getParameter("pais");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");

        Domicilio domicilio = new Domicilio();
        domicilio.setCalle(calle);
        domicilio.setNoCalle(noCalle);
        domicilio.setPais(pais);

        Contacto contacto = new Contacto();
        contacto.setEmail(email);
        contacto.setTelefono(telefono);

        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);

        AlumnoService servicioAlumno = new AlumnoService();
        servicioAlumno.guardarAlumno(alumno);

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
