package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import main.VentaVehiculos;

public class SubPanelBotonesFuncion extends JPanel{
    
    JButton butAgregarV, butOferta, butMasEconomico, butComprarV, butMasAntiguo, butMasPotente;
    
    public SubPanelBotonesFuncion(VentaVehiculos v)
    {
        setVisible(true);
        TitledBorder border = BorderFactory.createTitledBorder("Consultas y Operaciones");
        border.setTitleColor(Color.blue);
        setBorder(border);
        setLayout(new GridLayout(2,3));
        
        butAgregarV = new JButton("Agregar Vehiculo");
        //
        butOferta = new JButton("Disminuir Precio");
        //
        butMasEconomico = new JButton("Más Económico");
        //
        butComprarV = new JButton("Comprar Vehiculo");
        //
        butMasAntiguo = new JButton("Más Antiguo");
        //
        butMasPotente = new JButton("Más Potente");
        //
        
        add(butAgregarV);
        add(butOferta);
        add(butMasEconomico);
        add(butComprarV);
        add(butMasAntiguo);
        add(butMasPotente);
    }
}
