import java.awt.BorderLayout;
import javax.swing.*;
public class Interfaz extends JFrame
{
    PanelJoven paJoven;
    PanelCaracteristicas paCaracteristicas;
    PanelResultados paResultados;
    public Interfaz()
    {
        setSize(390, 300);
        setLayout(new BorderLayout());
        setTitle("Tipo Joven");
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        paJoven = new PanelJoven();
        add(paJoven,BorderLayout.NORTH);
        
        paCaracteristicas = new PanelCaracteristicas();
        add(paCaracteristicas,BorderLayout.CENTER);
        
        paResultados = new PanelResultados(this);
        add(paResultados,BorderLayout.SOUTH);
    }
    
    public int getQuantitySelectedPc()
    {
        return paCaracteristicas.getQuantitySelected();
    }
    
    public String getYearOfBirthPj()
    {
        return paJoven.getFechaNacimiento();
    }
    
    public String getNameUserPj()
    {
        return paJoven.getNombreUser();
    }
    
    public void setColorBackgroundTextPj()
    {
        paJoven.setColorBackgroundText();
    }
    
    public void setDefaultBackgroundTextPj()
    {
        paJoven.setDefaultBackgroundText();
    }
    
    public void setUselessPj()
    {
        paJoven.setUseless();
    }
    
    public void setDefaultPj()
    {
        paJoven.setDefault();
    }
    
    public void setUselessPc()
    {
        paCaracteristicas.setUseless();
    }
    
    public void setDefaultPc()
    {
        paCaracteristicas.setDefaultPanel();
    }
    
    public static void main(String[] args) 
    {
        Interfaz it = new Interfaz();
    }
    
    public void clearAll()
    {
        paJoven.limpiar();
        paCaracteristicas.limpiar();
    }
}