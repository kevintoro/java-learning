import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.ArrayList;
import java.util.Iterator;

public class PanelOpinion extends JPanel implements ActionListener
{
    private final JLabel labRangoEdad;
    private final JLabel labEstadoCivil;
    private final JLabel labAgregarOpinion;
    private final JLabel labEtPpal;
    private final JComboBox cbRangoEdad;
    private final JComboBox cbEstadoCivil;
    private final JTextField txtOpinion;
    private final JButton butOpinion;
    
    private final ArrayList <Usuario> encuestados;
    
    private double suma = 0;
    private int cant = 0;
    
    private final Interfaz principal;
    
    public PanelOpinion(Interfaz cll)
    {
        principal = cll;
        encuestados = new ArrayList<>();
        
        setLayout(null);
        TitledBorder border = BorderFactory.createTitledBorder("AGREGAR OPINION A ENCUESTA");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        setBackground(Color.WHITE);
        
        labEtPpal = new JLabel("¿Cuál es su opinión sobre este curso? calificar de 0 a 10");
        labEtPpal.setBounds(20, 20, 550, 25);
        labEtPpal.setFont(new Font("Principal",Font.TYPE1_FONT,14));
        labEtPpal.setHorizontalAlignment(SwingConstants.CENTER);
        labEtPpal.setOpaque(true);
        Color color = new Color(163,237,255);
        labEtPpal.setBackground(color);
        Border border2 = BorderFactory.createLineBorder(Color.BLACK);
        labEtPpal.setBorder(border2);
        
        labRangoEdad = new JLabel("Rango de Edad:");
        labRangoEdad.setBounds(20, 80, 90, 25);
        
        labEstadoCivil = new JLabel("Estado Civíl:");
        labEstadoCivil.setBounds(215, 80, 90, 25);
        
        labAgregarOpinion = new JLabel("Opinión:");
        labAgregarOpinion.setBounds(400,80, 100, 25);
        
        cbRangoEdad = new JComboBox();
        cbRangoEdad.addItem("");
        cbRangoEdad.addItem("0-18 años");
        cbRangoEdad.addItem("18-55 años");
        cbRangoEdad.addItem("mas de 55");
        cbRangoEdad.setBounds(115,80,90,25);
        
        cbEstadoCivil = new JComboBox();
        cbEstadoCivil.addItem("");
        cbEstadoCivil.addItem("Soltero(a)");
        cbEstadoCivil.addItem("Casado(a)");
        cbEstadoCivil.setBounds(290,80,90,25);
        
        txtOpinion = new JTextField("");
        txtOpinion.setBounds(460,80,90,25);
        
        butOpinion = new JButton("Agregar Opinión");
        butOpinion.setBounds(210,130,170,25);
        butOpinion.addActionListener(this);
        
        add(labEtPpal);
        add(labRangoEdad);
        add(cbRangoEdad);
        add(labEstadoCivil);
        add(cbEstadoCivil);
        add(labAgregarOpinion);
        add(txtOpinion);
        add(butOpinion);
    }
    
    public double getPromedio()
    {
        return suma/cant;
    }
    
    public int getCantidadEncuestados()
    {
        return cant;
    }
    
    public void limpiarPO()
    {
        cbEstadoCivil.setSelectedIndex(0);
        txtOpinion.setText("");
        cbRangoEdad.setSelectedIndex(0);
    }
    
    public void consulta(String estadoC, int rangoEd)
    {
        int cont = 0, aux = 0, into=0;
        Iterator it = encuestados.iterator();
        if(it.hasNext() == true)
        {
            for(Usuario user: encuestados)
            {
                if(user.getEdad()==rangoEd && user.getEstadoCivil().equals(estadoC))
                {
                    cont++;
                    aux+=user.getOpinion();
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Datos de Encuesta vacíos","¡Atención!",JOptionPane.WARNING_MESSAGE);
            into = 1;
        }
        
        if(cont>0)
        {
            JOptionPane.showMessageDialog(null, "Cantidad De Personas con Dichas Características: \n"+cont+"\nPromedio: \n"+aux);
        }
        else if(into == 0)
        {
            JOptionPane.showMessageDialog(null,"No Se Han Agregado Datos en Dicho Promedio","¡Empty!",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent event) 
    {
        if(event.getSource() == butOpinion)
        {
            if(cbRangoEdad.getSelectedIndex() == 0 || cbEstadoCivil.getSelectedIndex() == 0 || txtOpinion == null)
            {
                JOptionPane.showMessageDialog(null,"Llene los requisitos Necesarios","¡Warning!",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                if(cbEstadoCivil.getSelectedIndex() == 1)
                {
                    try
                    {
                        int aux = Integer.parseInt(txtOpinion.getText());
                        if(aux>0 && aux<11)
                        {
                            cant++;
                            String ec = "Soltero";
                            Usuario user = new Usuario(ec, cbRangoEdad.getSelectedIndex(), aux);
                            encuestados.add(user);
                            suma+=aux;
                            principal.setPromPR();
                            principal.setCantidadEncuestadosPR();
                            limpiarPO();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Digite Sólo Un Valor Entre 1 - 10","¡Warning!",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    catch(NumberFormatException | HeadlessException e)
                    {
                        String error = e.getMessage();
                        JOptionPane.showMessageDialog(null,error,"¡Warning!",JOptionPane.WARNING_MESSAGE);
                    }
                    
                }
                else
                {
                    try
                    {
                        int aux = Integer.parseInt(txtOpinion.getText());
                        if(aux>0 && aux<11)
                        {
                            cant++;
                            String ec = "Casado";
                            Usuario user = new Usuario(ec, cbRangoEdad.getSelectedIndex(), aux);
                            encuestados.add(user);
                            suma+=aux;
                            principal.setPromPR();
                            principal.setCantidadEncuestadosPR();
                            limpiarPO();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Digite Sólo Un Valor Entre 1 - 10","¡Warning!",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    catch(NumberFormatException | HeadlessException e)
                    {
                        String error = e.getMessage();
                        JOptionPane.showMessageDialog(null,error,"¡Warning!",JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        }
    }
}