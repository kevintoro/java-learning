import javax.swing.*;
import java.awt.*;

public class Main extends JFrame
{
    PanelFestival pFestival;
    PanelEscenario pEscenario;
    Escenario st1, st2, st3, st4, st5;
    
    public Main()
    {
        setSize(400, 300);
        setTitle("Festival Motilon");
        setLayout(new GridLayout(2,1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
        pFestival = new PanelFestival(this);
        add(pFestival);
        
        pEscenario = new PanelEscenario(this);
        add(pEscenario);
    }
    
    public void aggEscenario(int op)
    {
        if(op == 1)
        {
            st1 = pEscenario.getEscenario(op);
        }
        
        if(op == 2)
        {
            st2 = pEscenario.getEscenario(op);
        }
        
        if(op == 3)
        {
            st3 = pEscenario.getEscenario(op);
        }
        
        if(op == 4)
        {
            st4 = pEscenario.getEscenario(op);
        }
        
        if(op == 5)
        {
            st5 = pEscenario.getEscenario(op);
        }
    }
    
    public Escenario getEscenario(int op)
    {
        if(op == 1)
        {
            return st1;
        }
        
        if(op == 2)
        {
            return st2;
        }
        
        if(op == 3)
        {
            return st3;
        }
        
        if(op == 4)
        {
            return st4;
        }
        
        if(op == 5)
        {
            return st5;
        }
        
        return null;
    }
    
    public void delEscenario(int op)
    {
        pEscenario.delEscenario(op);
    }
    
    public static void main(String[]args)
    {
        Main exe = new Main();
    }
}