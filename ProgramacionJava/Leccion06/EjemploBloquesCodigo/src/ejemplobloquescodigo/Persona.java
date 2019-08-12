/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobloquescodigo;

/**
 *
 * @author almis
 */
public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    
    {
        System.out.println("Ejecuta bloque inicializador 2");
    }
    
	//Bloque de código para inicializar atributos de la clase
	//El bloque se copia a cada constructor de la clase
    {
        System.out.println("Ejecuta bloque inicializador 1");
        idPersona = ++contadorPersonas;
    }
	
	//Bloque de inicialización estático
    static {
		//Iniciamos el idPersonas desde el valor 10
        contadorPersonas = 10;
		//Aqui no se pueden usar variables no estáticas
		//idPersona = 1;
        System.out.println("Ejecuta bloque estático 1");
    }
    static {
        contadorPersonas = 10;
        System.out.println("cuando?");
    }

    public Persona() {
        System.out.println("Ejecuta constructor");
    }
    
    
    static {
        System.out.println("Ejecuta bloque estático 2");
    }

    public int getIdPersona() {
        return idPersona;
    }
    
 
    
}
