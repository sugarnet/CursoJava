/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesabstractas;

import abstracto.domain.Circulo;
import abstracto.domain.FiguraGeometrica;
import abstracto.domain.Rectangulo;
import abstracto.domain.Triangulo;

/**
 *
 * @author almis
 */
public class EjemploClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FiguraGeometrica rectangulo = new Rectangulo("Rectángulo");
        FiguraGeometrica circulo = new Circulo("Círculo");
        FiguraGeometrica triangulo = new Triangulo("Triángulo");
        
        System.out.println(rectangulo);
        rectangulo.dibujar();
        
        System.out.println("");
        System.out.println(circulo);
        circulo.dibujar();
        
        System.out.println("");
        System.out.println(triangulo);
        triangulo.dibujar();
        
        
        
    }
    
}
