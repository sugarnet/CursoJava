package ar.com.dss.service;

import ar.com.dss.dao.AlumnoDAO;
import ar.com.dss.domain.Alumno;
import java.util.List;

public class AlumnoService {

    private final AlumnoDAO alumnoDao = new AlumnoDAO();

    public List<Alumno> listarAlumnos() {
        return alumnoDao.listar();
    }

    public void guardarAlumno(Alumno alumno) {
        if (alumno != null && alumno.getIdAlumno() == null) {
            alumnoDao.insertar(alumno);
        } else {
            alumnoDao.actualizar(alumno);
        }
    }

    public void eliminarAlumno(Alumno alumno) {
        alumnoDao.eliminar(alumno);
    }

    public Alumno encontrarAlumno(Alumno alumno) {
        return alumnoDao.buscarPorId(alumno);
    }

}
