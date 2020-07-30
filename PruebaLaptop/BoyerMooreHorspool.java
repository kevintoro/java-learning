
/**
 * Write a description of class Exercices here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoyerMooreHorspool
{
    public static int boyerMooreHorspool(String texto, String patron)
    {
        int cont = 0;
        char [] textArray = texto.toCharArray();
        char [] patternArray = patron.toCharArray();
        int aux = texto.length();
        int indexT = patron.length()-1;
        
        while(indexT<aux)
        {
            char temp = textArray[indexT];
            if(isInArray(textArray[indexT], patternArray))
            {
                if(compare(indexT, textArray, patternArray))
                {
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
    
    private static boolean isInArray(char c, char[] text)
    {
        for(int i = 0; i < text.length; i++)
        {
            char temp = text[i];
            if(c == text[i])
                return true;
        }
        return false;
    }
    
    private static boolean compare(int indexText, char[]text, char[]pattern)
    {
        int cant = pattern.length-1;
        while(cant>=0)
        {
            char a1 = text[indexText];
            char a2 = pattern[cant];
            if(text[indexText] != pattern[cant])
            {
                return false;
            }
            indexText--;
            cant--;
        }
        return true;
    }
}