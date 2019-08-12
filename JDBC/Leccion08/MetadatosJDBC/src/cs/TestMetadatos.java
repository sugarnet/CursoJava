/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs;


import datos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OracleResultSetMetaData;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author almis
 */
public class TestMetadatos {
    
    public static void main(String args[]) {
        
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            
            connection = Conexion.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM employees");
            
            OracleResultSetMetaData oracleResultSetMetaData = (OracleResultSetMetaData) resultSet.getMetaData();
            
            if(resultSet == null) {
                System.out.println("Metadatos no disponibles");
            } else {
                int columnsCount = oracleResultSetMetaData.getColumnCount();
                
                System.out.println("Nro de columnas: " + columnsCount);
                
                for(int i = 1; i <= columnsCount; i++) {
                    System.out.print("Nombre columna: " + oracleResultSetMetaData.getColumnName(i));
                    System.out.print(", Tipo dato columna: " + oracleResultSetMetaData.getColumnTypeName(i));
                    
                    switch(oracleResultSetMetaData.isNullable(i)) {
                        case OracleResultSetMetaData.columnNullable:
                            System.out.print(", Acepta nulos");
                            break;
                            
                        case OracleResultSetMetaData.columnNoNulls:
                            System.out.print(", No acepta nulos");
                            break;
                            
                        case OracleResultSetMetaData.columnNullableUnknown:
                            System.out.print(", Desconocido");
                            break;
                    }
                    System.out.println();
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(resultSet);
            Conexion.close(connection);
        }
    }
    
}
