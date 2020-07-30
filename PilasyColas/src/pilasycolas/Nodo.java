/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasycolas;

/**
 *
 * @author MAtias Herrera C
 */
public class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }   
}