/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.dto;

/**
 *
 * @author almis
 */
public class PersonaDTO {
    private Integer idPersona;
    private String nombre;
    private String apellido;
    
    public PersonaDTO() {
        
    }
    
    public PersonaDTO(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "PersonaDTO{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
