/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mapas;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 *
 * @author matias
 */
public class linkedHashMap {
    public static void main(String[] args) {
        Map <Integer, String> map = new LinkedHashMap <Integer, String>();
        map.put(1, "Ospina");		
        map.put(15, "Guarin");
        map.put(3, "Zapata");		
        map.put(5, "Cuadrado");
        map.put(11, "SAnchez");	
        map.put(14, "James");
        map.put(16, "Armero");	
        map.put(8, "Arias");
        map.put(18, "Yepes");		
        map.put(6, "Vaca");
        map.put(7, "Teo");

// Imprimimos el Map con un Iterador
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
        Integer key = (Integer)it.next();
        System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
    }
    }
    
}
