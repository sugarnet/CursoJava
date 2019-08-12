/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarreglos;

import com.dss.dominio.arreglos.Persona;

/**
 *
 * @author almis
 */
public class EjemploArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1.declaramos un arreglo de enteros
        int edades[];
        
		//2.instanciamos el arreglo de enteros
        edades = new int[3];
        
		//3.inicializamos los valores
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        
        //imprimimos los valores por la salida estándar
        //4.leemos los valores de cada elemento del arreglo
        System.out.println("Arreglo enteros índice 0: " + edades[0]);
        System.out.println("Arreglo enteros índice 1: " + edades[1]);
        System.out.println("Arreglo enteros índice 2: " + edades[2]);
        
        //1.declaramos un arreglo de tipo Persona
        Persona personas[];
        //2.instanciamos 
        personas = new Persona[4];
        
		//3.inicializamos los valores
        personas[0] = new Persona("Diego");
        personas[1] = new Persona("Alma");
        personas[2] = new Persona("Sol");
        
		//4.leemos los valores de cada elemento del arreglo
        System.out.println("");
        System.out.println("Arreglo personas índice 0: " + personas[0]);
        System.out.println("Arreglo personas índice 1: " + personas[1]);
        System.out.println("Arreglo personas índice 2: " + personas[2]);
        
		//1.arreglo de string, notación simplificada
        String nombres[] = {"Fabi", "Rolo", "Stella", "Luci"};
        
		//imprimimos los valores en la salida estándar
		//2.iteramos el arreglo con un for
        System.out.println("");
        
        for(int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo String índice " + i + ": " + nombres[i]);
        }
        
    }
    
}
