package Interfaz;

import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import main.*;

public class PanelReparacion extends JPanel implements ActionListener
{
    JTextField txtMatricula, txtDescripcion, txtKm;
    JButton buttAgg, buttUltima;
    FrameMain main;
    
    public PanelReparacion(FrameMain main)
    {
        super();
        this.main = main;
        setLayout(new GridLayout(5, 2));
        TitledBorder border = BorderFactory.createTitledBorder("Agregar Reparación");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        add(new JLabel("Matrícula: "));
        txtMatricula = new JTextField();
        add(txtMatricula);
        
        add(new JLabel("Descripción: "));
        txtDescripcion = new JTextField();
        add(txtDescripcion);
        
        add(new JLabel("Kilometraje: "));
        txtKm = new JTextField();
        add(txtKm);
        
        add(new JLabel());
        add(new JLabel());
        
        buttAgg = new JButton("Agregar Reparación");
        buttAgg.addActionListener(this);
        add(buttAgg);
        
        buttUltima = new JButton("Última Reparación");
        buttUltima.addActionListener(this);
        add(buttUltima);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == buttAgg)
        {
            boolean search = main.getGarage().buscarCoche(txtMatricula.getText());
            if(search == true)
            {
                Reparacion reparacion = new Reparacion(txtDescripcion.getText(), Integer.parseInt(txtKm.getText()));
                main.getGarage().getCoche(txtMatricula.getText()).addReparacion(reparacion);
                txtDescripcion.setText("");
                txtKm.setText("");
                txtMatricula.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Coche no Existente","¡Atención!",JOptionPane.WARNING_MESSAGE);
                txtDescripcion.setText("");
                txtKm.setText("");
                txtMatricula.setText("");
            }
        }
        
        if(e.getSource() == buttUltima)
        {
            if(main.getGarage().getCoches().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "No Hay Automóviles Agregados","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(txtMatricula.getText().length()>4)
            {
                JOptionPane.showMessageDialog(null,"Última Reparación: "+main.getGarage().getCoche(txtMatricula.getText()).getUltimaReparacion().getDescripcion()+
                        "\nKilometraje: "+main.getGarage().getCoche(txtMatricula.getText()).getUltimaReparacion().getKm());
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Matrícula de Automóvil Necesario","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}