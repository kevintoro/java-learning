
public class Banda
{
    String nombre;
    int numFans, numCancion, costo;
    
    public Banda(String nombre, int numFans, int numCancion, int costo)
    {
        this.nombre = nombre;
        this.numFans = numFans;
        this.numCancion = numCancion;
        this.costo = costo;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getNumFans()
    {
        return numFans;
    }
    
    public int getNumCanciones()
    {
        return numCancion;
    }
    
    public int getCosto()
    {
        return costo;
    }
}