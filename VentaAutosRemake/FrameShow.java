import javax.swing.*;
import java.awt.*;
public class FrameShow extends JFrame
{
    JPanel pane;
    JLabel lab;
    Vehiculo v;
    public FrameShow(Vehiculo v)
    {
        setSize(285, 195);
        setLayout(new GridLayout(1,1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
        this.v = v;
        pane = new JPanel();
        lab = new JLabel(v.getImagen());
        pane.add(lab);
        add(pane);
    }
}