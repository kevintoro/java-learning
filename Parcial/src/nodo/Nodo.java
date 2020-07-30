package nodo;

public class Nodo
{
    private Nodo sig;
    private int data;
    public Nodo()
    {
        data = 0;
        sig = null;
    }
    
    public Nodo(int info)
    {
        data = info;
        sig = null;
    }
    
    public int getData()
    {
        return data;
    }
    
    public void setData(int data)
    {
        this.data = data;
    }

    public Nodo getSig()
    {
        return sig;
    }

    public void setSig(Nodo sig)
    {
        this.sig = sig;
    }
    
}