public class Pila
{
    Nodo pila;
    
    public Pila()
    {
        pila = null;
    }
    
    public void apilar(int dato)
    {
        Nodo temp = new Nodo(dato,pila);
        pila=temp;
    }
   
    public int desapilar()
    {
        int resultado;
        if(pila==null)
        {
            System.out.println("pila vacia");
        }
        else
        {
            resultado=pila.dato;
            pila=pila.sig;
            return resultado;
        }
        
        return -1;
    }
   
    public void desapilarDato(int dato)
    {
        Pila temp = new Pila();
        while(pila!=null)
        {
            if(pila.dato == dato)
            {
                pila = pila.sig;
            }
            else
            {
                temp.apilar(pila.dato);
                pila = pila.sig;
            }
        }
        Nodo n = new Nodo(dato, temp.pila);
        pila = n;
    }
    
    public void masPequeño()
    {
        int datoMenor = 2147483647;
        Nodo ac = pila;
        
        while(ac!=null)
        {
            if(ac.dato<datoMenor)
            {
                datoMenor = ac.dato;
            }
            ac = ac.sig;
        }
        
        desapilarDato(datoMenor);
    }
    
    public void mostrar()
    {
        Nodo ac = pila;
        if(ac == null)
        {
            System.out.println("null");
        }
        while(ac!=null)
        {
            System.out.println(ac.dato);
            ac = ac.sig;
        }
    }
    
    public static void main(String[] args)
    {
        Pila p = new Pila();
        p.apilar(9);
        p.apilar(9);
        p.apilar(2);
        p.apilar(3);
        p.apilar(2);
        p.apilar(8);
        p.apilar(2);
        p.apilar(7);
        p.apilar(9);
        p.mostrar();
        p.masPequeño();
        System.out.println("");
        p.mostrar();
    }
}