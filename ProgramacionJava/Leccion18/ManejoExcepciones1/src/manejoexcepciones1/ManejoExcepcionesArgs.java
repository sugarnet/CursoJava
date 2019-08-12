/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones1;

import domain.Division;
import domain.OperationException;

/**
 *
 * @author almis
 */
public class ManejoExcepcionesArgs {
    public static void main(String args[]) throws OperationException{
        try {
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            
            Division division = new Division(op1, op2);
            division.realizarOperacion();
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.print("Ocurrió una excepción: ");
            System.out.println("Hubo un error al acceder a un elemento fuera de rango.");
            aioobe.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.print("Ocurrió una excepción: ");
            System.out.println("Uno de los operandos no es entero.");
            nfe.printStackTrace();          
        } catch (OperationException oe) {
            System.out.print("Ocurrió una excepción: ");
            System.out.println("El denominador es cero.");
            oe.printStackTrace();            
        } finally {
            System.out.println("Se terminó de revisar las excepciones.");
        }
    }
}
