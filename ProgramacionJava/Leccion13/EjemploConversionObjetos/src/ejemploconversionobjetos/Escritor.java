/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconversionobjetos;

/**
 *
 * @author almis
 */
public class Escritor extends Empleado {
    
	//Utilizamos una enumeración para las opciones de tipo de escritura
    private final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }
    
    public String getTipoEscrituraEnTexto() {
        return this.tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
		//Observamos que para no repetir codigo, podemos utilizar
		//el metodo del padre y solo agregar a este metodo lo de la clase hija
		//esto es invocar un metodo sobreescrito
        return super.toString() + " Escritor{" + "tipoEscritura=" + tipoEscritura.getDescripcion() + '}';
    }
    
    
    
}
