public class Camino
{
    Nodo start;
    Nodo end;
    
    public Camino()
    {
        start = new Nodo("start");
        end = new Nodo("end");
    }
    
    public void addLink(Nodo from, Nodo to, int costo)
    {
        if(from != end)
        {
            from.linkTo(to, costo);
        }
        else
        {
            System.out.println("El Nodo de partida no puede ser el final");
        }
    }
    
    public Nodo menosCostoHastaFin(Nodo ac)
    {
        if(ac!=end)
        {
            System.out.println(ac.data);
            ac = menosCostoHastaFin(ac.aristaMenosCosto().getTo());
        }
        else
        {
            System.out.println(ac.data);
        }
        
        return ac;
    }
    
    public static void main(String[] args)
    {
        Camino cam = new Camino();
        Nodo a = new Nodo("a");
        Nodo b = new Nodo("b");
        Nodo c = new Nodo("c");
        Nodo d = new Nodo("d");
        cam.addLink(cam.start, a, 3);
        cam.addLink(cam.start, b, 6);
        cam.addLink(a, b, 4);
        cam.addLink(a, c, 2);
        cam.addLink(b, c, 5);
        cam.addLink(b, d, 1);
        cam.addLink(c, d, 2);
        cam.addLink(c, cam.end, 4);
        cam.addLink(d, cam.end, 3);
        cam.menosCostoHastaFin(cam.start);
    }
}