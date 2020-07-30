package Negocio;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author PROFESORES
 */
public class Empleado 
{
    private String nombre;
    private double sueldo;
    private Date fechacontrato;
    private int Id;
    private static int IdSiguiente;
    
    public Empleado(String nom, double sue, int agno, int mes, int dia)
    {
        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario= new GregorianCalendar(agno,mes-1,dia);
        fechacontrato=calendario.getTime();
        ++IdSiguiente;
        Id=IdSiguiente;
    }
    public Empleado(String nom)
    {
        this(nom, 3000, 2000,01,01);
    }
    public Date getFechaContrato()
    {
        return fechacontrato;
    }
    public double getSueldo()
    {
        return sueldo;
    }
    public String getNombre()
    {
        return nombre + " Id: " + Id;
    }
    public void subeSueldo(double porcentaje)
    {
        double aumento = sueldo*porcentaje/100;
        sueldo +=aumento;
    }
}
