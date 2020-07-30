package negocio;

import java.util.ArrayList;

/**
 *
 * @author OLIVO
 */
public class ListIndex
{
    private ArrayList<Indices> index;

    public ListIndex()
    {
        index = new ArrayList<>();
    }
    
    public void addIndex(Indices i)
    {
        index.add(i);
    }
    
    public ArrayList<Indices> getIndex()
    {
        return this.index;
    }
}