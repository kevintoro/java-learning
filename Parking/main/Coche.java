package main;

import java.util.*;
import javax.swing.JOptionPane;

public class Coche
{
    private LinkedList<Reparacion> reparaciones;
    private String matricula, dueño;
    
    public Coche(String matricula, String dueño)
    {
        this.matricula = matricula;
        this.dueño = dueño;
        reparaciones = new LinkedList<>();
    }

    public LinkedList<Reparacion> getReparaciones()
    {
        return reparaciones;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public String getDueño()
    {
        return dueño;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public void setDueño(String dueño)
    {
        this.dueño = dueño;
    }
    
    public void addReparacion(Reparacion reparacion)
    {
        if(reparaciones.size()>0)
        {
            if(reparaciones.getLast().getKm()<reparacion.getKm())
            {
                reparaciones.add(reparacion);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Kilometraje Inferior que Reparación Anterior","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            reparaciones.add(reparacion);
        }
    }
    
    public Reparacion getUltimaReparacion()
    {
        if(reparaciones.isEmpty() == false)
        {
            return reparaciones.getLast();
        }
        else
            return null;
    }
    
    public ArrayList <Reparacion> getReparacionPalabra(String palabraClave)
    {
        ArrayList<Reparacion> rep = new ArrayList<>();
        
        for(Reparacion rp: reparaciones)
        {
            if(rp.getDescripcion().contains(palabraClave))
            {
                rep.add(rp);
            }
        }
        
        if(rep.isEmpty() == false)
        {
            return rep;
        }
        else
            return null;
    }
}