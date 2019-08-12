package test;

import ar.com.dss.sga.domain.Person;
import ar.com.dss.sga.service.PersonServiceRemote;
import com.sun.enterprise.security.ee.auth.login.ProgrammaticLogin;
import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClientPersonServiceWithIP {

    public static void main(String[] args) {

        System.out.println("Iniciando llamada remota al EJB desde el cliente\n");

        String authFile = "login.conf";
        System.setProperty("java.security.auth.login.config", authFile);
        ProgrammaticLogin programmaticLogin = new ProgrammaticLogin();
        programmaticLogin.login("admin", "admin".toCharArray());
        
        try {
            Properties props = new Properties();
            props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");

            // optional. Default localhost. Aqui se cambia la IP del servidor donde esta Glassfish
            props.setProperty("org.omg.CORBA.ORBInitialHost", "127.0.0.1");

            // optional. Puerto por Default 3700. Solo se necesita cambiar si el puerto no es 3700.
            //props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
            Context jndi = new InitialContext(props);
            PersonServiceRemote personService = (PersonServiceRemote) jndi.lookup("java:global/sga-jee-web/PersonServiceImpl!ar.com.dss.sga.service.PersonServiceRemote");
            
            List<Person> people = personService.listPeople();

            for (Person person : people) {
                System.out.println(person);
            }
            System.out.println("\nFin llamada remota al EJB desde el cliente");
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
