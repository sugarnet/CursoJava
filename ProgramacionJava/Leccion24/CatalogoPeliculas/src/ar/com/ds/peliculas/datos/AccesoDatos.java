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
import java.util.List;

/**
 *
 * @author almis
 */
public interface AccesoDatos {
    
    boolean existe(String nombreArchivo) throws AccesosDatosException;
    List<Pelicula> listar(String nombreArchivo) throws LecturaDatosException;
    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosException;
    String buscar(String nombreArchivo, String buscar) throws LecturaDatosException;
    void crear(String nombreArchivo) throws AccesosDatosException;
    void borrar(String nombreArchivo) throws AccesosDatosException;
}
