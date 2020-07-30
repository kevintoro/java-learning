package main;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelVehiculo extends JPanel 
{
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JTextField txtLinea;
    private JTextField txtValor;
    private JLabel labMarca;
    private JLabel labModelo;
    private JLabel labLinea;
    private JLabel labValor;
            
    public PanelVehiculo()
    {
        setLayout(new GridLayout(5, 2));
        setPreferredSize(new Dimension(0,130));
        
        TitledBorder border = BorderFactory.createTitledBorder("Datos del Vehículo");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        labMarca = new JLabel("Marca");
        labLinea = new JLabel("Línea");
        labModelo = new JLabel("Modelo");
        labValor = new JLabel("Valor");
        txtMarca = new JTextField();
        txtLinea = new JTextField();
        txtModelo = new JTextField();
        txtValor = new JTextField("$0");
        
        txtValor.setEditable(false);
        txtValor.setForeground(Color.BLUE);
        txtValor.setBackground(Color.WHITE);
        
        add(labMarca);
        add(txtMarca);
        add(labLinea);
        add(txtLinea);
        add(labModelo);
        add(txtModelo);
        add(labValor);
        add(txtValor);
    }
}