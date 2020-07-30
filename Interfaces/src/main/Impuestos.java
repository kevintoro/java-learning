package main;

import javax.swing.*;
import java.awt.*;

public class Impuestos extends JFrame
{
    private PanelVehiculo panelVehiculo;
    private PanelDescuentos panelDescuentos;
    private PanelResultados panelResultados;
    
    public Impuestos()
    {
        setSize(300,450);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Cálculo Impuestos");
        setResizable(false);
        setLayout(new BorderLayout());
        
        panelVehiculo  = new PanelVehiculo();
        add(panelVehiculo,BorderLayout.NORTH);
        
        panelDescuentos = new PanelDescuentos();
        add(panelDescuentos,BorderLayout.CENTER);
        
        panelResultados = new PanelResultados();
        add(panelResultados,BorderLayout.SOUTH);
       
    }
    
    public static void main(String[] args) 
    {
        Impuestos ip = new Impuestos();
    }
}