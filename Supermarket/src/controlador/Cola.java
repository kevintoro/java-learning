package controlador;

/**
 * 
 * @version 1.0
 */
public class Cola
{
    Nodo inicio, fin;
    
    /**
     * Constructor de la Colaa
     */
    public Cola()
    {
        this.inicio = null;
        this.fin = null;
    }
    
    /**
     * Agrega un Nodo a la Cola
     * @param nc Nodo nuevo a agregar
     */
    public void addNodo(Nodo nc)
    {
        if(inicio == null)
        {
            inicio = fin = nc;
        }
        else
        {
            fin.setSiguiente(nc);
            nc.setAnterior(fin);
            fin = nc;
        }
    }
    
    /**
     * 
     * @return inicio de la Cola
     */
    public Nodo getInicio()
    {
        return inicio;
    }
    
    /**
     * 
     * @return final de la Cola
     */
    public Nodo getFin()
    {
        return fin;
    }
}