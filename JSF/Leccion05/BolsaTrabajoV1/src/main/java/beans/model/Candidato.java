/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Diego
 */
@Named
@RequestScoped
public class Candidato {

    private String nombre;
    private String apellido;
    private String sueldoDeseado;
    private Logger logger = LogManager.getRootLogger();

    public Candidato() {
        logger.info("Creando el objeto Candidato...");
        this.setNombre("Introduce tu nombre");
        this.setApellido("Introduce tu apellido");
        this.setSueldoDeseado("Introduce el sueldo deseado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        logger.info("Cambiando la propiedad nombre a: " + this.nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        logger.info("Cambiando la propiedad nombre a: " + this.apellido);
    }

    public String getSueldoDeseado() {
        return sueldoDeseado;
    }

    public void setSueldoDeseado(String sueldoDeseado) {
        this.sueldoDeseado = sueldoDeseado;
        logger.info("Cambiando la propiedad nombre a: " + this.sueldoDeseado);
    }

    @Override
    public String toString() {
        return "Candidato{" + "nombre=" + nombre + ", apellido=" + apellido + ", sueldoDeseado=" + sueldoDeseado + '}';
    }
    
}
