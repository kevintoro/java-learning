import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;

public final class Ventana extends JFrame implements ActionListener
{
    private Alcancia alcancia;
    
    JPanel contentpane;//
    JLabel iconAc;//
    JLabel iconMt;//
    
    JLabel contVeinte;//
    JLabel contCincuenta;
    JLabel contCien;//
    JLabel contDoscientos;//
    JLabel contQuinientos;//
    JLabel mostrarTotal;//
    JLabel mostrarAgg;//
    JLabel monedas;
    
    JButton agregarMoneda;//
    JButton romperAlcancia;
    
    ButtonGroup valueMonedas;//
    JRadioButton veinte;//
    JRadioButton cincuenta;//
    JRadioButton cien;//
    JRadioButton doscientos;//
    JRadioButton quinientos;//
    
    Icon icono;
    Image image;
    ImageIcon imageIcon;
    public Ventana()
    {
        image = getIconImage();
        setBounds(0,0,750,650);
        setLocationRelativeTo(null);
        setTitle("Alcancia");
        setIconImage(image);
        setResizable(false);
        
        
        contentpane = new JPanel();
        contentpane.setLayout(null);
        contentpane.setBackground(Color.black);
        add(contentpane);
        
        agregarMoneda = new JButton();
        agregarMoneda.setBounds(520,85,150,25);
        agregarMoneda.setText("Agregar Moneda");
        agregarMoneda.addActionListener(this);
        contentpane.add(agregarMoneda);
        
        iconAc = new JLabel();
        iconAc.setBounds(50,200,256,256);
        imageIcon = new ImageIcon("F:\\Desktop\\Projects\\Alcancia\\Images\\hucha.png");
        icono = new ImageIcon(imageIcon.getImage().getScaledInstance(iconAc.getWidth(), iconAc.getHeight(), Image.SCALE_DEFAULT));
        iconAc.setIcon(icono);
        contentpane.add(iconAc);
        
        iconMt = new JLabel();
        iconMt.setBounds(510,200,170,260);
        imageIcon = new ImageIcon("F:\\Desktop\\Projects\\Alcancia\\Images\\martillo2.png");
        icono = new ImageIcon(imageIcon.getImage().getScaledInstance(iconMt.getWidth(), iconMt.getHeight(), Image.SCALE_DEFAULT));
        iconMt.setIcon(icono);
        contentpane.add(iconMt);
        
        romperAlcancia = new JButton();
        romperAlcancia.setBounds(525, 525, 140, 25);
        romperAlcancia.setText("Romper Alcancia");
        romperAlcancia.addActionListener(this);
        contentpane.add(romperAlcancia);
        
        monedas = new JLabel();
        monedas.setBounds(50,25,100,25);
        monedas.setText("Monedas: ");
        monedas.setFont(new Font("Arial Black", Font.PLAIN, 14));
        monedas.setForeground(Color.WHITE);
        contentpane.add(monedas);
        
        veinte = new JRadioButton();
        veinte.setBounds(50, 75, 50, 50);
        imageIcon = new ImageIcon("F:\\Desktop\\Projects\\Alcancia\\Images\\20 pesos.png");
        icono = new ImageIcon(imageIcon.getImage().getScaledInstance(veinte.getWidth(), veinte.getHeight(), Image.SCALE_DEFAULT));
        veinte.setIcon(icono);
        contentpane.add(veinte);
        
        cincuenta = new JRadioButton();
        cincuenta.setBounds(130, 75, 50, 50);
        imageIcon = new ImageIcon("F:\\Desktop\\Projects\\Alcancia\\Images\\50 pesos.png");
        icono = new ImageIcon(imageIcon.getImage().getScaledInstance(veinte.getWidth(), veinte.getHeight(), Image.SCALE_DEFAULT));
        cincuenta.setIcon(icono);
        contentpane.add(cincuenta);
        
        cien = new JRadioButton();
        cien.setBounds(210,75,70,50);
        cien.setText("$100");
        contentpane.add(cien);
        
        doscientos = new JRadioButton();
        doscientos.setBounds(310,75,70,50);
        doscientos.setText("$200");
        contentpane.add(doscientos);
        
        quinientos = new JRadioButton();
        quinientos.setBounds(410,75,70,50);
        quinientos.setText("$500");
        contentpane.add(quinientos);
        
        valueMonedas = new ButtonGroup();
        valueMonedas.add(veinte);
        valueMonedas.add(cincuenta);
        valueMonedas.add(cien);
        valueMonedas.add(doscientos);
        valueMonedas.add(quinientos);
        
        contVeinte = new JLabel();
        contVeinte.setBounds(70,130,100,25);
        contVeinte.setText("0");
        contVeinte.setFont(new Font("Arial Black", Font.PLAIN, 12));
        contVeinte.setForeground(Color.WHITE);
        contentpane.add(contVeinte);
        
        contCincuenta = new JLabel();
        contCincuenta.setBounds(150,130,100,25);
        contCincuenta.setText("0");
        contCincuenta.setFont(new Font("Arial Black", Font.PLAIN, 12));
        contCincuenta.setForeground(Color.WHITE);
        contentpane.add(contCincuenta);
        
        contCien = new JLabel();
        contCien.setBounds(240,130,100,25);
        contCien.setText("0");
        contCien.setFont(new Font("Arial Black", Font.PLAIN, 12));
        contCien.setForeground(Color.WHITE);
        contentpane.add(contCien);
        
        contDoscientos = new JLabel();
        contDoscientos.setBounds(340,130,100,25);
        contDoscientos.setText("0");
        contDoscientos.setFont(new Font("Arial Black", Font.PLAIN, 12));
        contDoscientos.setForeground(Color.WHITE);
        contentpane.add(contDoscientos);
        
        contQuinientos = new JLabel();
        contQuinientos.setBounds(440,130,100,25);
        contQuinientos.setText("0");
        contQuinientos.setFont(new Font("Arial Black", Font.PLAIN, 12));
        contQuinientos.setForeground(Color.WHITE);
        contentpane.add(contQuinientos);
        
        mostrarAgg = new JLabel();
        mostrarAgg.setBounds(50, 525, 200, 25);
        mostrarAgg.setText("Último Agregado: 0");
        mostrarAgg.setFont(new Font("Arial Black", Font.PLAIN, 14));
        mostrarAgg.setForeground(Color.WHITE);
        contentpane.add(mostrarAgg);
        
        mostrarTotal = new JLabel();
        mostrarTotal.setBounds(50, 545, 250, 25);
        mostrarTotal.setText("Total en Alcancía: 0");
        mostrarTotal.setFont(new Font("Arial Black", Font.PLAIN, 14));
        mostrarTotal.setForeground(Color.WHITE);
        contentpane.add(mostrarTotal);
        
        alcancia = new Alcancia();
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     *
     * @param evento
     */
    @Override
    public void actionPerformed(ActionEvent evento)
    {
        if(evento.getSource() == agregarMoneda)
        {
            Moneda moneda;
            if(veinte.isSelected())
            {
                moneda = new Moneda(20);
                alcancia.AgregarMoneda(moneda);
                mostrarAgg.setText("Último Agregado: "+moneda.getValor());
                mostrarTotal.setText("Total en Alcancía: "+alcancia.getTotal());
                contVeinte.setText(String.valueOf(alcancia.getVeinte()));
            }
            
            if(cincuenta.isSelected())
            {
                moneda = new Moneda(50);
                alcancia.AgregarMoneda(moneda);
                mostrarAgg.setText("Último Agregado: "+moneda.getValor());
                mostrarTotal.setText("Total en Alcancía: "+alcancia.getTotal());
                contCincuenta.setText(String.valueOf(alcancia.getCincuenta()));
            }
            
            if(cien.isSelected())
            {
                moneda = new Moneda(100);
                alcancia.AgregarMoneda(moneda);
                mostrarAgg.setText("Último Agregado: "+moneda.getValor());
                mostrarTotal.setText("Total en Alcancía: "+alcancia.getTotal());
                contCien.setText(String.valueOf(alcancia.getCien()));
            }
            
            if(doscientos.isSelected())
            {
                moneda = new Moneda(200);
                alcancia.AgregarMoneda(moneda);
                mostrarAgg.setText("Último Agregado: "+moneda.getValor());
                mostrarTotal.setText("Total en Alcancía: "+alcancia.getTotal());
                contDoscientos.setText(String.valueOf(alcancia.getDoscientos()));
            }
            
            if(quinientos.isSelected())
            {
                moneda = new Moneda(500);
                alcancia.AgregarMoneda(moneda);
                mostrarAgg.setText("Último Agregado: "+moneda.getValor());
                mostrarTotal.setText("Total en Alcancía: "+alcancia.getTotal());
                contQuinientos.setText(String.valueOf(alcancia.getQuinientos()));
            }
            
            if(valueMonedas.getSelection() == null)
            {
                JOptionPane.showMessageDialog(null, "Elija Una Moneda","Error",JOptionPane.ERROR_MESSAGE);
            }
            
            valueMonedas.clearSelection();
        }
        
        if(evento.getSource() == romperAlcancia)
        {
            alcancia.romperAlcancia();
            contVeinte.setText(String.valueOf(alcancia.getVeinte()));
            contCincuenta.setText(String.valueOf(alcancia.getCincuenta()));
            contCien.setText(String.valueOf(alcancia.getCien()));
            contDoscientos.setText(String.valueOf(alcancia.getDoscientos()));
            contQuinientos.setText(String.valueOf(alcancia.getQuinientos()));
            mostrarAgg.setText("Último Agregado: 0");
            mostrarTotal.setText("Total en Alcancía: 0");
        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public Image getIconImage()
    {
        String url = "F:\\Desktop\\hucha.png";
        Image retValue = Toolkit.getDefaultToolkit().getImage(url);
        return retValue;
    }
    
    public static void main(String[]args)
    {
        new Ventana();
    }
}