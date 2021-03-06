/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
    
    Logger logger = LogManager.getRootLogger();
    
    @Inject
    private Candidato candidato;

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
}
