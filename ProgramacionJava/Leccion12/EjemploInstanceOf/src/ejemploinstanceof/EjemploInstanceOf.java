/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploinstanceof;

/**
 *
 * @author almis
 */
public class EjemploInstanceOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FiguraGeometrica elipse = new Elipse();
		
		//Determina solo un tipo el que corresponda con la jerarquia
        determinarTipo(elipse);
        
        System.out.println("\nTodos sus tipos:");
        determinarTodosLosTipos(elipse);
    }
    
    private static void determinarTodosLosTipos(FiguraGeometrica figuraGeometrica) {
        if(figuraGeometrica instanceof Elipse) {
			//Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        }
        if(figuraGeometrica instanceof Circulo) {
			//Procesa algo particular del Circulo
            System.out.println("Es un Circulo");
        }
        if(figuraGeometrica instanceof FiguraGeometrica) {
			//Procesa algo particular de la Figura Geometrica
            System.out.println("Es una FiguraGeometrica");
        }
        if(figuraGeometrica instanceof Object) {
			//Procesa algo particular de la clase Object
            System.out.println("Es un Object");
        } else {
            System.out.println("No se encontró el tipo");
        }
    }
    
    private static void determinarTipo(FiguraGeometrica figuraGeometrica) {
        if(figuraGeometrica instanceof Elipse) {
			//Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        } else if(figuraGeometrica instanceof Circulo) {
			//Procesa algo particular del Circulo
            System.out.println("Es un Circulo");
        } else if(figuraGeometrica instanceof FiguraGeometrica) {
			//Procesa algo particular de la Figura Geometrica
            System.out.println("Es un FiguraGeometrica");
        } else if(figuraGeometrica instanceof Object) {
			//Procesa algo particular de la clase Object
            System.out.println("Es un Object");
        } else {
            System.out.println("No se encontró el tipo");
        }
    }
    
}
