package Interfaz;

/**
 * 
 * @author 1151510 && 1151506
 */

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import main.*;

public class Main extends JFrame
{
    PanelSuperior pSuperior;
    PanelCentral pCentral;
    VentaVehiculos vVehiculos;
    //SubPanelBotonesLista botLista;
    //SubPanelBotonesFuncion botFuncion;
    
    public Main()
    {
        super();
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setBackground(Color.BLACK);
        setTitle("Venta Automóviles");
        setLayout(new BorderLayout());
        setVisible(true);
        
        pSuperior = new PanelSuperior();
        add(pSuperior,BorderLayout.NORTH);
        
        pCentral = new PanelCentral(this);
        add(pCentral, BorderLayout.CENTER);
        
        vVehiculos = new VentaVehiculos();
        
        
    }
    
    public static void main(String[] args)
    {
        Main m = new Main();
    }
}