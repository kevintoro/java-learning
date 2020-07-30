package nodo;

public class Nodo<T>
{
    private Nodo sig;
    private T data;
    public Nodo()
    {
        data = null;
        sig = null;
    }
    
    public Nodo(T info)
    {
        data = info;
        sig = null;
    }
    
    public T getData()
    {
        return data;
    }
    
    public void setData(T data)
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