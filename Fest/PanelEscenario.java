import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class PanelEscenario extends JPanel implements ActionListener
{
    JButton st1, st2, st3, st4, st5, imp;
    Escenario esc1, esc2, esc3, esc4, esc5;
    AuxEsc auxEsc1, auxEsc2, auxEsc3, auxEsc4, auxEsc5;
    Main main;
    
    public PanelEscenario(Main cll)
    {
        main = cll;
        setLayout(new GridLayout(3, 2));
        Border border = BorderFactory.createTitledBorder("Configurar Escenarios");
        setBorder(border);
        
        esc1 = new Escenario(0, "");
        esc2 = new Escenario(0, "");
        esc3 = new Escenario(0, "");
        esc4 = new Escenario(0, "");
        esc5 = new Escenario(0, "");
        
        auxEsc1 = new AuxEsc();
        auxEsc2 = new AuxEsc();
        auxEsc3 = new AuxEsc();
        auxEsc4 = new AuxEsc();
        auxEsc5 = new AuxEsc();
        
        st1 = new JButton("Escenario 1");
        st1.addActionListener(this);
        st2 = new JButton("Escenario 2");
        st2.addActionListener(this);
        st3 = new JButton("Escenario 3");
        st3.addActionListener(this);
        st4 = new JButton("Escenario 4");
        st4.addActionListener(this);
        st5 = new JButton("Escenario 5");
        st5.addActionListener(this);
        
        add(st1);
        add(st2);
        add(st3);
        add(st4);
        add(st5);
    }
    public void delEscenario(int opcion)
    {
        if(opcion == 1)
        {
            esc1.setPresupuesto(0);
            esc1.setPatrocinador("");
            esc1.bandas.clear();
            auxEsc1.actPrim(true);
            auxEsc1.actSec(false);
        }
        
        if(opcion == 2)
        {
            esc2.setPresupuesto(0);
            esc2.setPatrocinador("");
            esc2.bandas.clear();
            auxEsc2.actPrim(true);
            auxEsc2.actSec(false);
        }
        
        if(opcion == 3)
        {
            esc3.setPresupuesto(0);
            esc3.setPatrocinador("");
            esc3.bandas.clear();
            auxEsc3.actPrim(true);
            auxEsc3.actSec(false);
        }
        
        if(opcion == 4)
        {
            esc4.setPresupuesto(0);
            esc4.setPatrocinador("");
            esc4.bandas.clear();
            auxEsc4.actPrim(true);
            auxEsc4.actSec(false);
        }
        
        if(opcion == 5)
        {
            esc5.setPresupuesto(0);
            esc5.setPatrocinador("");
            esc5.bandas.clear();
            auxEsc5.actPrim(true);
            auxEsc5.actSec(false);
        }
    }
    
    public Escenario getEscenario(int opcion)
    {
        if(opcion == 1)
        {
            return esc1;
        }
        
        if(opcion == 2)
        {
            return esc2;
        }
        
        if(opcion == 3)
        {
            return esc3;
        }
        
        if(opcion == 4)
        {
            return esc4;
        }
        
        if(opcion == 5)
        {
            return esc5;
        }
        
        return null;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == st1)
        {
            auxEsc1.setCampos(String.valueOf(esc1.getPresupuesto()),esc1.getPatrocinador());
            auxEsc1.setVisible(true);
            esc1 = auxEsc1.getEscenario();
        }
        
        if(e.getSource() == st2)
        {
            auxEsc2.setCampos(String.valueOf(esc2.getPresupuesto()),esc2.getPatrocinador());
            auxEsc2.setVisible(true);
            esc2 = auxEsc2.getEscenario();
        }
        
        if(e.getSource() == st3)
        {
            auxEsc3.setCampos(String.valueOf(esc3.getPresupuesto()),esc3.getPatrocinador());
            auxEsc3.setVisible(true);
            esc3 = auxEsc3.getEscenario();
        }
        
        if(e.getSource() == st4)
        {
            auxEsc4.setCampos(String.valueOf(esc4.getPresupuesto()),esc4.getPatrocinador());
            auxEsc4.setVisible(true);
            esc4 = auxEsc4.getEscenario();
        }
        
        if(e.getSource() == st5)
        {
            auxEsc5.setCampos(String.valueOf(esc5.getPresupuesto()),esc5.getPatrocinador());
            auxEsc5.setVisible(true);
            esc5 = auxEsc5.getEscenario();
        }
    }
}