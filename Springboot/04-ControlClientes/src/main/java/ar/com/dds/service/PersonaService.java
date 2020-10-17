package ar.com.dds.service;

import ar.com.dds.domain.Persona;
import java.util.List;

public interface PersonaService {
 
    List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
