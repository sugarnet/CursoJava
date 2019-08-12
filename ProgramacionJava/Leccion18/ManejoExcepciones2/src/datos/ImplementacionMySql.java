/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEx;

/**
 *
 * @author almis
 */
public class ImplementacionMySql implements AccesoDatos{
    
    private boolean simulaError;

    @Override
    public void insertar() throws AccesoDatosEx {
        if(simulaError) {
            throw new EscrituraDatosEx("Error de escritura de datos");
        } else {
            System.out.println("Insertar desde MySql");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx {
        if(simulaError) {
            throw new LecturaDatosEx("Error de lectura de datos");
        } else {
            System.out.println("Lectura desde Mysql");
        }
    }

    @Override
    public void simulaError(boolean simulaError) {
        this.simulaError = simulaError;
    }
    
}
