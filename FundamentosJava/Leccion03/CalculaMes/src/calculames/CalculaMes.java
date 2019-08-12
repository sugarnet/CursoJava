/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculames;

/**
 *
 * @author almis
 */
public class CalculaMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes = 1;
        String estacion;
        
        if(mes == 1 || mes == 2 || mes == 3 || mes == 12) {
            estacion = "verano";
        } else if(mes == 4 || mes == 5 || mes == 6) {
            estacion = "otoño";
        } else if (mes == 7 || mes == 8) {
            estacion = "invierno";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "primavera";
        } else {
            estacion = "mes incorrecto";
        }
        
        System.out.println("La estación para el mes " + mes + " es :" + estacion);
    }
    
}
