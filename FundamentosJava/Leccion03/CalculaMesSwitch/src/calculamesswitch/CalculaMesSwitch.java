/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculamesswitch;

/**
 *
 * @author almis
 */
public class CalculaMesSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes = 10;
        String estacion;
        
        switch(mes) {
            case 1: 
            case 2: 
            case 3:
            case 12:
                estacion = "verano";
                break;
            case 4:
            case 5:
            case 6:
                estacion = "otoño";
                break;
            case 7:
            case 8:
                estacion = "invierno";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "primavera";
                break;
            default:
                estacion = "mes incorrecto";
            
        }
        
        System.out.println("La estación para el mes " + mes + " es: " + estacion);
    }
    
}
