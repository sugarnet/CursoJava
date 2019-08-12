/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejogenerics;

/**
 *
 * @author almis
 */
public class ClaseGenerica<T> {
    T object;

    public ClaseGenerica(T object) {
        this.object = object;
    }
    
    public void getType() {
        System.out.println("El tipo T es: " + object.getClass().getName());
    }
}
