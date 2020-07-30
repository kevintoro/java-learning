public class Nodo<T>
{
    public T dato;
    public Nodo sig, ant;
    
    public Nodo(T dato)
    {
        this.dato = dato;
    }
}