package sga.eis.jdbc;

import java.sql.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class ResourceManager {

  private static String JDBC_DRIVER;// = "com.mysql.jdbc.Driver";
  private static String JDBC_URL;// = "jdbc:mysql://localhost/sga";
  private static String JDBC_USER;// = "root";
  private static String JDBC_PASS;// = "admin";
  private static int MAX_POOL_SIZE;
  private static int IDLE_TIME_POOL;
  private static Driver driver = null;
  private static String JDBC_FILE_NAME = "ConexionJDBC";

  private BasicDataSource ds = new BasicDataSource();
  /**
   * Funcion para el manejo de los valores de la conexion en un
   * archivo de propidades
   *
   * @param file
   * @return
   */
  public static Properties loadProperties(String file) {
    Properties prop = new Properties();
    ResourceBundle bundle = ResourceBundle.getBundle(file);
    Enumeration e = bundle.getKeys();
    String key = null;
    while (e.hasMoreElements()) {
      key = (String) e.nextElement();
      prop.put(key, bundle.getObject(key));
    }

    // Asignamos los valores del archivo de propiedades
    // a las variables de la clase
    JDBC_DRIVER = prop.getProperty("driver");
    JDBC_URL = prop.getProperty("url");
    JDBC_USER = prop.getProperty("user");
    JDBC_PASS = prop.getProperty("pass");
    MAX_POOL_SIZE = Integer.parseInt(prop.getProperty("max_pool_size"));
    IDLE_TIME_POOL = Integer.parseInt(prop.getProperty("idle_time"));
    // Regresamos el objeto properties con los valores
    // de la conexion a la BD
    return prop;
  }

  /**
   * Funciona que nos regresa un DataSource considerando valores
   * de un pool de conexiones
   *
   * @return
   */
  private ResourceManager() {
    // Cargamos los valores del archivo de propiedades
    loadProperties(JDBC_FILE_NAME);
    ds.setDriverClassName(JDBC_DRIVER);
    ds.setUrl(JDBC_URL);
    ds.setUsername(JDBC_USER);
    ds.setPassword(JDBC_PASS);
    // Definimos el tamaño del pool de conexiones
    ds.setMaxTotal(MAX_POOL_SIZE);// en este caso son 20
    // conexiones abiertas
    ds.setMaxIdle(IDLE_TIME_POOL);// definimos el tiempo de espera
    
  }
  
  private static class ResourceManagerHolder {
      private static final ResourceManager INSTANCE = new ResourceManager();
  }
  
  public static ResourceManager getInstance() {
      return ResourceManagerHolder.INSTANCE;
  }
  
  public BasicDataSource getBasicDataSource() {
      return ds;
  }
  
  public void setBasicDataSource(BasicDataSource bds) {
      this.ds = bds;
  }

  public static void close(Connection conn) {
    try {
      if (conn != null) {
        conn.close();
      }
    } catch (SQLException sqle) {
      sqle.printStackTrace();
    }
  }

  public static void close(PreparedStatement stmt) {
    try {
      if (stmt != null) {
        stmt.close();
      }
    } catch (SQLException sqle) {
      sqle.printStackTrace();
    }
  }

  public static void close(ResultSet rs) {
    try {
      if (rs != null) {
        rs.close();
      }
    } catch (SQLException sqle) {
      sqle.printStackTrace();
    }

  }
}
