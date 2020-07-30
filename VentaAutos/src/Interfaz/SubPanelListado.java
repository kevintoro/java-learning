package Interfaz;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.*;
import main.*;

public class SubPanelListado extends JPanel
{
    JList<String> listado;
    public SubPanelListado(VentaVehiculos v)
    {
        TitledBorder border = BorderFactory.createTitledBorder("Vehículos a la Venta");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        listado = new JList<>();
        actualizar(v);
        add(listado);
    }
    
    public final void actualizar(VentaVehiculos v)
    {
        listado.removeAll();
        DefaultListModel <String> model = new DefaultListModel();
        if(v!=null)
        {
            for(Vehiculo vh: v.getLista())
            {
                model.addElement(vh.getMarca()+" - "+vh.getModelo()+"("+vh.getAño()+")");
            }
        }
        else
        {
            model.addElement("");
        }
        listado.setModel(model);
    }
}
