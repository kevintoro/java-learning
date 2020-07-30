/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mapas;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author matias
 */
public class TestJugadores {
    public static void main (String [] args ){
    System.out.println("********* Objetos y como Clave un String *********");
    Map <String, jugadoresColombia> jugadores = new TreeMap<String, jugadoresColombia>();
    jugadores.put("Ospina", new jugadoresColombia(1, "Ospina", "Portero"));
    jugadores.put("armero", new jugadoresColombia(15, "Armero", "Lateral Derecho"));
    jugadores.put("Yepes", new jugadoresColombia(13, "Yepes", "Central"));
    jugadores.put("Zapata", new jugadoresColombia(5, "Zapata", "Central"));
    jugadores.put("Arias", new jugadoresColombia(11, "Arias", "Lateral Izquierdo"));
    jugadores.put("Sanchez", new jugadoresColombia(14, "Sanchez", "Medio Centro"));
    jugadores.put("Guarin", new jugadoresColombia(16, "Guarin", "Medio Centro"));
    jugadores.put("James", new jugadoresColombia(8, "James", "Centro Campista"));
    jugadores.put("Cuadrado", new jugadoresColombia(18, "Cuadrado", "Interior Izquierdo"));
    jugadores.put("Vaca", new jugadoresColombia(6, "Vaca", "Interior Derecho"));
    jugadores.put("Teo", new jugadoresColombia(7, "Teo", "Delantero"));
    
   
}
}
