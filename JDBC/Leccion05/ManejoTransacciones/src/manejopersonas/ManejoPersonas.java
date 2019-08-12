/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejopersonas;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author almis
 */
public class ManejoPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creamos un objeto Connection que se compartirá con todos los querys que ejecutemos
        Connection connection = null;
        
        try {
            
            connection = Conexion.getConnection();
            //revisamos si la conexión está en modo autocommit, por defecto es true
            
            if(connection.getAutoCommit()) {
                connection.setAutoCommit(false);
            }
        
            //creamos el objeto PersonaJDBC y
            //proporcionamos la conexión creada
            PersonaJDBC personasJDBC = new PersonaJDBC(connection);
            
            //empezamos a ejecutar sentencias
            //debemos recordar una una transacción agrupa un conjunto de sentencias
            //si alguna falla no se cambia el estado de la BD
            //Prueba del metodo insert correcto
            personasJDBC.insert("Prueba", "Correcta");
            //Prueba del metodo update incorrecto
            personasJDBC.update(2, "Nombre3", 
                    "ApellidoLargoooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                    //"ApellidoCorrecto");
            
            //guardamos los cambios
            connection.commit();
        } catch (SQLException sqle) {
            //hacemos rollback en caso de error
            try {
                System.out.println("Entramos al rollback");
                //Imprimimos la excepción en la consola
                sqle.printStackTrace();
                //hacemos rollback
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
