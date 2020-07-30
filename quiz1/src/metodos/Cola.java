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
    
    public void insertNodo(String info)
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
    
    public void eliminarNodo(String info)
    {
        Nodo temp = raiz;
        while(temp!=null)
        {
            if(String.valueOf(raiz.getData()).equals(info))
            {
                raiz = raiz.getSig();
                break;
            }
            else if(String.valueOf(temp.getSig().getData()).equals(info))
            {
                temp.setSig(temp.getSig().getSig());
                break;
            }
            temp = temp.getSig();
        }
    }
    
    public boolean estaNodo(String info)
    {
        Nodo temp = raiz;
        while(temp!=null)
        {
            if(String.valueOf(temp.getData()).equals(info))
            {
                return true;
            }
            temp = temp.getSig();
        }
        
        return false;
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