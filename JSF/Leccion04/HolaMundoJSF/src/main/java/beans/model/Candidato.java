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
    private Logger logger = LogManager.getRootLogger();

    public Candidato() {
        logger.info("Creando el objeto Candidato...");
        this.setNombre("Introduce tu nombre");
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
        logger.info("Cambiando la propiedad nombre a: " + nombre);
    }

    
}
