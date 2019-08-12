/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import personas.dto.PersonaDTO;

/**
 *
 * @author almis
 */
public class PersonaDaoJDBC implements PersonaDao{
    
    private Connection connection;
    
    private static final String SQL_INSERT = "INSERT INTO personas (nombre, apellido) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE personas SET nombre=?, apellido=? WHERE id_persona=?";
    private static final String SQL_DELETE = "DELETE FROM personas WHERE id_persona=?";
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido FROM personas ORDER BY id_persona";
    
    public PersonaDaoJDBC() {
        
    }
    
    public PersonaDaoJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Integer insert(PersonaDTO personaDTO) throws SQLException{
        Connection localConnection = null;
        PreparedStatement preparedStatement = null;
        
        int rows = 0;
        
        try {
            localConnection = getConnection();
            preparedStatement = localConnection.prepareStatement(SQL_INSERT);
            
            int index = 1;
            
            preparedStatement.setString(index++, personaDTO.getNombre());
            preparedStatement.setString(index++, personaDTO.getApellido());
            
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
    public Integer update(PersonaDTO personaDTO) throws SQLException{
        Connection localConnection = null;
        PreparedStatement preparedStatement = null;
        
        int rows = 0;
        
        try {
            localConnection = getConnection();
            preparedStatement = localConnection.prepareStatement(SQL_UPDATE);
            
            int index = 1;
            
            preparedStatement.setString(index++, personaDTO.getNombre());
            preparedStatement.setString(index++, personaDTO.getApellido());
            preparedStatement.setInt(index++, personaDTO.getIdPersona());
            
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
    public Integer delete(PersonaDTO personaDTO) throws SQLException{
        Connection localConnection = null;
        PreparedStatement preparedStatement = null;
        
        int rows = 0;
        
        try {
            localConnection = getConnection();
            preparedStatement = localConnection.prepareStatement(SQL_DELETE);
            
            int index = 1;
            
            preparedStatement.setInt(index++, personaDTO.getIdPersona());
            
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
    public List<PersonaDTO> select() throws SQLException{
        Connection localConnection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        PersonaDTO persona = null;
        List<PersonaDTO> personas = new ArrayList<>();
        
        try {
            localConnection = (this.connection != null) ? this.connection : Conexion.getConnection();
            preparedStatement = localConnection.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                Integer idPersona = resultSet.getInt("id_persona");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                persona = new PersonaDTO();
                persona.setApellido(apellido);
                persona.setNombre(nombre);
                persona.setIdPersona(idPersona);
                
                personas.add(persona);
            }
        
        } finally {
            
            Conexion.close(resultSet);
            Conexion.close(preparedStatement);
            if (this.connection == null) {
                Conexion.close(localConnection);
            }
        }
        
        return personas;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return (this.connection != null) ? this.connection : Conexion.getConnection();
    }
    
}
