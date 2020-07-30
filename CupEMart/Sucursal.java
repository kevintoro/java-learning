import javax.swing.JOptionPane;
import java.util. ArrayList;
public class Sucursal
{
    
    String nombre;
    String direccion;
    
    //ArrayList<Producto> lineaProducto;
    
    public Sucursal(String nombre, String direccion)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        //lineaProducto = new ArrayList<>();
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getDireccion()
    {
        return direccion;
    }
}