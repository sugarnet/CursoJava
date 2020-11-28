package ar.com.dds.dao;

import ar.com.dds.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona, Long> {
    
}
