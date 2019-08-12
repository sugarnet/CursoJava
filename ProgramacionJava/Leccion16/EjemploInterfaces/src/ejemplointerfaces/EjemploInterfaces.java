/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaces;

import datos.AccesoDatos;
import datos.ImplementacionMySQL;
import datos.ImplementacionOracle;

/**
 *
 * @author almis
 */
public class EjemploInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AccesoDatos accesoDatos = new ImplementacionOracle();
        ejecutar(accesoDatos, "listar");
        
        accesoDatos = new ImplementacionMySQL();
        ejecutar(accesoDatos, "insertar");
    }
    
    private static void ejecutar(AccesoDatos accesoDatos, String accion) {
        switch(accion) {
            case "listar":
                accesoDatos.listar();
                break;
            case "insertar":
                accesoDatos.insertar();
                break;
        }
    }
    
}
