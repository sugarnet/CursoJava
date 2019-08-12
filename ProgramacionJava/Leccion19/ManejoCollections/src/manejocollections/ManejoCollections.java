/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author almis
 */
public class ManejoCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("4"); //elemento repetido
        
        imprimir(list);
        
        Set set = new HashSet();
        set.add("100");
        set.add("200");
        set.add("300");
        set.add("300");
        
        imprimir(set);
        
        Map map = new HashMap();
        map.put("1", "Diego");
        map.put("2", "Sol");
        map.put("3", "Alma");
        
        imprimir(map.keySet());
        imprimir(map.values());
        
    }
    
    public static void imprimir(Collection collection) {
        for(Object object : collection) {
            System.out.print(object + " ");
        }
        System.out.println("");
    }
    
}
