/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.model;

import java.util.Date;
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
    private int sueldoDeseado;
    private Date fechaNacimiento;
    private String codigoPostal;
    private String localidad;
    private String ciudad;
    private Logger logger = LogManager.getRootLogger();

    public Candidato() {
        logger.info("Creando el objeto Candidato...");
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

    public int getSueldoDeseado() {
        return sueldoDeseado;
    }

    public void setSueldoDeseado(int sueldoDeseado) {
        this.sueldoDeseado = sueldoDeseado;
        logger.info("Cambiando la propiedad nombre a: " + this.sueldoDeseado);
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nombre=" + nombre + ", apellido=" + apellido + 
                ", sueldoDeseado=" + sueldoDeseado + ", fechaNacimiento=" + 
                fechaNacimiento + ", codigoPostal=" + codigoPostal + 
                ", localidad=" + localidad + ", ciudad=" + ciudad + '}';
    }

    

    
    
}
