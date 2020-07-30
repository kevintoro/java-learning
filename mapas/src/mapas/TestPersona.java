/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mapas;

import java.util.HashMap;

/**
 *
 * @author matias
 */
public class TestPersona {
    
       public static void main(String[] args) {
        HashMap<Integer, Persona> dictionary = new HashMap<Integer, Persona>();
        Persona person1 = new Persona("Juan", "Pineda", 19);
        Persona person2 = new Persona("Alex", "Rodriguez", 35);
        Persona person3 = new Persona("Juan", "Guerra", 40);
        Persona person4 = new Persona("Mike", "Martinez", 60);
        dictionary.put(person1.getEdad(), person1);
        dictionary.put(person2.getEdad(), person2);
        dictionary.put(person3.getEdad(), person3);
        dictionary.put(person4.getEdad(), person4);

        // Obtenemos el objeto con clave igual a la edad de person3
        Persona x = dictionary.get(person3.getEdad());

        System.out.println("Nombre: " + x.getNombre());
        System.out.println("Apellido: " + x.getApellido());
        System.out.println("Edad: " + x.getEdad());
    }
}
    

