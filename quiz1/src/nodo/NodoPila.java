package nodo;
/**
 *
 * @author Yeferson Ascanio
 */
public class NodoPila
{
    NodoPila enlace;
    String data;
    
    public NodoPila(String info)
    {
        data = info;
        enlace = null;
    }
    
    public void setEnlace(NodoPila n)
    {
        this.enlace = n;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NodoPila getEnlace() {
        return enlace;
    }

    public String getData() {
        return data;
    }
    
}