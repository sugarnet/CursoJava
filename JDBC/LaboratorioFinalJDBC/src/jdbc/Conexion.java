/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author almis
 */
public class Conexion {
    
    private static String JDBC_DRIVER;
    private static String JDBC_URL;
    private static String JDBC_USER;
    private static String JDBC_PASS;
    private static String JDBC_FILE_NAME = "jdbc";
    
    public static Properties loadProperties(String file) {
        Properties properties = new Properties();
        
        ResourceBundle resourceBundle = ResourceBundle.getBundle(file);
        Enumeration e = resourceBundle.getKeys();
        String key = null;
        
        while(e.hasMoreElements()) {
            key = e.nextElement().toString();
            properties.put(key, resourceBundle.getObject(key));
        }
        
        JDBC_DRIVER = properties.getProperty("driver");
        JDBC_URL = properties.getProperty("url");
        JDBC_USER = properties.getProperty("user");
        JDBC_PASS = properties.getProperty("pass");
        
        return properties;
    }
    
    private static DataSource getDataSource() {
        loadProperties(JDBC_FILE_NAME);
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(JDBC_DRIVER);
        basicDataSource.setUsername(JDBC_USER);
        basicDataSource.setPassword(JDBC_PASS);
        basicDataSource.setUrl(JDBC_URL);
        basicDataSource.setInitialSize(5);
        
        return basicDataSource;
    }
    
    public static Connection getConnection() throws SQLException {
        
        return getDataSource().getConnection();
    }
}
