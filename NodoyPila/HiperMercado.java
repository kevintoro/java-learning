import java.util.ArrayList;
import javax.swing.JOptionPane;

public class HiperMercado
{
    private ArrayList<Sucursal> sucursales;
    public HiperMercado()
    {
        sucursales = new ArrayList<>();
    }
    
    public void addSucursal(Sucursal sucursal)
    {
        int cont = 0;
        for(Sucursal c : sucursales)
        {
            if(c.getNombre().equalsIgnoreCase(sucursal.getNombre()))
            {
                cont++;
            }
        }
        
        if(cont == 0)
        {
            sucursales.add(sucursal);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sucursal ya Agregada", "Información", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void deleteSucursal(Sucursal sucursal)
    {
        int cont = 0;
        for(Sucursal c : sucursales)
        {
            if(c == sucursal)
            {
                cont++;
            }
        }
        
        if(cont != 0)
        {
            sucursales.remove(sucursal);
            JOptionPane.showMessageDialog(null, "Sucursal Eliminada");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sucursal no encontrada", "Información", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public String reporte()
    {
        String reporte = "";
        
        for(Sucursal s: sucursales)
        {
            reporte = reporte.concat("Sucursal: \n"+s.getDireccion()+"   -   "+s.getNombre()+"\n"+s.listar()+"\n");
        }
        
        return reporte;
    }
    
    public ArrayList <Sucursal> getSucursales()
    {
        return sucursales;
    }
}