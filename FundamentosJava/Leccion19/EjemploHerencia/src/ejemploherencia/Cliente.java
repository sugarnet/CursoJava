/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

import java.util.Date;

/**
 *
 * @author almis
 */
public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    public Cliente(Date fechaRegistro, boolean vip) {
        this.idCliente = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
    
    public int getIdCliente() {
        return this.idCliente;
    }
    
    private Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
		//primero mandamos a llamar el método toString de la clase Persona para que podamos observar los valores de la clase Padre, y después imprimimos los valores de la clase hija
        return super.toString() + "Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    }
    
    
}
