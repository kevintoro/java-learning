import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class PanelConsulta extends JPanel implements ActionListener
{
    JLabel labPalabra, labTraduccion;
    JTextField txtPalabra, txtTraduccion;
    JButton butIngles, butFrances;
    
    Interfaz principal;
    
    public PanelConsulta(Interfaz cll)
    {
        principal = cll;
        
        setLayout(new GridLayout(2, 3));
        TitledBorder border = BorderFactory.createTitledBorder("Consultas");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        labPalabra = new JLabel("Palabra: ");
        labTraduccion = new JLabel("Traduccion: ");
        
        txtPalabra = new JTextField("");
        txtTraduccion = new JTextField("");
        txtTraduccion.setEditable(false);
        
        butIngles = new JButton("En Inglés");
        butIngles.addActionListener(this);
        butFrances = new JButton("En Francés");
        butFrances.addActionListener(this);
        
        add(labPalabra);
        add(txtPalabra);
        add(butIngles);
        add(labTraduccion);
        add(txtTraduccion);
        add(butFrances);
        
    }
    
    public void limpiar()
    {
        txtPalabra.setText("");
        txtTraduccion.setText("");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==butIngles)
        {
            int aux = 1;
            if(principal.buscarTraduccionDe(txtPalabra.getText(), aux) == null)
            {
                JOptionPane.showMessageDialog(null, "No Se Tiene La Traducción Para Esa Palabra", "Error En La Consulta", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                txtTraduccion.setText(principal.buscarTraduccionDe(txtPalabra.getText(), aux).darTraduccion());
            }
        }
        
        if(e.getSource() == butFrances)
        {
            int aux = 2;
            
            if(principal.buscarTraduccionDe(txtPalabra.getText(), aux) == null)
            {
                JOptionPane.showMessageDialog(null, "No Se Tiene La Traducción Para Esa Palabra", "Error En La Consulta", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                txtTraduccion.setText(principal.buscarTraduccionDe(txtPalabra.getText(), aux).darTraduccion());
            }
        }
    }
}