/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs;


import datos.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author almis
 */
public class TestCursores {
    
    public static void main(String args[]) {
        
        OracleCallableStatement oracleCallableStatement = null;
        OracleResultSet oracleResultSet = null;
        try {
            
            Connection connection = Conexion.getConnection();
            oracleCallableStatement = (OracleCallableStatement) connection.prepareCall("{ ? = call ref_cursor_package.get_dept_ref_cursor(?) }");
            oracleCallableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            oracleCallableStatement.setInt(2, 200);
            oracleCallableStatement.execute();
            oracleResultSet = (OracleResultSet) oracleCallableStatement.getCursor(1);
            
            while(oracleResultSet.next()) {
                System.out.print(" Id_departamento: " + oracleResultSet.getInt(1));
                System.out.print(", Nombre_departamento: " + oracleResultSet.getString(2));
                System.out.print(", Ubicacion_id: " + oracleResultSet.getString(3));
                System.out.println();
            }
            
            Conexion.close(oracleCallableStatement);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
}
