/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobleenlazada;

public class ListaDobles
{
    Nodo primero;
    Nodo ultimo;
    ListaDobles()
    {
        primero=null;
        ultimo=null;
    }
 
    public boolean estavacio()
    {
        return primero==null;
    }
 
    public ListaDobles alta(int dat)
    {
        if(estavacio())
        {
            Nodo nuevo=new Nodo(dat);
            primero=nuevo;
            ultimo=nuevo;
        }
        else
        {
            Nodo nuevo=new Nodo(dat);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
        return this;
    }
 
   public boolean delete(int num)
    {
        Nodo anterior=null;
        Nodo actual=primero;
        while(actual!=ultimo)
        {
            if(actual.dato==num)
            {
                if(anterior==null)
                {
                    primero=actual.next;
                    primero.ant=null;
                }
                else{
                    anterior.next=actual.next;
                    Nodo temporal;
                    temporal=actual.next;
                    temporal.ant=anterior;
                }
                return true;
            }
            anterior=actual;
            actual=actual.next;
        }
        if(num==ultimo.dato)
        {
            ultimo=actual.ant;
            return true;
        }
        return false;
    }
   
   public void imprimir()
   {
       Nodo actual = primero;
       while(actual!=ultimo)
       {
           System.out.print(actual.dato+" ");
           actual = actual.next;
       }
       System.out.println(actual.dato);
   }
 
    public void imprimir2()
    {
        Nodo actual;
        actual=ultimo;
        while(actual!=primero)
        {
            System.out.print(actual.dato+" ");
            actual=actual.ant;
        }
        System.out.print(actual.dato);
    }
    
    public void distancia(int x)
    {
        Nodo actual = primero;
        int aux = 0;
        while(actual!=ultimo)
        {
            int cont = 0;
            if(actual.dato == x)
            {
                Nodo temp = actual.next;
                while(temp!= ultimo) 
                {
                    cont++;
                    if(temp.dato == x)
                    {
                        System.out.println("D: "+cont);
                        if(cont>aux)
                        {
                            aux = cont;
                        }
                        break;
                    }
                    temp = temp.next;
                }
                
                if(temp == ultimo && temp.dato == x && temp.ant.dato == x)
                {
                    System.out.println("D: 1");
                    if(aux<1)
                    {
                        aux = 1;
                    }
                    break;
                }
            }
            actual = actual.next;
        }
        System.out.println("Mayor Distancia: "+aux);
    }
    
    public void conteo()
    {
        Nodo aux = primero;
        int cont = 1;
        do
        {
            cont++;
            aux = aux.next;
        }
        while(aux!=ultimo);
        
        if(ultimo.dato == cont)
        {
            System.out.println("0");
        }
        else if(ultimo.dato>cont)
        {
            System.out.println("+1");
        }
        else
        {
            System.out.println("-1");
        }
    }
    
    public void insertCero()
    {
        Nodo actual = primero;
        int suma = 0;
        while(actual != ultimo)
        {
            suma += actual.dato;
            actual = actual.next;
        }
        suma+=actual.dato;
        
        actual = primero;
        
        while(actual != ultimo)
        {
            if(actual.dato == suma)
            {
                Nodo nuevo = new Nodo(0);
                actual.next.ant = nuevo;
                nuevo.next = actual.next;
                actual.next = nuevo;
                nuevo.ant = actual;
                actual = actual.next;
            }
            actual = actual.next;
        }
    }
    
    public void eliminar()
    {
        Nodo actual = primero;
        int cont = 1;
        
        while(actual!=ultimo)
        {
            cont++;
            actual = actual.next;
        }
        
        if(cont%2==0)
        {
            Nodo temp = primero.next;
            while(temp != ultimo)
            {
                delete(temp.dato);
                temp = temp.next.next;
            }
            delete(ultimo.dato);
        }
        else
        {
            Nodo temp = primero;
            while(temp != ultimo)
            {
                delete(temp.dato);
                temp = temp.next.next;
            }
            delete(ultimo.dato);
        }
    }
    
    public void sumaImparyPar()
    {
        int sumaImpar = 0;
        int sumaPar = 0;
        Nodo actual = primero;
        int cont = 0;
        
        while(actual != ultimo)
        {
            cont++;
            if(cont%2 == 0)
            {
                sumaPar+=actual.dato;
            }
            else
            {
                sumaImpar+=actual.dato;
            }
            actual = actual.next;
        }
        
        if(cont%2==0)
        {
            sumaImpar+=actual.dato;
        }
        else
        {
            sumaPar+=actual.dato;
        }
        

        if(sumaImpar == sumaPar)
        {
            actual = primero;
            cont = 0;
            while(actual != ultimo)
            {
                cont++;
                if(cont%2 == 0)
                {
                    delete(actual.dato);
                }
                actual = actual.next;
            }
        }
        else
        {
            actual = primero;
            cont = 0;
            while(actual != ultimo)
            {
                cont++;
                if(cont%2 != 0)
                {
                    delete(actual.dato);
                }
                actual = actual.next;
            }
            
            if(cont%2 == 0)
            {
                delete(actual.dato);
            }
        }
    }
    
    public void invertir()
    {
        Nodo actual = ultimo;
        
        while(actual!=primero)
        {
            actual.next = actual.ant;
            actual = actual.ant;
        }
        primero = ultimo;
        ultimo = actual;
    }
}