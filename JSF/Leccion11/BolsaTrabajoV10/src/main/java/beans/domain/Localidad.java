/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Diego
 */
@Entity
@Table(name = "localidad")
@NamedQuery(name = "Localidad.findAll", query = "SELECT l FROM Localidad l")
public class Localidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "localidad_id")
    private long localidadId;
    @Column(name = "nombre_localidad")
    private String nombreLocalidad;
    @Column(name = "codigo_postal")
    private long postCode;

    public Localidad() {
    }
    
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (int) (this.localidadId ^ (this.localidadId >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Localidad other = (Localidad) obj;
        if (this.localidadId != other.localidadId) {
            return false;
        }
        if (this.postCode != other.postCode) {
            return false;
        }
        if (!Objects.equals(this.nombreLocalidad, other.nombreLocalidad)) {
            return false;
        }
        return true;
    }

}
