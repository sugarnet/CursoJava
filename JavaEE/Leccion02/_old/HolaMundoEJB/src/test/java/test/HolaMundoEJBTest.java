/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.HolaMundoEJB;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Diego
 */
public class HolaMundoEJBTest {
    
    private static EJBContainer eJBContainer;
    private static Context context;
    private static HolaMundoEJB holaMundoEJB;
    
    @Before
    public void initContainer() throws Exception {
        System.out.println("Iniciando EJB container");
        eJBContainer = EJBContainer.createEJBContainer();
        context = eJBContainer.getContext();
        holaMundoEJB = (HolaMundoEJB) context.lookup("java:global/classes/HolaMundoEJB!beans.HolaMundoEJB");
    }
    
    @Test
    public void testAddNumbers() throws Exception {
        int a = 3;
        int b = 5;
        int result = holaMundoEJB.sumar(a, b);
        assertEquals((a + b), result);
        System.out.println("\nOperación terminada, resultado: " + result);
    }
}
