package ar.com.dss.web;

import ar.com.dss.domain.Alumno;
import ar.com.dss.service.AlumnoService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletController", urlPatterns = {"/ServletController"})
public class ServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AlumnoService servicioAlumno = new AlumnoService();

        List<Alumno> alumnos = servicioAlumno.listarAlumnos();

        request.setAttribute("alumnos", alumnos);

        try {
            request.getRequestDispatcher("/WEB-INF/listarAlumnos.jsp").forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }
}
