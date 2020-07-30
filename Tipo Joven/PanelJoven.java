import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class PanelJoven extends JPanel
{
    JLabel labNombre, labFechaNacimiento;
    JTextField txtNombre, txtFechaNacimiento;
    public PanelJoven()
    {
        setLayout(new GridLayout(3, 2));
        TitledBorder border = BorderFactory.createTitledBorder("Joven");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        labNombre = new JLabel("Nombre: ");
        labFechaNacimiento = new JLabel("Año de Nacimiento: ");
        txtNombre = new JTextField();
        txtFechaNacimiento = new JTextField();
        
        add(new JLabel(""));
        add(new JLabel(""));
        add(labNombre);
        add(txtNombre);
        add(labFechaNacimiento);
        add(txtFechaNacimiento);
    }
    
    public String getNombreUser()
    {
        return txtNombre.getText();
    }
    
    public String getFechaNacimiento()
    {
        return txtFechaNacimiento.getText();
    }
    
    public void setColorBackgroundText()
    {
        txtNombre.setBackground(Color.red);
        txtFechaNacimiento.setBackground(Color.red);
    }
    
    public void setDefaultBackgroundText()
    {
        txtNombre.setBackground(Color.WHITE);
        txtFechaNacimiento.setBackground(Color.WHITE);
    }
    
    public void setUseless()
    {
        txtNombre.setEditable(false);
        txtFechaNacimiento.setEditable(false);
    }
    
    public void setDefault()
    {
        txtNombre.setEditable(true);
        txtFechaNacimiento.setEditable(true);
    }
    
    public void limpiar()
    {
        txtNombre.setText("");
        txtFechaNacimiento.setText("");
    }
}