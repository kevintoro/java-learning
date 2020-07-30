/*
 * Programa de String matching usando el algoritmo de Boyer - Moore - Horspool
 */
package negocio;

/**
 * Clase para el uso de Boyer Moore Horspool, implementación a lo bruto :v, no esperen
 * que corra en menos de 1 segundo, no mamen, me batiempanadamamé haciendo esto, 
 * mezclando la depresión, mucha agua, sueño, y mi habilidad de hacer todo a última hora
 * así que tomen asiento, y si se demora, vayan por un café con pan Att: autor
 * @author Kevin Toro: 1151506
 */
public class BoyerMooreHorspool
{
    ListIndex l;

    public BoyerMooreHorspool()
    {
        l = new ListIndex();
    }
    
    /**
     * 
     * @param texto
     * @param patron
     * @return 
     */
    public int boyerMooreHorspool(String texto, String patron)
    {
        int cont = 0;
        char [] textArray = texto.toCharArray();
        char [] patternArray = patron.toCharArray();
        int aux = texto.length();
        int indexT = patron.length()-1;
        
        while(indexT<aux)
        {
            if(isInArray(textArray[indexT], patternArray))
            {
                if(compare(indexT, textArray, patternArray))
                {
                    Indices i = new Indices(indexT-(patron.length()-1), indexT);
                    l.addIndex(i);
                    cont++;
                }
                indexT++;
            }
            else
            {
                indexT = indexT+patron.length();
            }
        }
        return cont;
    }
    
    private boolean isInArray(char c, char[] text)
    {
        for(int i = 0; i < text.length; i++)
        {
            if(c == text[i])
                return true;
        }
        return false;
    }
    
    private boolean compare(int indexText, char[]text, char[]pattern)
    {
        int cant = pattern.length-1;
        while(cant>=0)
        {
            if(text[indexText] != pattern[cant])
            {
                return false;
            }
            indexText--;
            cant--;
        }
        return true;
    }
    
    public ListIndex getListIndex()
    {
        return l;
    }
    
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
                    Indices ind = new Indices(i, i+patron.length()-1);
                    l.addIndex(ind);
                    cont++;
                    break;
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
            if(s.equals(arrayPattern[i]))
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