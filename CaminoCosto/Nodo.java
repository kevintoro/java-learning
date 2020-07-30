import java.util.ArrayList;

public class Nodo
{
    String data;
    ArrayList<Arista> linkedTo;
    
    public Nodo(String data)
    {
        this.data = data;
        linkedTo = new ArrayList<>();
    }
    
    public void linkTo(Nodo to, int cost)
    {
        boolean exist = false;
        
        for(Arista a: linkedTo)
        {
            if(a.getTo().data.equalsIgnoreCase(to.data))
            {
                exist = true;
            }
        }
        
        if(!exist)
        {
            Arista temp = new Arista(cost, to);
            linkedTo.add(temp);
        }
    }
    
    public Arista aristaMenosCosto()
    {
        Arista temp = null;
        
        for(Arista a: linkedTo)
        {
            if(temp == null)
            {
                temp = a;
            }
            else
            {
                if(a.getCost()<temp.getCost())
                {
                    temp = a;
                }
            }
        }
        
        return temp;
    }
}