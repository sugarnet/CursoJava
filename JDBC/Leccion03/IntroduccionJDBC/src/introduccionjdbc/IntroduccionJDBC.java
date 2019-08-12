/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author almis
 */
public class IntroduccionJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cadena de conexión de MySql, el parámetro useSSL es opcional
        String url = "jdbc:mysql://localhost:3306/sga?useSSL=false";
        
        //cargamos el driver de mysql
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            //creamos el objeto conexión
            Connection connection = (Connection) DriverManager.getConnection(url, "root", "scifo007+");
            
            //creamos un objeto statement
            Statement statement = connection.createStatement();
            
            //creamos el query
            String sql = "select id_persona, nombre, apellido from personas";
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()) {
                System.out.print("id_persona: " + resultSet.getInt("id_persona"));
                System.out.print(", nombre: " + resultSet.getString("nombre"));
                System.out.println(", apellido: " + resultSet.getString("apellido"));
            }
            
            //cerramos los objetos utilizados
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
}
