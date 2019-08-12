/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos.pool;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author almis
 */
public class PoolConexionesMysql {
    
    public static DataSource getDataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("scifo007+");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/sga?useSSL=false");
        basicDataSource.setInitialSize(5);
        
        return basicDataSource;
    }
    
    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }
    
}
