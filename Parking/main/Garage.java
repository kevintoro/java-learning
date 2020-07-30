package main;

import java.util.*;
import javax.swing.JOptionPane;

public class Garage
{
    private LinkedList<Coche> coches;
    
    public Garage()
    {
        coches = new LinkedList<>();
    }

    public LinkedList<Coche> getCoches()
    {
        return coches;
    }
    
    public void addCoche(Coche coche)
    {
        int cont = 0;
        for(Coche ch : coches)
        {
            if(ch.getMatricula().equalsIgnoreCase(coche.getMatricula()))
            {
                cont++;
            }
        }
        
        if(cont == 0)
        {
            coches.add(coche);
            JOptionPane.showMessageDialog(null, "Automóvil Agregado Correctamente");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Coche Ya Existente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Coche getCoche(String matricula)
    {
        Coche ch = null;
        for(Coche c  :  coches)
        {
            if(c.getMatricula().equalsIgnoreCase(matricula))
            {
                ch = c;
            }
        }
        return ch;
    }
    
    public Boolean buscarCoche(String matricula)
    {
        boolean search = false;
        for(Coche ch  :  coches)
        {
            if(ch.getMatricula().equalsIgnoreCase(matricula))
            {
                search = true;
            }
        }
        return search;
    }
    
    public void darSalida(Coche coche)
    {
        Coche ch = getCoche(coche.getMatricula());
        if(ch.getDueño().equalsIgnoreCase(coche.getDueño()))
        {
            int confirm = JOptionPane.showConfirmDialog(null, "Confirmar Salida","Confirmación",JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION)
            {
                coches.remove(coche);
                System.out.println(coches.size());
                JOptionPane.showMessageDialog(null, "Salida Exitosa");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Dueño Erróneo","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}