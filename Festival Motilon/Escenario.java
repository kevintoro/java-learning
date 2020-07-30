import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;
public class Escenario
{
    ArrayList <Banda> bandas;
    private String patrocinador;
    private int presupuesto;
    private static int LIMITE = 10;
    
    public Escenario(int presupuesto, String patrocinador)
    {
        bandas = new ArrayList<>();
        this.patrocinador = patrocinador;
        this.presupuesto = presupuesto;
    }
    
    public int getPresupuesto()
    {
        return presupuesto;
    }
    
    public String getPatrocinador()
    {
        return patrocinador;
    }
    
    public void setPatrocinador(String patrocinador)
    {
        this.patrocinador = patrocinador;
    }
    
    public void agregBanda(Banda nBanda)
    {
        int aux = 0;
        for(Banda banda: bandas)
        {   
            if(banda == nBanda)
            {
                aux++;
            }
        }
        
        if(aux == 0)
        {
            if(bandas.size()<LIMITE)
            { 
                if(getPresupuesto() >= nBanda.getCosto())
                {
                    bandas.add(nBanda);
                    presupuesto -=nBanda.getCosto();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Presupuesto Insuficiente","¡Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Limite de Bandas Alcanzado","¡Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Banda Ya Existente en Escenario","¡Atención!",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void getBandas()
    {
        int x = 1;
        for(Banda banda: bandas)
        {
            System.out.println(x+". "+banda.getNombre()+"\n-------------------------------");
            x++;
        }
    }
    
    public void eliminarBanda(Banda elimBanda)
    {
        int x = 0;
        for(Banda banda: bandas)
        {
            if(banda == elimBanda)
            {
                x++;
            }
        }
        
        if(x>0)
        {
            bandas.remove(elimBanda);
            presupuesto+=elimBanda.getCosto();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Banda no Existente en Escenario","¡Error!",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Banda buscarNombre(String nombreBanda)
    {
        for(Banda banda: bandas)
        {
            if(banda.getNombre().equals(nombreBanda))
            {
                return banda;
            }
        }
        return null;
    }
    
    public void ordenarPorNombre()
    {
        ArrayList <String> nombres = new ArrayList<>();
        for(Banda banda: bandas)
        {
            nombres.add(banda.getNombre());
        }
        
        Collections.sort(nombres);
        
        int x = 1;
        for(String nombre: nombres)
        {
            System.out.println(x+". "+nombre+"\n-------------------------------");
            x++;
        }
    }
    
    public void ordenarPorFans()
    {
        ArrayList <Integer> fans = new ArrayList<>();
        
        for(Banda banda: bandas)
        {
            fans.add(banda.getNumFans());
        }
        
        Collections.sort(fans);
        
        int x = 1;
        for(int fan: fans)
        {
            for(Banda banda: bandas)
            {
                if(fan == banda.getNumFans())
                {
                    System.out.println(x+". "+banda.getNombre()+": "+banda.getNumFans());
                    x++;
                }
            }
        }
    }
}
