/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import usuarios.dto.UsuarioDTO;

/**
 *
 * @author almis
 */
public class UsuarioDaoJDBC implements UsuarioDao{
    
    private Connection connection;
    
    private static final String SQL_INSERT = "INSERT INTO usuarios (usuario, password) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuarios SET usuario=?, password=? WHERE id_usuario=?";
    private static final String SQL_DELETE = "DELETE FROM usuarios WHERE id_usuario=?";
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuarios ORDER BY id_usuario";
    
    public UsuarioDaoJDBC() {
        
    }
    
    public UsuarioDaoJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Integer insert(UsuarioDTO usuarioDTO) throws SQLException{
        Connection localConnection = null;
        PreparedStatement preparedStatement = null;
        
        int rows = 0;
        
        try {
            localConnection = getConnection();
            preparedStatement = localConnection.prepareStatement(SQL_INSERT);
            
            int index = 1;
            
            preparedStatement.setString(index++, usuarioDTO.getUsuario());
            preparedStatement.setString(index++, usuarioDTO.getPassword());
            
            System.out.println("Ejecutando query: " + SQL_INSERT);
            rows = preparedStatement.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        
        } finally {
            Conexion.close(preparedStatement);
            if (this.connection == null) {
                Conexion.close(localConnection);
            }
        }
        
        return rows;
    }

    @Override
    public Integer update(UsuarioDTO usuarioDTO) throws SQLException{
        Connection localConnection = null;
        PreparedStatement preparedStatement = null;
        
        int rows = 0;
        
        try {
            localConnection = getConnection();
            preparedStatement = localConnection.prepareStatement(SQL_UPDATE);
            
            int index = 1;
            
            preparedStatement.setString(index++, usuarioDTO.getUsuario());
            preparedStatement.setString(index++, usuarioDTO.getPassword());
            preparedStatement.setInt(index++, usuarioDTO.getIdUsuario());
            
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            rows = preparedStatement.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        
        } finally {
            Conexion.close(preparedStatement);
            if (this.connection == null) {
                Conexion.close(localConnection);
            }
        }
        
        return rows;
    }

    @Override
    public Integer delete(UsuarioDTO usuarioDTO) throws SQLException{
        Connection localConnection = null;
        PreparedStatement preparedStatement = null;
        
        int rows = 0;
        
        try {
            localConnection = getConnection();
            preparedStatement = localConnection.prepareStatement(SQL_DELETE);
            
            int index = 1;
            
            preparedStatement.setInt(index++, usuarioDTO.getIdUsuario());
            
            System.out.println("Ejecutando query: " + SQL_DELETE);
            rows = preparedStatement.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        
        } finally {
            Conexion.close(preparedStatement);
            if (this.connection == null) {
                Conexion.close(localConnection);
            }
        }
        
        return rows;
    }

    @Override
    public List<UsuarioDTO> select() throws SQLException{
        Connection localConnection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        UsuarioDTO usuario;
        List<UsuarioDTO> usuarios = new ArrayList<>();
        
        try {
            localConnection = (this.connection != null) ? this.connection : Conexion.getConnection();
            preparedStatement = localConnection.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                Integer idUsuario = resultSet.getInt("id_usuario");
                String user = resultSet.getString("usuario");
                String password = resultSet.getString("password");
                usuario = new UsuarioDTO();
                usuario.setPassword(password);
                usuario.setUsuario(user);
                usuario.setIdUsuario(idUsuario);
                
                usuarios.add(usuario);
            }
        
        } finally {
            
            Conexion.close(resultSet);
            Conexion.close(preparedStatement);
            if (this.connection == null) {
                Conexion.close(localConnection);
            }
        }
        
        return usuarios;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return (this.connection != null) ? this.connection : Conexion.getConnection();
    }
    
}
