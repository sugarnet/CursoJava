/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.backing;

import beans.helper.LocalidadHelper;
import beans.model.Candidato;
import java.util.Objects;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Diego
 */
@Named
@RequestScoped
public class VacanteForm {
    
    private boolean comentarioEnviado= false;
    Logger logger = LogManager.getRootLogger();
    
    @Inject
    private Candidato candidato;
    
    @Inject
    private LocalidadHelper localidadHelper;

    /**
     * Creates a new instance of VacanteForm
     */
    public VacanteForm() {
        logger.info("Creando el objeto VacanteForm...");
    }
    
    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    public String enviar() {
        logger.info("Enviando: " + this.candidato);
        
        if(this.candidato.getNombre().equals("Juan")) {
            logger.info("Accediendo al caso de éxito...");
            if(this.candidato.getApellido().equals("Perez")) {
                String msge = "Gracias pero Juan Perez ya trabaja con nosostros";
                FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msge, msge);
                FacesContext facesContext = FacesContext.getCurrentInstance();
                String clientId = null;
                facesContext.addMessage(clientId, facesMessage);
                return "index";
            }
            return "success";
        } else {
            logger.info("Accediendo al caso de fallo...");
            return "fail";
        }
    }
    
    public void codigoPostalListener(ValueChangeEvent valueChangeEvent) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        UIViewRoot uIViewRoot = facesContext.getViewRoot();
        
        Long newCodigoPostal = (Long) valueChangeEvent.getNewValue();
        logger.info("Nuevo código postal: " + newCodigoPostal);
        
        long localidadId = 0;
        String ciudad = "";
        UIInput localidadUIInput = (UIInput) uIViewRoot.findComponent("vacanteForm:localidadId");
        UIInput ciudadUIInput = (UIInput) uIViewRoot.findComponent("vacanteForm:ciudad");
        
        localidadId = getLocalidadHelper().getLocalidadIdPorPostCode(newCodigoPostal);
        if(Objects.nonNull(localidadId) && localidadId != 0L) {
            logger.info("Modificamos los valores de localidad y ciudad con ValueChangeEvent");
            ciudad = "San Martín";
        } else {
            ciudad = "";
        }
        
        localidadUIInput.setValue(localidadId);
        localidadUIInput.setSubmittedValue(localidadId);
        ciudadUIInput.setValue(ciudad);
        ciudadUIInput.setSubmittedValue(ciudad);
        facesContext.renderResponse();
    }
    
    public void ocultarComentarios(ActionEvent actionEvent) {
        this.comentarioEnviado = !this.comentarioEnviado;
    }

    public boolean isComentarioEnviado() {
        return comentarioEnviado;
    }

    public void setComentarioEnviado(boolean comentarioEnviado) {
        this.comentarioEnviado = comentarioEnviado;
    }

    public LocalidadHelper getLocalidadHelper() {
        return localidadHelper;
    }

    public void setLocalidadHelper(LocalidadHelper localidadHelper) {
        this.localidadHelper = localidadHelper;
    }
    
    
}
