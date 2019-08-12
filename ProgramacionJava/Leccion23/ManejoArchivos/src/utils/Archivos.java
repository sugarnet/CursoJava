/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author almis
 */
public class Archivos {
    
    public static void crearArchivo(String nombreArchivo) {
        File file = new File(nombreArchivo);
        
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file));
            printWriter.close();
            System.out.println("El archivo ha sido creado correctamente");
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    public static void escribirArchivo(String nombreArchivo) {
        File file = new File(nombreArchivo);
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file));
            String contenido = "Contenido del archivo";
            printWriter.println(contenido);
            printWriter.println();
            printWriter.println("Fin escritura...");
            printWriter.close();
            
            System.out.println("Se terminó de escribir el archivo");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    public static void leerArchivo(String nombreArchivo) {
        File file = new File(nombreArchivo);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String lectura;
            lectura = bufferedReader.readLine();
            int i = 0;
            while(lectura != null) {
                System.out.println("Línea " + (++i) + ": " + lectura);
                lectura = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    public static void anexarArchivo(String nombreArchivo) {
        File file = new File(nombreArchivo);
        
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            String contenido = "Anexando información";
            printWriter.println(contenido);
            printWriter.println();
            printWriter.println("Fin anexado...");
            printWriter.close();
            
            System.out.println("Se ha anexado información al archivo");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
