import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Festival
{
    private ArrayList <Escenario> stage;
    private static final int LIMITE = 5;
    
    public Festival()
    {
        stage = new ArrayList<>();
    }
    
    public void aggEscenario(Escenario escenario)
    {
        int x = 0;
        for(Escenario sc: stage)
        {
            if(sc == escenario)
            {
                x++;
            }
        }
        
        if(stage.size()<LIMITE)
        {
            if(x==0)
            {
                stage.add(escenario);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Escenario Ya Existente","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Limite de Escenarios Alcanzado","¡Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void borrarEscenario(Escenario elimEsc)
    {
        stage.remove(elimEsc);
    }
    
    public String getEscenario(int op)
    {
        System.out.println(stage.size());
        String [] patr = new String [stage.size()];
        int x = 0;
        for(Escenario sc: stage)
        {
            patr[x] = sc.getPatrocinador();
            x++;
        }
        
        return patr[op-1];
    }
}
