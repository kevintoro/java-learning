import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Escenario
{
    ArrayList <Banda> bandas;
    private String patrocinador;
    private long presupuesto;
    private static int LIMITE = 10;
    
    public Escenario(int presupuesto, String patrocinador)
    {
        bandas = new ArrayList<>();
        this.patrocinador = patrocinador;
        this.presupuesto = presupuesto;
    }
    
    public long getPresupuesto()
    {
        return presupuesto;
    }
    
    public int getTamaño()
    {
        return bandas.size();
    }
    
    public void setPresupuesto(long presupuesto)
    {
        this.presupuesto = presupuesto;
    }
    
    public void setPatrocinador(String patrocinador)
    {
        this.patrocinador = patrocinador;
    }
    
    public String getPatrocinador()
    {
        return patrocinador;
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
    
    public void getListaBandas()
    {
        int x = 1;
        System.out.println("----- Bandas En Escenario -----\n");
        for(Banda banda: bandas)
        {
            System.out.println(x+". "+banda.getNombre()+"\n-------------------------------");
            x++;
        }
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
        ArrayList <Long> fans = new ArrayList<>();
        
        for(Banda banda: bandas)
        {
            fans.add(banda.getNumFans());
        }
        
        Collections.sort(fans);
        
        int x = 1;
        for(long fan: fans)
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
    
    public void ordenarPorCanciones()
    {
        ArrayList <Integer> song = new ArrayList<>();
        
        for(Banda banda: bandas)
        {
            song.add(banda.getNumCanciones());
        }
        
        Collections.sort(song);
        
        int x = 1;
        for(long fan: song)
        {
            for(Banda banda: bandas)
            {
                if(fan == banda.getNumCanciones())
                {
                    System.out.println(x+". "+banda.getNombre()+": "+banda.getNumCanciones());
                    x++;
                }
            }
        }
    }
    
    public void eliminarBanda(String eliminar)
    {
        Banda elimBanda = new Banda("", 0, 0, 0);
        for(Banda banda: bandas)
        {
            if(banda.getNombre().equalsIgnoreCase(eliminar))
            {
                elimBanda = banda;
            }
        }
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
            JOptionPane.showMessageDialog(null, "Banda no Existente en Escenario","¡Atención!",JOptionPane.ERROR_MESSAGE);
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
}