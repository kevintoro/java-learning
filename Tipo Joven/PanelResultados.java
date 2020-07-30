import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*;

public class PanelResultados extends JPanel implements ActionListener
{
    JLabel labGeneracion;
    JButton butCalcular, butNuevo;
    Interfaz principal;
    private final static int AÑO_MAXIMO = 2017;
    public PanelResultados(Interfaz cll)
    {
        principal = cll;
        
        setLayout(new GridLayout(2,2));
        TitledBorder border = BorderFactory.createTitledBorder("Resultados");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        labGeneracion = new JLabel("");
        butCalcular = new JButton("Calcular");
        butCalcular.addActionListener(this);
        butNuevo = new JButton("Nuevo");
        butNuevo.addActionListener(this);
        
        add(labGeneracion);
        add(butCalcular);
        add(new JLabel(""));
        add(butNuevo);
    }
    
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == butCalcular)
        {
            int x = 0;
            if(principal.getYearOfBirthPj().equals("") || principal.getNameUserPj().equals(""))
            {
                x++;
                principal.setColorBackgroundTextPj();
                int choise = JOptionPane.showConfirmDialog(null,"Please Fill The Text Boxes","¡Warning!",JOptionPane.OK_CANCEL_OPTION);
                if(choise == JOptionPane.OK_OPTION)
                {
                    principal.setDefaultBackgroundTextPj();
                }
                else
                {
                    principal.setUselessPj();
                    principal.setUselessPc();
                    butCalcular.setEnabled(false);
                }
            }
            else
            {
                if(principal.getQuantitySelectedPc()>1 && x == 0)
                {
                    JOptionPane.showMessageDialog(null,"Please Select Only 1 Feature","¡Warning!",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    if(principal.getQuantitySelectedPc() == 0 && x == 0)
                    {
                        JOptionPane.showMessageDialog(null,"Please Select One Feature","¡Warning!",JOptionPane.WARNING_MESSAGE);
                    }
                    else
                    {
                        if(principal.getYearOfBirthPj().length()>4)
                        {
                            JOptionPane.showMessageDialog(null,"Only 4 Numbers In Text Box <<Año de Nacimiento: >>","¡Warning!",JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {
                            int aux = Integer.parseInt(principal.getYearOfBirthPj());
                            
                            if(aux>1946 && aux<1965)
                            {
                                labGeneracion.setText(principal.getNameUserPj()+" Es Baby Boomer");
                            }
                            else
                            {
                                if(aux>1966 && aux<1984)
                                {
                                    labGeneracion.setText(principal.getNameUserPj()+" Es Generación X");
                                }
                                else
                                {
                                    if(aux>1985 && aux<2000)
                                    {
                                        labGeneracion.setText(principal.getNameUserPj()+" Es Generación Y");
                                    }
                                    else
                                    {
                                        if(aux>2001 && aux<=AÑO_MAXIMO)
                                        {
                                            labGeneracion.setText(principal.getNameUserPj()+" Es Generación Z");
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(null,"Year Out Of Range","¡Warning!",JOptionPane.WARNING_MESSAGE);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        if(event.getSource() == butNuevo)
        {
            principal.setDefaultBackgroundTextPj();
            principal.setDefaultPj();
            principal.setDefaultPc();
            butCalcular.setEnabled(true);
            principal.clearAll();
            labGeneracion.setText("");
        }
    }
}