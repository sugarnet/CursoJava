/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.ciclovida;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Diego
 */
public class DepuracionListener implements PhaseListener {
    
    Logger logger = LogManager.getRootLogger();

    @Override
    public void afterPhase(PhaseEvent event) {
        if(logger.isInfoEnabled()) {
            logger.info("AFTER PHASE: " + event.getPhaseId().toString());
        }
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        if(logger.isInfoEnabled()) {
            logger.info("BEFORE PHASE: " + event.getPhaseId().toString());
        }
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
}
