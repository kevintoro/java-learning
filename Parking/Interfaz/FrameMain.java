package Interfaz;

/**
 *
 * @author 1151506
 */

import java.awt.*;
import javax.swing.*;
import main.*;

public class FrameMain extends JFrame
{
    private final JPanel contentpane;
    private final Garage garage;
    private final PanelAgregar pAgregar;
    private final PanelReparacion pReparacion;
    private final PanelBusqueda pBusqueda;
    public FrameMain()
    {
        super();
        contentpane = new JPanel();
        contentpane.setLayout(new BorderLayout());
        setSize(350, 400);
        setContentPane(contentpane);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Parking");
        setVisible(true);
        setResizable(false);
        
        garage = new Garage();
        pAgregar = new PanelAgregar(this);
        add(pAgregar, BorderLayout.NORTH);
        
        pReparacion = new PanelReparacion(this);
        add(pReparacion, BorderLayout.CENTER);
        
        pBusqueda = new PanelBusqueda(this);
        add(pBusqueda, BorderLayout.SOUTH);
        
        pack();
    }
    
    public Garage getGarage()
    {
        return garage;
    }
    
    public static void main(String[] args)
    {
        FrameMain main = new FrameMain();
    }
}