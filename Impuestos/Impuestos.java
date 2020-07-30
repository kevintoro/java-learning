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
        
        panelDescuentos = new PanelDescuentos(this);
        add(panelDescuentos,BorderLayout.CENTER);
        
        panelResultados = new PanelResultados();
        add(panelResultados,BorderLayout.SOUTH);
       
    }
}
    