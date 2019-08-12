/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclientws;

import clientws.servicio.SumServiceWS;
import clientws.servicio.SumServiceWSImplService;

/**
 *
 * @author Diego
 */
public class TestServiceSumWS {
    public static void main(String args[]) {
        SumServiceWS sumServiceWS = new SumServiceWSImplService().getSumServiceWSImplPort();
        System.out.println("Starting Service Sum WS...");
        
        int y = 2;
        int x = 1;
        
        System.out.println("Sum: X = " + x + ", Y: " + y);
        System.out.println("Result: " + sumServiceWS.sum(x, y));
        System.out.println("Finish Service Sum WS...");
        
    }
}
