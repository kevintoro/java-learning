import java.util.ArrayList;
public class Traductor
{
    public final static int INGLES = 1;
    public final static int FRANCES = 2;
    
    private ArrayList<Traduccion> dicIngles;
    private ArrayList<Traduccion> dicFrances;
    
    public Traductor()
    {
        dicIngles = new ArrayList<>();
        dicFrances = new ArrayList<>();
    }
    
    public void agregarTraduccion(String pal, String trad, int idioma)
    {
        ArrayList traducciones = obtenerTraducciones(idioma);
        Traduccion laTraduccion = buscarTraduccionDe(pal, idioma);
        
        if(laTraduccion != null)
        {
            laTraduccion.cambiarTraduccion(trad);
        }
        else
        {
            traducciones.add(new Traduccion( pal, trad));
        }
    }
    
    public Traduccion buscarTraduccionDe(String pal, int idioma)
    {
        ArrayList <Traduccion> traducciones = obtenerTraducciones(idioma);
        for(Traduccion k :traducciones)
        {
            if(k.darPalabra().equals(pal))
            {
                return k;
            }
        }
        return null;
    }
    
    public int darTamanioDirectorio(int idioma)
    {
        ArrayList traducciones = obtenerTraducciones(idioma);
        if(traducciones == null)
        {
            return 0;
        }
        else
            return traducciones.size();
    }
    
    public ArrayList obtenerTraducciones(int idiomaTraduccion)
    {
        if(idiomaTraduccion == INGLES)
            return dicIngles;
        else if(idiomaTraduccion == FRANCES)
            return dicFrances;
        else
            return null;
    }
}
