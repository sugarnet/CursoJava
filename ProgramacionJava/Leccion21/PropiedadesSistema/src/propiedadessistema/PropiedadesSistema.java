/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propiedadessistema;

import java.util.Enumeration;
import java.util.Properties;

/**
 *
 * @author almis
 */
public class PropiedadesSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Properties properties = System.getProperties();
        Enumeration enumeration = properties.propertyNames();
        
        while(enumeration.hasMoreElements()) {
            String propertyName = (String) enumeration.nextElement();
            String propertyValue = properties.getProperty(propertyName);
            
            System.out.println("Nombre: " + propertyName + " Valor: " + propertyValue);
        }
    }
    
}
