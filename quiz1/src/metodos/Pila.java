/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.awt.Component;
import javax.swing.JOptionPane;
import nodo.NodoPila;

/**
 *
 * @author mfer
 */
public class Pila
{
    NodoPila raiz;
    
    public Pila()
    {
        raiz = null;
    }
    
    public void insertarNodo(String info)
    {
        NodoPila nuevo = new NodoPila(info);
        if(raiz == null)
        {
            raiz = nuevo;
        }
        else
        {
            nuevo.setEnlace(raiz);
            raiz = nuevo;
        }
    }
    
    public void imprimir()
    {
        NodoPila temp = raiz;
        while(temp!=null)
        {
            System.out.println(temp.getData());
            temp = temp.getEnlace();
        }
    }
    
    public boolean estaDato(String d)
    {
        NodoPila temp = raiz;
        while(temp!=null)
        {
            if(temp.getData().equals(d))
            {
                return true;
            }
            temp = temp.getEnlace();
        }
        return false;
    }
    
    public void eliminarNodo(String d)
    {
        NodoPila temp = raiz;
        while(temp!=null)
        {
            if(temp == raiz && temp.getData().equals(d))
            {
                raiz = temp.getEnlace();
                break;
            }
            else if(temp.getEnlace().getData().equals(d))
            {
                temp.setEnlace(temp.getEnlace().getEnlace());
                break;
            }
            temp = temp.getEnlace();
        }
    }
    /**
     * ___________________________________________________________________________________________
     * @param temp
     * @return 
     */
    public boolean esSoloMatematica(String temp)
    {
        if(!temp.matches("\\d") && !temp.equals("+") && !temp.equals("-") && !temp.equals("*") && !temp.equals("x")
                    && !temp.equals("/") && !temp.equals("(") && !temp.equals(")"))
            {
                JOptionPane.showMessageDialog(null, "Caracteres no válidos encontrados", "error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        return true;
    }
    
    public boolean signosIguales(String temp)
    {
        if(raiz != null)
        {
            if(temp.matches("\\D") && !temp.equals("(") && !temp.equals(")"))
            {
                return esSigno(raiz.getData()) && esSigno(temp);
            }
        }
        return false;
    }
    
    private boolean esSigno(String temp)
    {
        return temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("x") || temp.equals("/");
    }
    
    public boolean ultimoEsSigno()
    {
        if(raiz!=null)
        {
            return esSigno(raiz.getData());
        }
        return false;
    }
    
    public boolean todoCorrecto(Component c)
    {
        if(estaDato("("))
        {
            if(!estaDato(")"))
            {
                JOptionPane.showMessageDialog(c, "No cierra paréntesis","error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        if(ultimoEsSigno())
        {
            JOptionPane.showMessageDialog(c, "el último caracter es Signo", "error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}