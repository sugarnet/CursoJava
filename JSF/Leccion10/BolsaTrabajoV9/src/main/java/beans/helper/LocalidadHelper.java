/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.helper;

import beans.domain.Localidad;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

/**
 *
 * @author Diego
 */
@RequestScoped
@Named
public class LocalidadHelper {

    public List<Localidad> getLocalidades() {
        List<Localidad> localidades = new ArrayList<>();

        localidades.add(new Localidad(1, "Palmira", 5584));
        localidades.add(new Localidad(2, "Chapanay", 5583));
        localidades.add(new Localidad(3, "Tres Porteñas", 5582));

        return localidades;
    }

    public long getLocalidadIdPorNombre(String nombreLocalidad) {
        long idLocalidad = 0;

        List<Localidad> localidades = getLocalidades();
        for (Localidad localidad : localidades) {
            if (localidad.getNombreLocalidad().equalsIgnoreCase(nombreLocalidad)) {
                idLocalidad = localidad.getLocalidadId();
                break;
            }
        }

        return idLocalidad;
    }
    
    public long getLocalidadIdPorPostCode(long postCode) {
        long idLocalidad = 0;

        List<Localidad> localidades = getLocalidades();
        for (Localidad localidad : localidades) {
            if (localidad.getPostCode() == postCode) {
                idLocalidad = localidad.getLocalidadId();
                break;
            }
        }

        return idLocalidad;
    }
    
    public List<SelectItem> getSelectItems() {
        List<SelectItem> selectItems = new ArrayList<>();
        List<Localidad> localidads = getLocalidades();
        for (Localidad localidad : localidads) {
            SelectItem selectItem = new SelectItem(localidad.getLocalidadId(), localidad.getNombreLocalidad());
            selectItems.add(selectItem);
        }
        
        return selectItems;
    }
}
