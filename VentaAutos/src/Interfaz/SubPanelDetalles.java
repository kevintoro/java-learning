package Interfaz;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.*;
public class SubPanelDetalles extends JPanel
{
    public SubPanelDetalles()
    {
        TitledBorder border = BorderFactory.createTitledBorder("Detalles del Vehículo");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
    }
}
