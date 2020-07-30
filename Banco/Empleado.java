public class Empleado
{
    String nombre;
    String identificacion;
    int añoIngreso;
    
    public Empleado(String nombre, String identificacion, int añoIngreso)
    {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.añoIngreso = añoIngreso;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getIdentificacion()
    {
        return identificacion;
    }
    
    public int calcularDiasVacaciones()
    {
        return 0;   
    }
}