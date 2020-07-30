import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class Sucursal
{
    
    private final String nombre;
    private final String direccion;
    
    ArrayList<Producto> lineaProducto;
    
    public Sucursal(String nombre, String direccion)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        lineaProducto = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Producto> getLineaProducto() {
        return lineaProducto;
    }
    
    public void AgregarProducto(Producto producto)
    {
        int cont = 0;
        for(Producto p: lineaProducto)
        {
            if(p == producto)
            {
                cont++;
            }
            else if(p.getCodigo().equals(producto.getCodigo()))
            {
                JOptionPane.showMessageDialog(null, "Código ya en Uso","Error",JOptionPane.ERROR_MESSAGE);
                cont++;
            }
        }
        
        if(cont == 0)
        {
            lineaProducto.add(producto);
            JOptionPane.showMessageDialog(null, "Producto Agregado Correctamente");
        }
    }
    
    public Producto lineaMasAntigua()
    {
        Producto temp = null;
        
        for(Producto p : lineaProducto)
        {
            if(temp != null)
            {
                if(p.getFecha().getDate().before(temp.getFecha().getDate()))
                {
                    temp = p;
                }
            }
            else
            {
                temp = p;
            }
        }
        
        return temp;
    }
    
    public void eliminarProducto(String producto)
    {
        int cont = 0;
        Producto elim = null;
        for(Producto p: lineaProducto)
        {
            if(p.getNombre().equalsIgnoreCase(producto))
            {
                cont++;
                elim = p;
            }
        }
        
        if(cont>0)
        {
            lineaProducto.remove(elim);
            JOptionPane.showMessageDialog(null, "Producto Eliminado Correctamente");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Producto no Existente en tienda", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String listar()
    {
        String lista = "";
        for(Producto  p: lineaProducto)
        { 
            lista = lista.concat("- Línea de Producto: \n- Nombre: "+p.getNombre()+"\n- Código: "
                    +p.getCodigo()+"\n"
                    + "- Descripción: "+p.getDescripcion()+"\n"
                    + "- Precio Por Unidad: "+p.getPrecio()+"\n- Fecha: "+new SimpleDateFormat("dd - MM - yyyy").format(p.getFecha().getDate())+"\n\n");
        }
        
        if(lista.equals(""))
        {
            lista = "- NO HAY PRODUCTOS AGREGADOS";
        }
        
        return lista;
    }
    
    public int eliminarRangoPrecio(double precioMenor, double precioMayor)
    {
        ArrayList<Producto> temp = new ArrayList<>();
        for(Producto p: lineaProducto)
        {
            if(p.getPrecio()>= precioMenor && p.getPrecio()<=precioMayor)
            {
                temp.add(p);
            }
        }
        
        for(Producto p: temp)
        {
            lineaProducto.remove(p);
        }
        
        return temp.size();
    }
}