/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploenumeraciones;

/**
 *
 * @author almis
 */
public class EjemploEnumeraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Valor 1: " + Dias.LUNES);
        
        indicarDias(Dias.VIERNES);
        
        System.out.println("Continente Número 4: " + Continentes.AMERICA);
        System.out.println("Paises en América: " + Continentes.AMERICA.getPaises());
        
        System.out.println("");
        
        indicarPaises(Continentes.OCEANIA);
        
        System.out.println("");
        imprimirContinentes();
    }
    
    public static void indicarDias(Dias dias) {
        System.out.println("El valor de día es: " + dias);
        switch(dias) {
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
                
            default:
                System.out.println("Seguimos con el resto de los días");
                break;
        }
    }
    
    public static void indicarPaises(Continentes continentes) {
        switch(continentes) {
            case AFRICA:
                System.out.println("Número de paises en: " + continentes + ": " + continentes.getPaises());
                break;
                
            default:
                System.out.println("Y seguimos con el resto de continentes.");
                break;
        }
    }
    
    public static void imprimirContinentes() {
        for(Continentes continente: Continentes.values()) {
            System.out.println("Contiente: " + continente + " tiene " + continente.getPaises());
        }
    }
    
}
