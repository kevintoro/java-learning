import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class PanelDiccionarios extends JPanel
{
    JLabel labIngles, labFrances;
    JTextField txtIngles, txtFrances;
    
    Interfaz principal;
    
    public PanelDiccionarios(Interfaz cll) 
    {
        principal = cll;
        
        setLayout(new GridLayout(1, 5));
        TitledBorder border = BorderFactory.createTitledBorder("Diccionarios");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        labIngles = new JLabel("Inglés");
        labFrances = new JLabel("Francés");
        
        txtIngles = new JTextField("0");
        txtIngles.setEditable(false);
        txtFrances = new JTextField("0");
        txtFrances.setEditable(false);
        
        add(labIngles);
        add(txtIngles);
        add(new JLabel(""));
        add(labFrances);
        add(txtFrances);
    }
    
    public void actualizar()
    {
        txtIngles.setText(String.valueOf(principal.darTamanio(1)));
        txtFrances.setText(String.valueOf(principal.darTamanio(2)));
    }
}