/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolconexiones;

import capadatos.pool.PoolConexionesMysql;
import capadatos.pool.PoolConexionesOracle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author almis
 */
public class PoolConexiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try {
            connection = PoolConexionesMysql.getConnection();
            System.out.println("Utilizamos el pool de conexiones de MySql");
            preparedStatement = connection.prepareStatement("select * from personas");
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                System.out.print(" " + resultSet.getInt(1));
                System.out.print(" " + resultSet.getString(2));
                System.out.println(" " + resultSet.getString(3));
            }
            
            connection.close();
            
            System.out.println();
            System.out.println("Utilizamos el pool de conexiones de Oracle");
            connection = PoolConexionesOracle.getConnection();
            preparedStatement = connection.prepareStatement("select * from employees WHERE employee_id in(100,101,102)");
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                System.out.print(" " + resultSet.getInt(1));
                System.out.print(" " + resultSet.getString(2));
                System.out.println(" " + resultSet.getString(3));
            }
            
            connection.close();
            
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
}
