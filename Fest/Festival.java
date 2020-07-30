import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Festival
{
    private ArrayList <Escenario> stage;
    
    public Festival()
    {
        stage = new ArrayList<>();
    }
    
    public void aggEscenario(Escenario escenario)
    {
        int x = 0, y = 0;
        for(Escenario sc: stage)
        {
            if(sc == escenario)
            {
                x++;
            }
            else if(sc.getPatrocinador().equals(escenario.getPatrocinador()))
            {
                y++;
            }
        }
        
        if(x==0 && y == 0)
        {
            stage.add(escenario);
        }
        else if(y>0)
        {
            JOptionPane.showMessageDialog(null, "Patrocinador Ya Existente En Otro Escenario","Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Escenario Ya Existente","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void borrarEscenario(Escenario elimEsc)
    {
        stage.remove(elimEsc);
    }
    
    public void imprEscenarios()
    {
        int x = 1;
        for(Escenario sc: stage)
        {
            System.out.println(x+". Escenario: \nPatrocinador: "+sc.getPatrocinador()+"\nPresupuesto: "+sc.getPresupuesto()
                    +"\n------------------------");
            x++;
        }
    }
    
    public int getTamaño()
    {
        return stage.size();
    }
}