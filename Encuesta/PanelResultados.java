import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.*;

public class PanelResultados extends JPanel
{
    public PanelResultados()
    {
        setLayout(new GridLayout(WIDTH, WIDTH));
        TitledBorder border = BorderFactory.createTitledBorder("Resultados");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
    }
}