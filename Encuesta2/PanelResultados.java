import java.awt.Color;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class PanelResultados extends JPanel implements ActionListener
{
    JLabel labPromedio, labTotalProm, labEncuestados, labNumEncuestados, labRanEdad, labEstadoCivil;
    JComboBox combEdad, combEstadoCivil;
    JButton butBusqueda;
    Interfaz principal;
    
    public PanelResultados(Interfaz cll)
    {
        principal = cll;
        
        setLayout(null);
        TitledBorder border = BorderFactory.createTitledBorder("RESULTADOS");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        setBackground(Color.WHITE);
        
        labPromedio = new JLabel("Promedio Encuesta: ");
        labPromedio.setBounds(100, 30, 150, 25);
        
        labTotalProm = new JLabel("0");
        labTotalProm.setBounds(220, 30, 80, 25);
        
        labEncuestados = new JLabel("Total Encuestados: ");
        labEncuestados.setBounds(300, 30, 150, 25);
        
        labNumEncuestados = new JLabel("0");
        labNumEncuestados.setBounds(420, 30, 90, 25);
        
        labRanEdad = new JLabel("Rango Edad:");
        labRanEdad.setBounds(20, 80, 90, 25);
        
        labEstadoCivil = new JLabel("Estado Civil:");
        labEstadoCivil.setBounds(215, 80, 90, 25);
        
        combEdad = new JComboBox();
        combEdad.addItem("");
        combEdad.addItem("0-18 años");
        combEdad.addItem("18-55 años");
        combEdad.addItem("mas de 55");
        combEdad.setBounds(115,80,90,25);
        
        combEstadoCivil = new JComboBox();
        combEstadoCivil.addItem("");
        combEstadoCivil.addItem("Soltero(a)");
        combEstadoCivil.addItem("Casado(a)");
        combEstadoCivil.setBounds(290,80,90,25);
        
        butBusqueda = new JButton("Consultar");
        butBusqueda.setBounds(440,80,120,25);
        butBusqueda.addActionListener(this);
        
        add(labPromedio);
        add(labTotalProm);
        add(labEncuestados);
        add(labNumEncuestados);
        add(labRanEdad);
        add(combEdad);
        add(labEstadoCivil);
        add(combEstadoCivil);
        add(butBusqueda);
    }
    
    public void actualizarPromedio(double prom)
    {
        labTotalProm.setText(String.valueOf(prom));
    }
    
    public void actualizarCantEncuestados(int x)
    {
        labNumEncuestados.setText(String.valueOf(x));
    }
    
    public void limpiarPR()
    {
        combEstadoCivil.setSelectedIndex(0);
        combEdad.setSelectedIndex(0);
    }
    
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == butBusqueda)
        {
            if(event.getSource() == butBusqueda)
        {
            if(combEdad.getSelectedIndex()==0 || combEstadoCivil.getSelectedIndex()==0)
            {
                JOptionPane.showMessageDialog(null, "Llene Los Requisitos Para Proceder","¡Warning!",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                if(combEstadoCivil.getSelectedIndex() == 1)
                {
                    String ec = "Soltero";
                    principal.consultar(ec, combEdad.getSelectedIndex());
                    combEdad.setSelectedIndex(0);
                    combEstadoCivil.setSelectedIndex(0);
                }
                else
                {
                    String ec = "Casado";
                    principal.consultar(ec, combEdad.getSelectedIndex());
                    combEdad.setSelectedIndex(0);
                    combEstadoCivil.setSelectedIndex(0);
                }
            }
        }
        }
    }
}