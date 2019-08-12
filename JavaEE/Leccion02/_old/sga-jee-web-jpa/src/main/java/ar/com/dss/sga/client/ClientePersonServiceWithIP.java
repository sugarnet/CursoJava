/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.sga.client;

import ar.com.dss.sga.domain.Person;
import ar.com.dss.sga.service.PersonServiceRemote;
import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Diego
 */
public class ClientePersonServiceWithIP {
    private static final Logger LOGGER = LogManager.getRootLogger();
    public static void main(String args[]){
        LOGGER.info("Iniciando llamada al EJB desde el cliente");
        
        try {
            Properties properties = new Properties();
            
            properties.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            properties.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            properties.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            //opcional. Default localhost, aquí se cambia la ip del servidor de glassfish
            properties.setProperty("org.omg.CORBA.ORBInitialHost", "127.0.0.1");
            //Optional puerto por default 3700. solo es necesario cambia si el puerto es diferente
            //properties.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
            
            Context context = new InitialContext(properties);
            
            PersonServiceRemote personServiceRemote = (PersonServiceRemote) 
                    context.lookup("java:global/sga-jee-web/PersonServiceRemoteImpl!ar.com.dss.sga.service.PersonServiceRemote");
            
            List<Person> people = personServiceRemote.listPeople();
            
            for(Person person : people) {
                LOGGER.info(person);
            }
            LOGGER.info("Fin llamada al EJB desde el cliente");
            
        } catch (NamingException ne) {
            LOGGER.error(ne);
        }
        
    }
}
