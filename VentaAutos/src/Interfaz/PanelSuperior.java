package Interfaz;

import java.awt.Image;
import javax.swing.*;
public class PanelSuperior extends JPanel
{
    JLabel lab;
    public PanelSuperior()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Banner.png"));
        ImageIcon rIcon = new ImageIcon(icon.getImage().getScaledInstance(840, 120, Image.SCALE_DEFAULT));
        lab = new JLabel(rIcon);
        add(lab);
    }
}