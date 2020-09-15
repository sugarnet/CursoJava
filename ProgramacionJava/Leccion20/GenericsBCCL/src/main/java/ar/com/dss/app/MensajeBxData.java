/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.dss.app;

/**
 *
 * @author Almis
 */
public class MensajeBxData extends BxData {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MensajeBxData{" + "message=" + message + '}';
    }
    
    

}
