import java.util.*;
public class VentaVehiculos
{
    private ArrayList<Vehiculo> lista;
    
    public VentaVehiculos()
    {
        lista = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getLista()
    {
        return lista;
    }
    
    public void venderVehiculo(Vehiculo vehiculo)
    {
        boolean elim = false;
        for(Vehiculo v: lista)
        {
            if(vehiculo == v)
            {
                if(v.getCantidad()>1)
                {
                    v.setCantidad(v.getCantidad()-1);
                }
            }
            else
            {
                elim = true;
            }
        }
        
        if(elim == true)
        {
            lista.remove(vehiculo);
        }
    }
    
    public void agregarVehiculo(Vehiculo vehiculo)
    {
        boolean exist = false;
        if(lista != null)
        {
            for(Vehiculo v: lista)
            {
                if(vehiculo == v)
                {
                    int cant = v.getCantidad();
                    v.setCantidad(cant+1);
                    exist = true;
                }
            }
        
            if(exist == false)
            {
                lista.add(vehiculo);
            }
        }
        else
        {
            lista.add(vehiculo);
        }
    }
}