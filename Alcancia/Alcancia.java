public class Alcancia 
{
    private int total;
    private int CONT_VEINTE;
    private int CONT_CINCUENTA;
    private int CONT_CIEN;
    private int CONT_DOSCIENTOS;
    private int CONT_QUINIENTOS;
    
    public Alcancia()
    {
        total = 0;
        CONT_VEINTE = 0;
        CONT_CINCUENTA = 0;
        CONT_CIEN = 0;
        CONT_DOSCIENTOS = 0;
        CONT_QUINIENTOS = 0;
    }
    
    public void AgregarMoneda(Moneda moneda)
    {
        if(moneda.getValor() == 20)
        {
            CONT_VEINTE++;
        }
        
        if(moneda.getValor() == 50)
        {
            CONT_CINCUENTA++;
        }
        
        if(moneda.getValor() == 100)
        {
            CONT_CIEN++;
        }
        
        if(moneda.getValor() == 200)
        {
            CONT_DOSCIENTOS++;
        }
        
        if(moneda.getValor() == 500)
        {
            CONT_QUINIENTOS++;
        }
        
        total += moneda.getValor();
    }
    
    public int getTotal()
    {
        return total;
    }
    
    public void romperAlcancia()
    {
        total = 0;
        CONT_VEINTE = 0;
        CONT_CINCUENTA = 0;
        CONT_CIEN = 0;
        CONT_DOSCIENTOS = 0;
        CONT_QUINIENTOS = 0;
    }
    
    public int getVeinte()
    {
        return CONT_VEINTE;
    }
    
    public int getCincuenta()
    {
        return CONT_CINCUENTA;
    }
    
    public int getCien()
    {
        return CONT_CIEN;
    }
    
    public int getDoscientos()
    {
        return CONT_DOSCIENTOS;
    }
    
    public int getQuinientos()
    {
        return CONT_QUINIENTOS;
    }
}
