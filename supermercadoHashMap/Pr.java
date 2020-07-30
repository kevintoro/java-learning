public class Pr 
{
    String palabra;
    
    public Pr(String pr)
    {
        palabra = pr;
    }
    
    public void palabraPorPalabra()
    {
        while(palabra.length()>0)
        {
            int in = palabra.indexOf(" ");
            String p = "";
            if(in>0)
            {
                p = palabra.substring(0,in);
                palabra = palabra.substring(in+1,palabra.length());
            }
            else
            {
                p = palabra;
                palabra = "";
            }
            System.out.println(p);
        }
    }
    
    public static void main(String[] args)
    {
        Pr p = new Pr("Su Pinche Gfa We");
        p.palabraPorPalabra();
    }
}