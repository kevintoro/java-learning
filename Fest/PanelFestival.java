import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;

public class PanelFestival extends JPanel implements ActionListener
{
    JButton aggEsc, elimEsc, impDetalles;
    PanelEscenario pEscenario;
    Festival festival;
    Main main;
    
    public PanelFestival(Main cll)
    {
        main = cll;
        setLayout(new GridLayout(2,2));
        Border border = BorderFactory.createTitledBorder("Configurar Festival");
        setBorder(border);
        
        aggEsc = new JButton("Agregar Escenario");
        aggEsc.addActionListener(this);
        
        elimEsc = new JButton("Eliminar Escenario");
        elimEsc.addActionListener(this);
        elimEsc.setEnabled(false);
        
        impDetalles =  new JButton("Detalles de Escenarios");
        impDetalles.addActionListener(this);
        impDetalles.setEnabled(false);
        
        add(aggEsc);
        add(elimEsc);
        add(impDetalles);
        
        festival = new Festival();
        pEscenario = new PanelEscenario(main);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == aggEsc)
        {
            int op = Integer.parseInt(JOptionPane.showInputDialog("Número de Escenario a Agregar (1 - 5): "));
            
            while(op<0)
            {
                JOptionPane.showMessageDialog(null, "Opción Inválida","Error",JOptionPane.ERROR_MESSAGE);
            }
            main.aggEscenario(op);
            if(main.getEscenario(op).getPresupuesto()>0)
            {
                festival.aggEscenario(main.getEscenario(op));
                elimEsc.setEnabled(true);
                impDetalles.setEnabled(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Configure el Escenario Primero","Error",JOptionPane.ERROR_MESSAGE);
                main.delEscenario(op);
            }
        }
        
        if(e.getSource() == impDetalles)
        {
            festival.imprEscenarios();
        }
        
        if(e.getSource() == elimEsc)
        {
            int op = Integer.parseInt(JOptionPane.showInputDialog("Número de Escenario a Eliminar (1 - 5): "));
            while(op<1 || op>5)
            {
                JOptionPane.showMessageDialog(null, "Opción Inválida","Atención",JOptionPane.WARNING_MESSAGE);
                op = Integer.parseInt(JOptionPane.showInputDialog("Número de Escenario a Eliminar (1 - 5): "));
            }
            main.delEscenario(op);
            festival.borrarEscenario(main.getEscenario(op));
            
            if(festival.getTamaño()<1)
            {
                elimEsc.setEnabled(false);
                impDetalles.setEnabled(false);
            }
        }
    }
}