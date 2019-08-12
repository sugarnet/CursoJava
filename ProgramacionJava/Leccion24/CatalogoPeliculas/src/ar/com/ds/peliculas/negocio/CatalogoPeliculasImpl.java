/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ds.peliculas.negocio;

import ar.com.ds.peliculas.datos.AccesoDatos;
import ar.com.ds.peliculas.datos.AccesoDatosImpl;
import ar.com.ds.peliculas.domain.Pelicula;
import ar.com.ds.peliculas.excepciones.AccesosDatosException;
import ar.com.ds.peliculas.excepciones.EscrituraDatosException;
import ar.com.ds.peliculas.excepciones.LecturaDatosException;
import java.util.List;

/**
 *
 * @author almis
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas{
    
    private AccesoDatos accesoDatos;

    public CatalogoPeliculasImpl() {
        this.accesoDatos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = accesoDatos.existe(nombreArchivo);
            accesoDatos.escribir(pelicula, nombreArchivo, anexar);
        } catch (AccesosDatosException ade) {
            System.out.println("Error de escritura");
            ade.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        try {
            List<Pelicula> peliculas = accesoDatos.listar(nombreArchivo);
            for(Pelicula pelicula : peliculas) {
                System.out.println(pelicula);
            }
        } catch(LecturaDatosException lde) {
            System.out.println("Error de lectura");
            lde.printStackTrace();
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        try {
            String resultadoBusqueda = accesoDatos.buscar(nombreArchivo, buscar);
            System.out.println("Peliculas encontradas:\n" + resultadoBusqueda);
        } catch (LecturaDatosException lde) {
            System.out.println("Error de lectura");
            lde.printStackTrace();
        }
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        try {
            if(accesoDatos.existe(nombreArchivo)) {
                accesoDatos.borrar(nombreArchivo);
                accesoDatos.crear(nombreArchivo);
            } else {
                accesoDatos.crear(nombreArchivo);
            }
        } catch (AccesosDatosException ade) {
            System.out.println("Error de acceso a datos");
            ade.printStackTrace();
        }
    }
    
}
