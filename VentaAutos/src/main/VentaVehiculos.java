package main;

import java.util.*;
import javax.swing.JOptionPane;
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
        for(Vehiculo v: lista)
        {
            if(vehiculo == v)
            {
                v.setCantidad(v.getCantidad()+1);
                exist = true;
            }
        }
        
        if(exist == false)
        {
            lista.add(vehiculo);
        }
    }
    
    public Vehiculo buscarVehiculo(String marca, String nombre)
    {
        Vehiculo car = null;
        for(Vehiculo v: lista)
        {
            if(v.getMarca().equalsIgnoreCase(marca))
            {
                if(v.getModelo().equalsIgnoreCase(nombre))
                {car = v;
                    System.out.println("Se ha encontrado vehiculo");
                }
                else
                {
                    System.out.println("Vehiculo no encontrado");
                }
            }
        }
        return car;
    }
    
    public void ordenarModelo()
    {
        String n = "";
        if(lista.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Lista Vacia");
        }
        else
        {
            LinkedList modelo = new LinkedList<>();
            for(int i = 0; i < lista.size(); i++)
            {
                modelo.add(lista.get(i).getModelo());
            }
            Collections.sort(modelo);
            for(Object mod: modelo)
            {
                n += mod +"\n"; 
            }
            System.out.println(n);
        }
    }
    
    public static void main(String[] args) {
        
        VentaVehiculos vv = new VentaVehiculos();
        
        vv.agregarVehiculo(new Vehiculo("BMW","ar-200","2000",1000,4,4));
        vv.agregarVehiculo(new Vehiculo("BMW","s3jk","2000",1000,4,2));
        System.out.println("Busqueda");
        System.out.println(vv.buscarVehiculo("BMW9","ar-200"));
        System.out.println("Ordenar");
        vv.ordenarModelo();
    }
}