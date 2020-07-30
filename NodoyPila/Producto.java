import java.util.*;

public class Producto
{
    private final String nombre;
    private final String codigo;
    private final String descripcion;
    private double precio;
    private Fecha fecha;
    
    public Producto(String nombre, String codigo, String descripcion, double precio, Date fecha)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = new Fecha(fecha);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}