package Negocio;
/**
 *
 * @author PROFESORES
 */
public class Jefe extends Empleado
{
    private double incentivo;
    
    public Jefe(String nom, double sue, int agno, int mes, int dia)
    {
        super(nom,sue,agno,mes,dia);
    }
    public void estableceIncentivo(double b)
    {
        incentivo=b;
    }
    
    @Override
    public double getSueldo()
    {
        return super.getSueldo() + incentivo;
    }
}
