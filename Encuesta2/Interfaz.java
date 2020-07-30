import java.awt.GridLayout;
import javax.swing.*;

public class Interfaz extends JFrame
{
    PanelOpinion panelOpinion;
    PanelResultados panelResultados;
    JLabel etiqueta;
    public Interfaz()
    {
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setTitle("Encuesta 1.0");
        setLayout(new GridLayout(2,1));
        
        panelOpinion = new PanelOpinion(this);
        add(panelOpinion);
        
        panelResultados = new PanelResultados(this);
        add(panelResultados);
    }
    
    public void setPromPR()
    {
        panelResultados.actualizarPromedio(panelOpinion.getPromedio());
    }
    
    public void setCantidadEncuestadosPR()
    {
        panelResultados.actualizarCantEncuestados(panelOpinion.getCantidadEncuestados());
    }
    
    public void consultar(String estadoC, int edad)
    {
        panelOpinion.consulta(estadoC, edad);
    }
    
    public static void main(String[] args) 
    {
        Interfaz it = new Interfaz();
    }
}