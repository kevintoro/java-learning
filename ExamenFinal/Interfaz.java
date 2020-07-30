import java.awt.BorderLayout;
import javax.swing.*;

public class Interfaz extends JFrame
{
    PanelConsulta panelConsulta;
    PanelDiccionarios panelDiccionarios;
    PanelAdicion panelAdicion;
    
    Traductor traductor;
    
    public Interfaz()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Traductor");
        setSize(500, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        panelConsulta = new PanelConsulta(this);
        panelDiccionarios = new PanelDiccionarios(this);
        panelAdicion = new PanelAdicion(this);
        
        add(panelConsulta,BorderLayout.NORTH);
        add(panelDiccionarios,BorderLayout.CENTER);
        add(panelAdicion,BorderLayout.SOUTH);
        
        traductor = new Traductor();
    }
    
    public void agregarPalabra(String pal, String trad, int idioma)
    {
        traductor.agregarTraduccion(pal, trad, idioma);
    }
    
    public int darTamanio(int idioma)
    {
        return traductor.darTamanioDirectorio(idioma);
    }
    
    public Traduccion buscarTraduccionDe(String pal, int idioma)
    {
        return traductor.buscarTraduccionDe(pal, idioma);
    }
    
    public void actualizarContadores()
    {
        panelDiccionarios.actualizar();
    }
    
    public static void main(String[]args)
    {
        Interfaz cll = new Interfaz();
    }
}