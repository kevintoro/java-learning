public class BMH
{
    public int boyerMooreHorspool2(String texto, String patron)
    {
        int cont = 0;
        String [] arrayPattern = getArrayText(patron);
        int aux = texto.length() - patron.length();
        
        int i = 0;
        
        while(i <= aux)
        {
            int j = patron.length()-1;
            
            while(j>=-1)
            {
                if(j == -1)
                {
                    cont++;
                    break;
                }
                
                if(j != -1)
                {
                    String a = texto.substring(i+j, i+j+1);
                    String b = patron.substring(j, j+1);
                    char asdasdasd = 'a';
                }
                
                if(!texto.substring(i+j, i+(j+1)).equals(patron.substring(j, j+1)))
                {
                    break;
                }
                
                j--;
            }
            
            i += max(1, getJump(texto.substring(i+patron.length()-1,i+patron.length()), arrayPattern));
        }
        
        return cont;
    }
    
    public int boyerMooreHorspool2(String patron)
    {
        Archivo arch = new Archivo();
        String texto = arch.leerGrafico(null);
        int cont = 0;
        String [] arrayPattern = getArrayText(patron);
        int aux = texto.length() - patron.length();
        
        int i = 0;
        
        while(i <= aux)
        {
            int j = patron.length()-1;
            
            while(j>=-1)
            {
                if(j == -1)
                {
                    cont++;
                    break;
                }
                
                if(j != -1)
                {
                    String a = texto.substring(i+j, i+j+1);
                    String b = patron.substring(j, j+1);
                    char asdasdasd = 'a';
                }
                
                if(!texto.substring(i+j, i+(j+1)).equals(patron.substring(j, j+1)))
                {
                    break;
                }
                
                j--;
            }
            
            i += max(1, getJump(texto.substring(i+patron.length()-1,i+patron.length()), arrayPattern));
        }
        
        return cont;
    }
    
    private int getJump(String s, String [] arrayPattern)
    {
        for(int i = 0; i<arrayPattern.length;i++)
        {
            String temp = arrayPattern[i];
            if(s.equals(temp))
            {
                return i;
            }
        }
        return arrayPattern.length;
    }
    
    private static int max(int a, int b)
    {
        if(a>b)
            return a;
        
        return b;
    }
    
    private String[] getArrayText(String txt)
    {
        int aux = txt.length();
        String s [] = new String[aux];
        
        int l = 0;
        
        for(int i=aux-1;i>=0; i--)
        {
            s[i] = txt.substring(l, l+1);
            l++;
        }
        
        return s;
    }
}