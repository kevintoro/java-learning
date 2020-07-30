import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;
public class PanelCaracteristicas extends JPanel
{
    JCheckBox cbCocinar, cbViajar, cbEmprendedor;
    public PanelCaracteristicas( )
    {
        setSize(200,200);
        setVisible(true);
        setLayout(new GridLayout(2, 2));
        TitledBorder border = BorderFactory.createTitledBorder("Características");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        cbCocinar = new JCheckBox("Cocinar");
        cbViajar = new JCheckBox("Viajar");
        cbEmprendedor = new JCheckBox("Emprendedor");
        
        add(cbCocinar);
        add(cbViajar);
        add(cbEmprendedor);
    }
    
    public boolean isCocinar()
    {
        return cbCocinar.isSelected();
    }
    
    public boolean isViajar()
    {
        return cbViajar.isSelected();
    }
    
    public boolean isEmprendedor()
    {
        return cbEmprendedor.isSelected();
    }
    
    public void limpiar()
    {
        cbCocinar.setSelected(false);
        cbViajar.setSelected(false);
        cbEmprendedor.setSelected(false);
    }
    
    public int getQuantitySelected()
    {
        int i = 0;
        
        if(isCocinar() == true)
        {
            i++;
        }
        
        if(isViajar() == true)
        {
            i++;
        }
        
        if(isEmprendedor() == true)
        {
            i++;
        }
        return i;
    }
    
    public void setUseless()
    {
        cbCocinar.setEnabled(false);
        cbViajar.setEnabled(false);
        cbEmprendedor.setEnabled(false);
    }
    
    public void setDefaultPanel()
    {
        cbCocinar.setEnabled(true);
        cbViajar.setEnabled(true);
        cbEmprendedor.setEnabled(true);
    }
}