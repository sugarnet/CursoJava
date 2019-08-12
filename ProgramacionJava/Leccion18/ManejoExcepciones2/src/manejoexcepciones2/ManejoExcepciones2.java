/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones2;

import datos.AccesoDatos;
import datos.ImplementacionMySql;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEx;

/**
 *
 * @author almis
 */
public class ManejoExcepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AccesoDatos accesoDatos = new ImplementacionMySql();
        accesoDatos.simulaError(true);
        ejecutar(accesoDatos, "listar");
        
        accesoDatos.simulaError(false);
        ejecutar(accesoDatos, "insertar");
    }
    
    public static void ejecutar(AccesoDatos accesoDatos, String accion) {
        switch(accion) {
            case "listar":
                
                try {
                    accesoDatos.listar();
                } catch (LecturaDatosEx lde) {
                    System.out.println("Error de lecura: procesa la excepción más específica de lectura de datos");
                    lde.printStackTrace();
                } catch (AccesoDatosEx ade) {
                    System.out.println("Error de acceso a datos: procesa la excepción más genérica de acceso a datos");
                    ade.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Error general");
                } finally {
                    System.out.println("Opcional. Siempre se ejecuta exista o no excepción.");
                }
                break;
            case "insertar":
                
                try {
                    accesoDatos.insertar();
                } catch (EscrituraDatosEx ede) {
                    System.out.println("Error de escritura: procesa la excepción más específica de escritura de datos");
                    ede.printStackTrace();
                } catch (AccesoDatosEx ade) {
                    System.out.println("Error de acceso a datos: procesa la excepción más genérica de acceso a datos");
                    ade.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Error general");
                } finally {
                    System.out.println("Opcional. Siempre se ejecuta exista o no excepción.");
                }
                break;
                
            default:
                System.out.println("Operación no soportada.");
                break;
        }
    }
    
}
