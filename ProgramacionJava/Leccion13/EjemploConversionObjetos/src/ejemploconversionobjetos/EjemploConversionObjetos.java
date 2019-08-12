/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconversionobjetos;

/**
 *
 * @author almis
 */
public class EjemploConversionObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		
		//1. Creamos un tipo de más alta jerarquía
		//Asignamos una referencia de un objeto de menor jerarquia
		//Esto es upcasting, no hay necesidad de una notación especial
        Empleado empleado = new Escritor("Diego", 25000, TipoEscritura.MODERNO);
        
		//Sin embargo si quisiéramos acceder al detalle de la clase Escritor
		//No es posible, ya que esas caracteristicas no están en común
		//entre todas las clases de la jerarquía
		//emp.getTipoDeEscrituraEnTexto();
		
		//Imprimimos los detalles en un método genérico
        imprimirDetalles(empleado);
        
		//2. Podemos hacer lo mismo con la clase Gerente
		//Esto es upcasting, por lo que no requiere una sintaxis especial
        empleado = new Gerente("Sol", 35000, "Sistemas");
        
		//Pero si queremos acceder directo por la variable empleado
		//al detalle del objeto Gerente no es posible, se pierde el acceso
		//empleado.getDepartamento();

		//Utilizamos el mismo metodo para imprimir los detalles
        imprimirDetalles(empleado);
    }
    
	//Método genérico para imprimir los detalles de la jerarquía Empleado
    private static void imprimirDetalles(Empleado empleado) {
        String resultado = "";
        
		//Imprimir detalles es general para todos ya que es por polimorfimo
		//no se necesita de ninguna conversión
        System.out.println("\nDetalle:" + empleado);
        
		//Pero los detalles de cada clase debemos hacer un downcasting
        if(empleado instanceof Escritor) {
			//Convertimos el objeto al tipo inferior deseado
			//Convierte objeto - Downcasting
            Escritor escritor = (Escritor) empleado;
            
			//Finalmente podemos acceder a los metodos de la clase Escritor
            resultado = escritor.getTipoEscrituraEnTexto();
            
			//Otra forma es hacer la conversión en la misma línea de código.
			//Esto es muy común encontrarlo en Java
			//para evitar la creación de variables innecesarias
            resultado = ((Escritor) empleado).getTipoEscrituraEnTexto();
            
            System.out.println("Resutado tipo escritura: " + resultado);
        } else if (empleado instanceof Gerente) {
            Gerente gerente = (Gerente) empleado;
            
            resultado = gerente.getDepartamento();
            
            System.out.println("Resultado Departamento: " + resultado);
        }
    }
    
}
