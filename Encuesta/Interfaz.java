import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.*;

public class Interfaz extends JFrame
{
    PanelOpinion panelOpinion;
    PanelResultados panelResultados;
    JLabel etiqueta;
    public Interfaz()
    {
        setSize(570, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setTitle("Encuesta 1.0");
        setLayout(new BorderLayout());
        
        etiqueta = new JLabel("¿Cuál es su opinión sobre este curso? calificar de 0 a 10");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("main", Font.BOLD, 13));
        TitledBorder border = BorderFactory.createTitledBorder("");
        border.setTitleColor(Color.BLUE);
        etiqueta.setBorder(border);
        add(etiqueta, BorderLayout.NORTH);
        
        panelOpinion = new PanelOpinion();
        add(panelOpinion,BorderLayout.CENTER);
        
        panelResultados = new PanelResultados();
        add(panelResultados,BorderLayout.SOUTH);
        
    }
    
    public static void main(String[] args) 
    {
        Interfaz it = new Interfaz();
    }
}