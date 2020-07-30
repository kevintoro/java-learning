package Interfaz;

import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelBusqueda extends JPanel implements ActionListener
{
    JTextField txtMatricula;
    JButton buttBuscar;
    FrameMain main;
    public PanelBusqueda(FrameMain main)
    {
        super();
        this.main = main;
        TitledBorder border = BorderFactory.createTitledBorder("Realizar Búsqueda");
        border.setTitleColor(Color.BLUE);
        setLayout(new GridLayout(2, 2));
        
        add(new JLabel("    Matrícula a Buscar: "));
        txtMatricula = new JTextField();
        add(txtMatricula);
        add(new JLabel());
        
        buttBuscar = new JButton("Buscar");
        buttBuscar.addActionListener(this);
        add(buttBuscar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == buttBuscar)
        {
            if(main.getGarage().getCoches().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "No Hay Automóviles Agregados","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                if(main.getGarage().buscarCoche(txtMatricula.getText()))
                {
                    JOptionPane.showMessageDialog(null, "Coche Existente: "+main.getGarage().getCoche(txtMatricula.getText()).getMatricula()+
                            "\nDueño: "+main.getGarage().getCoche(txtMatricula.getText()).getDueño());
                    
                    txtMatricula.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Coche no Existente","¡Atención!",JOptionPane.WARNING_MESSAGE);
                    txtMatricula.setText("");
                }
            }
        }
    }
}