public class Arista
{
    Nodo to;
    int cost;
    
    public Arista(int cost, Nodo to)
    {
        this.cost = cost;
        this.to = to;
    }
    
    public Nodo getTo()
    {
        return to;
    }
    
    public int getCost()
    {
        return cost;
    }
}