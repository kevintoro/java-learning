public class BoyerMooreHorspool2
{
    public static int[] preBoyerMooreHorspool(char[] p, int size)
    {
        int pLength = p.length;
        int last = p.length - 1;
 
        // precalcular R
        int[] r = new int[size];
        for(int i = 0; i < size; i++)
        {
            r[i] = pLength;
        }
        
        for(int i = 0; i < last; i++)
        {
            r[p[i]] = last - i;
        }
 
        return r;
    }
    
    public static int boyerMooreHorspool(String patron)
    {
        String texto = Archivo.leerGrafico(null);
        char [] textArray = texto.toCharArray();
        char [] patternArray = patron.toCharArray();
        
        int sizeText = textArray.length;
        int sizePattern = patternArray.length;
        
        int cont = 0;
        int [] t = preBoyerMooreHorspool(patternArray, 256);
        
        int i = 0;
        
        int temp = sizeText- sizePattern;
        
        while(i <= temp)
        {
            int j = sizePattern - 1;
            while(j < sizePattern)
            {
                if(j>=0)
                {
                    char a1 = textArray[i+j];
                    char a2 = patternArray[j];
                    int a3 = a1;
                }
                
                if(j<0)
                {
                    cont++;
                    break;
                }
                else if(textArray[i+j] != patternArray[j])
                {
                    break;
                }
                j--;
            }
            char a1 = textArray[i+(sizePattern - 1)];
            int sum = t[textArray[i+(sizePattern - 1)]];
            i += sum;
        }
        
        return cont;
    }
}