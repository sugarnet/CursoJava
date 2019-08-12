/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
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
        if(this.candidato.getNombre().equals("Juan")) {
            logger.info("Accediendo al caso de éxito...");
            return "success";
        } else {
            logger.info("Accediendo al caso de fallo...");
            return "fail";
        }
    }
}
