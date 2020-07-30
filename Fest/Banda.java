public class Banda 
{
    String nombre;
    long numFans, costo;
    int numCancion;
    
    public Banda(String nombre, long numFans, int numCancion, long costo)
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
    
    public long getNumFans()
    {
        return numFans;
    }
    
    public int getNumCanciones()
    {
        return numCancion;
    }
    
    public long getCosto()
    {
        return costo;
    }
}