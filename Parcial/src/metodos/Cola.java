/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import nodo.Nodo;
/**
 *
 * @author mfer
 */
public class Cola
{
    private Nodo raiz, ultimo;
    
    public Cola()
    {
        raiz = null;
        ultimo = null;
    }
    
    public boolean isEmpty()
    {
        return raiz == null;
    }
    
    public void insertNodo(int info)
    {
        Nodo temp = new Nodo(info);
        if(raiz == null)
        {
            raiz = temp;
            ultimo = temp;
        }
        else
        {
            ultimo.setSig(temp);
            ultimo = temp;
        }
    }
    
    public void eliminarNodo(int info)
    {
        Nodo temp = raiz;
        while(temp!=null)
        {
            if(raiz.getData() == info)
            {
                raiz = raiz.getSig();
                break;
            }
            else if(temp.getSig().getData() == info)
            {
                temp.setSig(temp.getSig().getSig());
                break;
            }
            temp = temp.getSig();
        }
    }
    
    public boolean estaNodo(int info)
    {
        Nodo temp = raiz;
        while(temp!=null)
        {
            if(temp.getData() == info)
            {
                return true;
            }
            temp = temp.getSig();
        }
        
        return false;
    }
    
    public void imp()
    {
        Nodo temp = raiz;
        while(temp!=null)
        {
            System.out.println(temp.getData());
            temp = temp.getSig();
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public Nodo getUltimo() {
        return ultimo;
    }
    
    public int getTamanio()
    {
        int re = 0;
        Nodo temp = raiz;
        while(temp!=null)
        {
            re++;
            temp = temp.getSig();
        }
        return re;
    }
}