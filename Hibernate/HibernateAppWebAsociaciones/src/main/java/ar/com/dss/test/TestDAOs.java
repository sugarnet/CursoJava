package ar.com.dss.test;

import java.util.List;
import ar.com.dss.dao.AlumnoDAO;
import ar.com.dss.dao.AsignacionDAO;
import ar.com.dss.dao.ContactoDAO;
import ar.com.dss.dao.CursoDAO;
import ar.com.dss.dao.DomicilioDAO;

public class TestDAOs {
    public static void main(String[] args) {
        AlumnoDAO alumnoDao = new AlumnoDAO();
        System.out.println("Alumnos:");
        imprimir(alumnoDao.listar());
        
        System.out.println("Domicilios:");
        DomicilioDAO domicilioDao = new DomicilioDAO();
        imprimir(domicilioDao.listar());
        
        System.out.println("Contacto:");
        ContactoDAO contactoDao = new ContactoDAO();
        imprimir(contactoDao.listar());
        
        System.out.println("Cursos:");
        CursoDAO cursoDao = new CursoDAO();
        imprimir(cursoDao.listar());
        
        System.out.println("Asignaciones:");
        AsignacionDAO asignacionDao = new AsignacionDAO();
        imprimir(asignacionDao.listar());
    }
    
    private static void imprimir(List coleccion){
        for(Object o: coleccion){
            System.out.println("valor = " + o);
        }
    }
}
