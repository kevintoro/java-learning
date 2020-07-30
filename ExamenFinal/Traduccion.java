public class Traduccion
{
    private String palabra;
    private String traduccion;
    
    public Traduccion(String pal, String trad)
    {
        palabra = pal;
        traduccion = trad;
    }
    
    public String darPalabra()
    {
        return palabra;
    }
    
    public String darTraduccion()
    {
        return traduccion;
    }
    
    public void cambiarTraduccion(String nueva)
    {
        traduccion = nueva;
    }
}
