/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs;

import datos.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author almis
 */
public class TestFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int empleadoId = 100;
        try {
            Connection connection = Conexion.getConnection();
            CallableStatement callableStatement = null;
            double salarioMensual;
            
            callableStatement = connection.prepareCall("{ ? = call get_employee_salary(?) }");
            callableStatement.registerOutParameter(1, java.sql.Types.INTEGER);
            callableStatement.setInt(2, empleadoId);
            
            callableStatement.execute();
            salarioMensual = callableStatement.getDouble(1);
            callableStatement.close();
            System.out.println("Empleado con id: " + empleadoId);
            System.out.println("Salario $: " + salarioMensual);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
}
