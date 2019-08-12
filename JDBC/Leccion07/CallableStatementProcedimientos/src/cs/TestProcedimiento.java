/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs;

import datos.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author almis
 */
public class TestProcedimiento {
    
    public static void main(String args[]) {
        int empleadoId = 100;
        
        double incrementoSalario = 1.1;
        
        Connection connection = null;
        
        try {
            connection = Conexion.getConnection();
            Statement statement = null;
            ResultSet resultSet = null;
            CallableStatement callableStatement = null;
            
            statement = connection.createStatement();
            
            System.out.println("Aumento del 10% del sueldo al empleado: " + empleadoId);
            callableStatement = connection.prepareCall("{ call set_employee_salary(?,?) }");
            callableStatement.setInt(1, empleadoId);
            callableStatement.setDouble(2, incrementoSalario);
            
            callableStatement.execute();
            callableStatement.close();
            
            String query = "SELECT first_name, salary FROM employees WHERE employee_id = " + empleadoId;
            
            resultSet = statement.executeQuery(query);
            resultSet.next();
            
            System.out.println("Nombre empleado: " + resultSet.getString(1));
            System.out.println("Salario: " + resultSet.getFloat(2));
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
}
