package main;

public class Reparacion
{
    private String descripcion;
    private int km;
    
    public Reparacion(String descripcion, int km)
    {
        this.descripcion = descripcion;
        this.km = km;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public int getKm()
    {
        return km;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public void setKm(int km)
    {
        this.km = km;
    }
}