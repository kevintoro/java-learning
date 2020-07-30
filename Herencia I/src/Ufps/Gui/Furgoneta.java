package Ufps.Gui;
/**
 *
 * @author PROFESORES
 */
public class Furgoneta extends Carro
{
    private int capacidad_carga;
    private int asientos_extras;
    
    public Furgoneta(int carga, int asientos)
    {
        super();
        this.asientos_extras= asientos;
        this.capacidad_carga= carga;
    }
     public String darDatosFurgoneta()
    {
        return " La Furgonetaa tiene una carga extra de " + capacidad_carga + " y los asientos extras son " + asientos_extras;
    }
}
