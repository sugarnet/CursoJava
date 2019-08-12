/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ds.peliculas.datos;

import ar.com.ds.peliculas.domain.Pelicula;
import ar.com.ds.peliculas.excepciones.AccesosDatosException;
import ar.com.ds.peliculas.excepciones.EscrituraDatosException;
import ar.com.ds.peliculas.excepciones.LecturaDatosException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author almis
 */
public class AccesoDatosImpl implements AccesoDatos{

    @Override
    public boolean existe(String nombreArchivo) throws AccesosDatosException{
        File file = new File(nombreArchivo);
        
        return file.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosException{
        File file = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String nombrePelicula = bufferedReader.readLine();
            while(nombrePelicula != null) {
                peliculas.add(new Pelicula(nombrePelicula));
                nombrePelicula = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosException{
        File file = new File(nombreArchivo);
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, anexar));
            printWriter.println(pelicula.getNombre());
            printWriter.close();
            System.out.println("Se ha escrito correctamente!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosException{
        File file = new File(nombreArchivo);
        String resultado = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String linea = bufferedReader.readLine();
            int i = 0;
            
            while(linea != null) {
                i++;
                if(buscar != null && linea.toLowerCase().contains(buscar.toLowerCase())) {
                    resultado += "Posición " + i + ": " + linea + "\n";
                }
                linea = bufferedReader.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesosDatosException {
        File file = new File(nombreArchivo);
        
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file));
            printWriter.close();
            System.out.println("Archivo creado correctamente!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesosDatosException {
        File file = new File(nombreArchivo);
        file.delete();
        System.out.println("El archivo ha sido borrado correctamente!");
    }
    
}
