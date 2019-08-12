/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import utils.Archivos;

/**
 *
 * @author almis
 */
public class ManejoArchivos {

    //Debe estar creada la carpeta en donde se depositará el archivo
    private static final String NOMBRE_ARCHIVO = "C:\\pruebaJava\\pruebaJava.txt";
    //private static final String NOMBRE_ARCHIVO = "pruebaJava.txt";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Archivos.crearArchivo(NOMBRE_ARCHIVO);
        Archivos.escribirArchivo(NOMBRE_ARCHIVO);
        Archivos.leerArchivo(NOMBRE_ARCHIVO);
        Archivos.anexarArchivo(NOMBRE_ARCHIVO);
        Archivos.leerArchivo(NOMBRE_ARCHIVO);
    }
    
}
