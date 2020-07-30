package negocio;


/**
 *
 * @author Kevin Toro: 1151506
 */
public class Indices
{
    private int inicio, fin;

    public Indices(int inicio, int fin)
    {
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
    
}