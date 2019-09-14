/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import usuarios.dto.UsuarioDTO;

/**
 *
 * @author almis
 */
public interface UsuarioDao {
    public Integer insert(UsuarioDTO personaDTO) throws SQLException;
    public Integer update(UsuarioDTO personaDTO) throws SQLException;
    public Integer delete(UsuarioDTO personaDTO) throws SQLException;
    public List<UsuarioDTO> select() throws SQLException;
    public Connection getConnection() throws SQLException;
}
