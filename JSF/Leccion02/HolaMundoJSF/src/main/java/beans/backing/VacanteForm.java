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

/**
 *
 * @author Diego
 */
@Named
@RequestScoped
public class VacanteForm {
    
    @Inject
    private Candidato candidato;

    /**
     * Creates a new instance of VacanteForm
     */
    public VacanteForm() {
    }
    
    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    public String enviar() {
        if(this.candidato.getNombre().equals("Juan")) {
            return "success";
        } else {
            return "fail";
        }
    }
}
