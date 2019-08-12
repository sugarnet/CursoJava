/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.ds.peliculas.negocio;

/**
 *
 * @author almis
 */
public interface CatalogoPeliculas {
    void agregarPelicula(String nombrePelicula, String nombreArchivo);
    void listarPeliculas(String nombreArchivo);
    void buscarPelicula(String nombreArchivo, String buscar);
    void iniciarArchivo(String nombreArchivo);
}
