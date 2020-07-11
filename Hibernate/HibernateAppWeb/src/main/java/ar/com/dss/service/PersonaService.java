package ar.com.dss.service;

import ar.com.dss.dao.PersonaDAO;
import ar.com.dss.domain.Persona;
import java.util.List;

public class PersonaService {
    private final PersonaDAO personaDao;
    
    public PersonaService(){
        this.personaDao = new PersonaDAO();
    }
    
    public List<Persona> listarPersonas(){
        return this.personaDao.listar();
    }
    
}
