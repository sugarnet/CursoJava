/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import excepciones.AccesoDatosEx;

/**
 *
 * @author almis
 */
public interface AccesoDatos {
    void insertar() throws AccesoDatosEx;
    void listar() throws AccesoDatosEx;
    void simulaError(boolean simulaError);
}
