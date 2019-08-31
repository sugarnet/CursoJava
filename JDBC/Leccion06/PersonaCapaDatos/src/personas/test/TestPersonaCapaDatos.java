/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.test;

import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;
import personas.jdbc.PersonaDao;
import personas.jdbc.PersonaDaoJDBC;

/**
 *
 * @author almis
 */
public class TestPersonaCapaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //utilizamos la interface como referencia a una clase concreta
        PersonaDao personaDao = new PersonaDaoJDBC();
        
        //creamos un nuevo registro, hacemos uso de la clase PersonaDTO
        //que se encargará de transportar los datos asociados a la persona
        //no hace falta asignar el id ya que en a BD está cofigurado para
        //que se autogenere
        
        PersonaDTO personaDTO = new PersonaDTO();
        personaDTO.setNombre("Alberto");
        personaDTO.setApellido("Parra");
        
        //utilizamos la capa DAO para persistir el contenido del DTO
        try {
            //insertamos un registro
            personaDao.insert(personaDTO);
            
            //eliminamos un registro
            PersonaDTO personaAEliminar = new PersonaDTO();
            personaAEliminar.setIdPersona(4);
            personaDao.delete(personaAEliminar);
            
            //actualizamos un registro
            PersonaDTO personaARefrescar = new PersonaDTO();
            personaARefrescar.setIdPersona(2);
            personaARefrescar.setNombre("Pepe");
            personaARefrescar.setApellido("Sanchez");   
            personaDao.update(personaARefrescar);
            
            //mostramos los registros almacenados en BD
            List<PersonaDTO> personas = personaDao.select();
            for(PersonaDTO persona : personas) {
                System.out.println(persona);
            }
            
        } catch (SQLException sqle) {
            System.out.println("Excepción en la capa de prueba");
            sqle.printStackTrace();
        }
    }
    
}
