/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobleenlazada;

/**
 *
 * @author matias
 */


 class Nodo
{
    int dato;
    Nodo next;
    Nodo ant;
    Nodo(int a)
    {
        this.dato=a;
        this.next=null;
        this.ant=null;
    }
}
    
