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
    private long localidadId;
    private String ciudad;
    private String comentarios;

    private final Logger logger = LogManager.getRootLogger();

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

    public long getLocalidadId() {
        return localidadId;
    }

    public void setLocalidad(long localidadId) {
        this.localidadId = localidadId;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    @Override
    public String toString() {
        return "Candidato{" + "nombre=" + nombre + ", apellido=" + apellido + 
                ", sueldoDeseado=" + sueldoDeseado + ", fechaNacimiento=" + 
                fechaNacimiento + ", codigoPostal=" + codigoPostal + 
                ", localidadId=" + localidadId + ", ciudad=" + ciudad +
                ", comentarios=" + comentarios + '}';
    }

    

    
    
}
