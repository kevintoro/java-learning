
package Negocio;

/**
 *
 * @author Jairo
 */
public class Lechuza extends Automovil
{
    private final int capacidad_carga;
    private final int asientos_extras;
    
    public Lechuza(int carga_extra, int asientosextras)
    {
        super();
        this.asientos_extras=asientosextras;
        this.capacidad_carga= carga_extra;
    }
    public String darDatosLechuza()
    {
        return " La Lechuza tiene una carga extra de " + capacidad_carga + " y los asientos extras son " + asientos_extras;
    }   
}