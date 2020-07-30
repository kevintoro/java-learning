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
public class Main 
{
    public static void main(String[] args) 
    {
        //int b=5;
        //int c=10;
        //int d=15;
        //int e=20;
        //int f=25;
        ListaDobles a=new ListaDobles();
        a.alta(9);
        a.alta(2);
        a.alta(6);
        a.alta(8);
        a.alta(4);
        a.alta(5);
        a.alta(4);
        //a.alta(4);
        a.imprimir();
        a.delete(20);
        //System.out.println("");
        //a.imprimir2();
        a.distancia(4);
        a.conteo();
        //a.insertCero();
        a.imprimir();
        a.eliminar();
        a.imprimir();
        System.out.println("");
    }
}