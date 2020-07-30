package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import main.VentaVehiculos;

public class SubPanelBotonesLista extends JPanel implements ActionListener
{
    
    JButton butMarca, butCilindrada, butAnio, butBuscarV;
    
    public SubPanelBotonesLista(VentaVehiculos v)
    {
        TitledBorder border = BorderFactory.createTitledBorder("Busqueda y Ordenamientos");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        setVisible(true);
        setLayout(new GridLayout(1,2));
        
        butMarca = new JButton("Ordenar Por Marca");
        butMarca.addActionListener(this);
        butBuscarV = new JButton("Buscar Vehiculo");
        butBuscarV.addActionListener(this);
        
        add(butMarca);
        add(butBuscarV);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        
    }
}