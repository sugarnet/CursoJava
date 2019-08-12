/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.HolaMundoEJBRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Diego
 */
public class TestHolaMundoEJB {
    public static void main(String argas[]) {
        System.out.println("Iniciando llamada del EJB desde el cliente...\n");
        
        try {
            Context context = new InitialContext();
            String name = "java:global/HolaMundoEJB/HolaMundoEJBImpl!beans.HolaMundoEJBRemote";
            HolaMundoEJBRemote holaMundoEJBRemote = (HolaMundoEJBRemote) context.lookup(name);
            int rdo = holaMundoEJBRemote.sumar(5, 3);
            System.out.println("Resultado: " + rdo);
        } catch (NamingException ne) {
            ne.printStackTrace();
        }
    }
}
