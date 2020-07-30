import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;

public class PanelOpinion extends JPanel implements ActionListener
{
    private final JLabel labRangoEdad;
    private final JLabel labEstadoCivil;
    private final JLabel labAgregarOpinion;
    private final JComboBox cbRangoEdad;
    private final JComboBox cbEstadoCivil;
    private final JComboBox cbOpinion;
    private final JButton butOpinion;
    
    public PanelOpinion()
    {
        setLayout(new GridLayout(2,6));
        TitledBorder border = BorderFactory.createTitledBorder("AGREGAR OPINION A ENCUESTA");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        labRangoEdad = new JLabel("Rango de Edad");
        labEstadoCivil = new JLabel("Estado Civíl");
        labAgregarOpinion = new JLabel("Opinión");
        
        cbRangoEdad = new JComboBox();
        cbRangoEdad.addItem("");
        cbRangoEdad.addItem("0-18 años");
        cbRangoEdad.addItem("18-55 años");
        cbRangoEdad.addItem("mas de 55");
        
        cbEstadoCivil = new JComboBox();
        cbEstadoCivil.addItem("");
        cbEstadoCivil.addItem("Soltero(a)");
        cbEstadoCivil.addItem("Casado(a)");
        
        cbOpinion = new JComboBox();
        cbOpinion.addItem("");
        cbOpinion.addItem("1");
        cbOpinion.addItem("2");
        cbOpinion.addItem("3");
        cbOpinion.addItem("4");
        cbOpinion.addItem("5");
        cbOpinion.addItem("6");
        cbOpinion.addItem("7");
        cbOpinion.addItem("8");
        cbOpinion.addItem("9");
        cbOpinion.addItem("10");
        
        butOpinion = new JButton("Opinión");
        butOpinion.addActionListener(this);
        
        add(labRangoEdad);
        add(cbRangoEdad);
        add(labEstadoCivil);
        add(cbEstadoCivil);
        add(labAgregarOpinion);
        add(cbOpinion);
        add(new JLabel(""));
        add(new JLabel(""));
        add(new JLabel(""));
        add(butOpinion);
        add(new JLabel(""));
        add(new JLabel(""));
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        
    }
}