/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;

/**
 *
 * @author almis
 */
public interface PersonaDao {
    public Integer insert(PersonaDTO personaDTO) throws SQLException;
    public Integer update(PersonaDTO personaDTO) throws SQLException;
    public Integer delete(PersonaDTO personaDTO) throws SQLException;
    public List<PersonaDTO> select() throws SQLException;
    public Connection getConnection() throws SQLException;
}
