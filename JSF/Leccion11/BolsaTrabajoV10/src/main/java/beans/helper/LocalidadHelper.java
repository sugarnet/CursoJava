/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.helper;

import beans.domain.Localidad;
import beans.service.LocalidadService;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Diego
 */
@RequestScoped
@Named
public class LocalidadHelper {
    
    Logger logger = LogManager.getRootLogger();
    
    @Inject
    LocalidadService localidadService;

    public List<Localidad> getLocalidades() {
        List<Localidad> localidades = localidadService.findAll();
        logger.info(localidades.size() + "registros obtenidos desde la BD");

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
