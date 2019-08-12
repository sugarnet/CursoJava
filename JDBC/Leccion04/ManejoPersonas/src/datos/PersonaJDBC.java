/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author almis
 */
public class PersonaJDBC {
    
    private static final String SQL_INSERT = "INSERT INTO personas (nombre, apellido) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE personas SET nombre=?, apellido=? WHERE id_persona=?";
    private static final String SQL_DELETE = "DELETE FROM personas WHERE id_persona=?";
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido FROM personas ORDER BY id_persona";
    
    public int insert(String nombre, String apellido) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        int rows = 0;
        
        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            
            int index = 1;
            
            preparedStatement.setString(index++, nombre);
            preparedStatement.setString(index++, apellido);
            
            System.out.println("Ejecutando query: " + SQL_INSERT);
            rows = preparedStatement.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            Conexion.close(preparedStatement);
            Conexion.close(connection);
        }
        
        return rows;
    }
    
    public int update(Integer idPersona, String nombre, String apellido) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        int rows = 0;
        
        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE);
            
            int index = 1;
            
            preparedStatement.setString(index++, nombre);
            preparedStatement.setString(index++, apellido);
            preparedStatement.setInt(index++, idPersona);
            
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            rows = preparedStatement.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            Conexion.close(preparedStatement);
            Conexion.close(connection);
        }
        
        return rows;
    }
    
    public int delete(Integer idPersona) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        int rows = 0;
        
        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement(SQL_DELETE);
            
            int index = 1;
            
            preparedStatement.setInt(index++, idPersona);
            
            System.out.println("Ejecutando query: " + SQL_DELETE);
            rows = preparedStatement.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            Conexion.close(preparedStatement);
            Conexion.close(connection);
        }
        
        return rows;
    }
    
    public List<Persona> select() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        
        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                Integer idPersona = resultSet.getInt("id_persona");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                persona = new Persona();
                persona.setApellido(apellido);
                persona.setNombre(nombre);
                persona.setIdPersona(idPersona);
                
                personas.add(persona);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            
            Conexion.close(resultSet);
            Conexion.close(preparedStatement);
            Conexion.close(connection);
        }
        
        return personas;
    }
}
