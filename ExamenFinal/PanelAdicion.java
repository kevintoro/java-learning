import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class PanelAdicion extends JPanel implements ActionListener
{   
    JLabel labEspañol, labIngles,labFrances;
    JTextField txtEspañol, txtIngles, txtFrances;
    JButton butIngles, butFrances;
    
    Interfaz principal;
    
    public PanelAdicion(Interfaz cll)
    {
        principal = cll;
        
        setLayout(new GridLayout(3, 3));
        TitledBorder border = BorderFactory.createTitledBorder("Adiciones");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        labEspañol = new JLabel("En Español");
        labIngles = new JLabel("En Inglés");
        labFrances = new JLabel("En Francés");
        
        txtEspañol = new JTextField();
        txtIngles = new JTextField();
        txtFrances = new JTextField();
        
        butIngles = new JButton("Adicionar");
        butIngles.addActionListener(this);
        butFrances = new JButton("Adicionar");
        butFrances.addActionListener(this);
        
        add(labEspañol);
        add(txtEspañol);
        add(new JLabel(""));
        add(labIngles);
        add(txtIngles);
        add(butIngles);
        add(labFrances);
        add(txtFrances);
        add(butFrances);
    }
    
    public void limpiar()
    {
        txtEspañol.setText("");
        txtIngles.setText("");
        txtFrances.setText("");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == butIngles)
        {
            principal.agregarPalabra(txtEspañol.getText(), txtIngles.getText(), 1);
            JOptionPane.showMessageDialog(null, "Se Adicionó con éxito el resultado","Resultado",JOptionPane.INFORMATION_MESSAGE);
            principal.actualizarContadores();
            limpiar();
        }
        
        if(e.getSource() == butFrances)
        {
            principal.agregarPalabra(txtEspañol.getText(), txtFrances.getText(), 2);
            JOptionPane.showMessageDialog(null, "Se Adicionó con éxito el resultado","Resultado",JOptionPane.INFORMATION_MESSAGE);
            principal.actualizarContadores();
            limpiar();
        }
    }
}