public class ListaCircularConductores
{
    Nodo inicio, fin, ac;
    
    public ListaCircularConductores()
    {
        inicio = null;
        fin = null;
    }
    
    public void agregar(String nConductor)
    {
        Nodo c = new Nodo(nConductor);
        if(inicio == null)
        {
            inicio = c;
            fin = c;
            ac = inicio;
        }
        else
        {
            fin.sig = c;
            c.sig = inicio;
            c.ant = fin;
            fin = c;
            inicio.ant = fin;
        }
    }
    
    public Nodo getActual()
    {
        return ac;
    }
    
    public Nodo siguiente()
    {
        if(inicio != fin)
        {
            ac = ac.sig;
        }
        return ac;
    }
    
    public Nodo anterior()
    {
        if(inicio != fin)
        {
            ac = ac.ant;
        }
        return ac;
    }
    
    public void eliminar(String nombre)
    {   
        ListaCircularConductores lTemp = new ListaCircularConductores();
        Nodo temp = inicio;
        while(temp!=fin)
        {
            String ct = (String) temp.dato;
            if(ct.equalsIgnoreCase(nombre))
            {
                temp = temp.sig;
            }
            else
            {
                lTemp.agregar(ct);
                temp = temp.sig;
            }
            String sd = (String) temp.dato;
        }
        
        String data = (String) temp.dato;
        if(data.equalsIgnoreCase(nombre) == false)
        {
            lTemp.agregar(data);
        }
        
        inicio = lTemp.inicio;
        fin = lTemp.fin;
    }
    
    public void mostrar()
    {
        Nodo temp = inicio;
        while(temp!=fin)
        {
            System.out.println(temp.dato);
            temp = temp.sig;
        }
        System.out.println(temp.dato);
    }
    
    public static void main(String[] args) {
        ListaCircularConductores c = new ListaCircularConductores();
        c.agregar("1");
        c.agregar("2");
        c.agregar("3");
        c.mostrar();
        System.out.println("");
        c.eliminar("2");
        c.mostrar();
    }
}