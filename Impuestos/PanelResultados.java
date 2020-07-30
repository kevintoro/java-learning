import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*;

public class PanelResultados extends JPanel implements ActionListener
{
    JLabel labTotal;
    JTextField txtTotal;
    JButton butLimpiar;
    JButton butCalcular;
    
    public final static String LIMPIAR = "Limpiar";
    public final static String CALCULAR = "Calcular";
    
    public PanelResultados()
    {
        setLayout(new GridLayout(2, 3));
        setPreferredSize(new Dimension(0,65));
        
        TitledBorder border = BorderFactory.createTitledBorder("Resultados");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        labTotal = new JLabel("Total a Pagar: ");
        txtTotal = new JTextField("$0 ");
        butLimpiar = new JButton("Limpiar");
        butCalcular = new JButton("Calcular");
        
        txtTotal.setEditable(false);
        txtTotal.setForeground(Color.BLUE);
        txtTotal.setBackground(Color.white);
        
        add(new JLabel(""));
        add(new JLabel(""));
        add(butCalcular);
        add(labTotal);
        add(txtTotal);
        add(butLimpiar);
        
        butCalcular.setActionCommand(CALCULAR);
        butLimpiar.setActionCommand(LIMPIAR);
        
        butCalcular.addActionListener(this);
        butLimpiar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent event)
    {
        String comando = event.getActionCommand();
        if(comando.equals(CALCULAR))
        {
            JOptionPane.showMessageDialog(null, "Hola Mundo");
        }
        else if(comando.equals(LIMPIAR))
        {
            JOptionPane.showMessageDialog(null, "Hola Mundo x2");
        }    
    }
}