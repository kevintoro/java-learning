/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mapas;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author matias
 */
public class TreeMaps {
     public static void main(String[] args) {
        Map <Integer, String> map = new TreeMap <Integer, String>();
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
    
     
    System.out.println("********* Los métodos de Map *********");
    System.out.println("Mostramos el numero de elementos que tiene el TreeMap: treeMap.size() = "+map.size());
    System.out.println("Vemos si el TreeMap esta vacio : treeMap.isEmpty() = "+map.isEmpty());
    System.out.println("Obtenemos un elemento del Map pasandole la clave 6: treeMap.get(6) = "+map.get(6));
    System.out.println("Borramos un elemento del Map el 13 (porque fue sustituido): treeMap.remove(13)"+map.remove(13));
    System.out.println("Vemos que pasa si queremos obtener la clave 13 que ya no existe: treeMap.get(13) = "+map.get(13));
    System.out.println("Vemos si existe un elemento con la clave 13: treeMap.containsKey(13) = "+map.containsKey(13));
    System.out.println("Vemos si existe un elemento con la clave 1: treeMap.containsKey(1) = "+map.containsKey(1));
    System.out.println("Vemos si existe el valo 'Teo' en el Map: treeMap.containsValue('Teo') = "+map.containsValue("Teo"));
    System.out.println("Vemos si existe el valo 'Vaca' en el Map: treeMap.containsValue('Vaca') = "+map.containsValue("Vaca"));
    System.out.println("Borramos todos los elementos del Map: treeMap.clear()");map.clear();
    System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño: treeMap.size() = "+map.size());
    System.out.println("Lo comprobamos tambien viendo si esta vacio treeMap.isEmpty() = "+map.isEmpty());
    
}
}
