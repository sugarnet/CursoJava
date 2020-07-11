package demo;

import ar.com.dss.dao.PersonaDAO;
import ar.com.dss.domain.Persona;

public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        // personaDao.listar();
        
        Persona persona = new Persona();
        
        // BÚSQUEDA
        persona.setIdPersona(3); // Indicar un id existente en BD
        persona = personaDao.buscarPersonaPorId(persona);
        // System.out.println("persona encontrada = " + persona);
        
        // INSERCIÓN
        // persona.setNombre("Gustavo");
        // persona.setApellido("Gardel");
        // persona.setEmail("ceratti@mail.com");
        // persona.setTelefono("55449988");
        
        // personaDao.insertar(persona);
        
        // ACTUALIZACIÓN
        // persona.setIdPersona(3); // Indicar un id existente en BD
        // persona.setNombre("Carlos");
        // persona.setApellido("Cerati");
        // persona.setEmail("cgardel@mail.com");
        
        // personaDao.modificar(persona);
        
        // ELIMINACIÓN
        // persona.setIdPersona(3); // Indicar un id existente en BD
        personaDao.eliminar(persona);
        
        // LISTAR
        personaDao.listar();
        
    }
}
