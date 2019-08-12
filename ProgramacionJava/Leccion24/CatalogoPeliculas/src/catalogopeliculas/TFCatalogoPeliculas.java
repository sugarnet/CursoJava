/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogopeliculas;

import ar.com.ds.peliculas.negocio.CatalogoPeliculasImpl;
import ar.com.ds.peliculas.negocio.CatalogoPeliculas;
import java.util.Scanner;

/**
 *
 * @author almis
 */
public class TFCatalogoPeliculas {

    private static Scanner scanner = new Scanner(System.in);
    private static int option = -1;
    private static String nombreArchivo = "C:\\pruebaJava\\catalogoPeliculas.txt";
    private static CatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***** MENU *****\n"
                + "1 - Iniciar Catálogo (borra y crea un nuevo archivo)\n"
                + "2 - Agregar Película\n"
                + "3 - Listar Películas\n"
                + "4 - Buscar Película\n"
                + "0 - Salir");
        
        while(option != 0) {
            option = Integer.parseInt(scanner.nextLine());
            String nombrePelicula;
            
            switch(option) {
                case 1:
                    catalogoPeliculas.iniciarArchivo(nombreArchivo);
                    break;
                
                case 2:
                    System.out.println("Introduce el nombre de una película a agregar:");
                    nombrePelicula = scanner.nextLine();
                    catalogoPeliculas.agregarPelicula(nombrePelicula, nombreArchivo);
                    break;
                
                case 3:
                    
                    catalogoPeliculas.listarPeliculas(nombreArchivo);
                    break;
                    
                case 4:
                    System.out.println("Introduce el nombre de pelicula a buscar:");
                    nombrePelicula = scanner.nextLine();
                    catalogoPeliculas.buscarPelicula(nombreArchivo, nombrePelicula);
                    break;
                    
                case 0:
                    System.out.println("Adiós!");
                    break;
                    
                default:
                    System.out.println("Opción no implementada");
                    break;
            }
        }
    }
    
}
