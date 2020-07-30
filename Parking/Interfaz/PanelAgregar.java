package Interfaz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import main.*;

public class PanelAgregar extends JPanel implements ActionListener
{
    JTextField txtMatricula, txtDueño;
    JButton buttAgregar, buttSalida;
    FrameMain main;
    public  PanelAgregar(FrameMain main)
    {
        super();
        this.main = main;
        setLayout(new GridLayout(3, 2));
        TitledBorder border = BorderFactory.createTitledBorder("Manager Autos");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        txtMatricula = new JTextField();
        add(new JLabel("Matrícula: "));
        add(txtMatricula);
        txtDueño = new JTextField();
        add(new JLabel("Dueño: "));
        add(txtDueño);
        
        buttSalida = new JButton("Dar Salida");
        buttSalida.addActionListener(this);
        add(buttSalida);
        
        buttAgregar = new JButton("Agregar");
        buttAgregar.addActionListener(this);
        add(buttAgregar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == buttAgregar)
        {
            if(txtMatricula.getText().length()>5 && txtDueño.getText().length()>4)
            {
                Coche coche = new Coche(txtMatricula.getText().toUpperCase(), txtDueño.getText());
                main.getGarage().addCoche(coche);
                txtDueño.setText("");
                txtMatricula.setText("");
            }
            else if(txtMatricula.getText().length()<5)
            {
                JOptionPane.showMessageDialog(null, "Matrícula No Válida","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Digite un Nombre y un Apellido","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(e.getSource() == buttSalida)
        {
            if(txtMatricula.getText().length()>5 && txtDueño.getText().length()>4)
            {
                if(main.getGarage().buscarCoche(txtMatricula.getText()))
                {
                    Coche coche = new Coche(txtMatricula.getText().toUpperCase(), txtDueño.getText());
                    main.getGarage().darSalida(coche);
                    txtDueño.setText("");
                    txtMatricula.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Coche no Existente","¡Atención!",JOptionPane.WARNING_MESSAGE);
                }
            }
            else if(txtMatricula.getText().length()<5)
            {
                JOptionPane.showMessageDialog(null, "Matrícula No Válida","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Digite un Nombre y un Apellido","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}