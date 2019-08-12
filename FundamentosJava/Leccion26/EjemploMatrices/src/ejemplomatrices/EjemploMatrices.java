/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatrices;

import com.dss.dominio.matrices.Persona;

/**
 *
 * @author almis
 */
public class EjemploMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		//1.declaramos la matriz de enteros
        int edades[][];
        
		//2.instanciamos la matriz de enteros
        edades = new int[3][2];
        
		//3.inicializamos la matriz de enteros
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 13;
        edades[2][0] = 24;
        edades[2][1] = 3;
        
		//4.leemos los valores de la matriz
        System.out.println("Matriz entero índice 0-0 " + edades[0][0]);
        System.out.println("Matriz entero índice 0-1 " + edades[0][1]);
        System.out.println("Matriz entero índice 1-0 " + edades[1][0]);
        System.out.println("Matriz entero índice 1-1 " + edades[1][1]);
        System.out.println("Matriz entero índice 2-0 " + edades[2][0]);
        System.out.println("Matriz entero índice 2-1 " + edades[2][1]);
        
		//1.declaramos una matriz de tipo Persona
        Persona personas[][] = new Persona[3][2];
        
		//2.inicializamos los valores
        personas[0][0] = new Persona("Diego");
        personas[0][1] = new Persona("Sol");
        personas[1][0] = new Persona("Alma");
        personas[1][1] = new Persona("Rolo");
        personas[2][0] = new Persona("Fabi");
        personas[2][1] = new Persona("Luci");
        
        System.out.println("");
        
		//3.leemos los valores por medio de un ciclo for
        for(int i = 0; i < personas.length; i++) {
            for(int j = 0; j < personas[i].length; j++) {
                System.out.println("Matriz personas índice " + i + "-" + j + ": " + personas[i][j]);
            }
        }
        
		//1.matriz de tipo string, notación simplificada
        String nombres[][] = {{"Diego", "Sol", "Alma"}, {"Tito", "Ani", "Emma"}};
        
        System.out.println("");
        System.out.println("Largo matriz renglones " + nombres.length);
		
		//seleccionando cualquier renglón válido nos regresa el número de columnas
        System.out.println("Largo matriz columnas " + nombres[0].length);
        
		
		//2.imprimimos por salida estándar, con un for anidado para iterar sobre cada fila y luego sobre cada columna
        for(int i = 0; i < nombres.length; i++) {
            for(int j = 0; j < nombres[i].length; j++) {
                System.out.println("Matriz nombres índice " + i + "-" + j + ": " + nombres[i][j]);
            }
        }
    }
    
}
