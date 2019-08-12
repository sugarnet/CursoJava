/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.domain;

/**
 *
 * @author Diego
 */
public class Localidad {
    
    private long localidadId;
    private String nombreLocalidad;
    private long postCode;

    public Localidad(long localidadId, String nombreLocalidad, long postCode) {
        this.localidadId = localidadId;
        this.nombreLocalidad = nombreLocalidad;
        this.postCode = postCode;
    }

    public long getLocalidadId() {
        return localidadId;
    }

    public void setLocalidadId(long localidadId) {
        this.localidadId = localidadId;
    }

    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    public long getPostCode() {
        return postCode;
    }

    public void setPostCode(long postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Localidad{" + "localidadId=" + localidadId + ", nombreLocalidad=" + nombreLocalidad + ", postCode=" + postCode + '}';
    }
    
    
}
