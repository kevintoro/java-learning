import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;
/**
 *
 * @author Kevin Toro
 */
public class PanelBotones extends JPanel implements ActionListener
{
    private final JButton butt1, butt2, butt3, butt4, butt5, butt6, butt7, butt8, butt9, butt0, buttMas, buttMenos,
            buttPor, buttDividir, buttPunto, buttCE, buttC, buttIgual;
    
    private final AppletCalculadora ac;
    
    private boolean aux;
    private boolean hayProceso;
    private boolean isSuma;
    private boolean isResta;
    private boolean isMultiplicacion;
    private boolean isDivision;
    private double total;
    
    public PanelBotones(AppletCalculadora ac)
    {
        this.ac = ac;
        
        hayProceso = false;
        isSuma = false;
        isResta = false;
        isMultiplicacion = false;
        isDivision = false;
        aux = false;
        
        setLayout(new GridLayout(6, 3));
        Font def = new Font("Arial", Font.BOLD, 30);
        
        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 2);
        setBorder(border);
        
        butt0 = new JButton("0");
        butt0.setFont(def);
        butt0.addActionListener(this);
        butt0.setForeground(Color.DARK_GRAY);
        
        butt1 = new JButton("1");
        butt1.setFont(def);
        butt1.addActionListener(this);
        butt1.setForeground(Color.DARK_GRAY);
        
        butt2 = new JButton("2");
        butt2.setFont(def);
        butt2.addActionListener(this);
        butt2.setForeground(Color.DARK_GRAY);
        
        butt3 = new JButton("3");
        butt3.setFont(def);
        butt3.addActionListener(this);
        butt3.setForeground(Color.DARK_GRAY);
        
        butt4 = new JButton("4");
        butt4.setFont(def);
        butt4.addActionListener(this);
        butt4.setForeground(Color.DARK_GRAY);
        
        butt5 = new JButton("5");
        butt5.setFont(def);
        butt5.addActionListener(this);
        butt5.setForeground(Color.DARK_GRAY);
        
        butt6 = new JButton("6");
        butt6.setFont(def);
        butt6.addActionListener(this);
        butt6.setForeground(Color.DARK_GRAY);
        
        butt7 = new JButton("7");
        butt7.setFont(def);
        butt7.addActionListener(this);
        butt7.setForeground(Color.DARK_GRAY);
        
        butt8 = new JButton("8");
        butt8.setFont(def);
        butt8.addActionListener(this);
        butt8.setForeground(Color.DARK_GRAY);
        
        butt9 = new JButton("9");
        butt9.setFont(def);
        butt9.addActionListener(this);
        butt9.setForeground(Color.DARK_GRAY);
        
        buttC = new JButton("C");
        buttC.setFont(def);
        buttC.addActionListener(this);
        buttC.setForeground(Color.DARK_GRAY);
        
        buttCE = new JButton("CE");
        buttCE.setFont(def);
        buttCE.addActionListener(this);
        buttCE.setForeground(Color.DARK_GRAY);
        
        buttDividir = new JButton("/");
        buttDividir.setFont(def);
        buttDividir.addActionListener(this);
        buttDividir.setForeground(Color.DARK_GRAY);
        
        buttIgual = new JButton("=");
        buttIgual.setFont(def);
        buttIgual.addActionListener(this);
        buttIgual.setForeground(Color.DARK_GRAY);
        
        buttMas = new JButton("+");
        buttMas.setFont(def);
        buttMas.addActionListener(this);
        buttMas.setForeground(Color.DARK_GRAY);
        
        buttMenos = new JButton("-");
        buttMenos.setFont(def);
        buttMenos.addActionListener(this);
        buttMenos.setForeground(Color.DARK_GRAY);
        
        buttPor = new JButton("*");
        buttPor.setFont(def);
        buttPor.addActionListener(this);
        buttPor.setForeground(Color.DARK_GRAY);
        
        buttPunto = new JButton(".");
        buttPunto.setFont(def);
        buttPunto.addActionListener(this);
        buttPunto.setForeground(Color.DARK_GRAY);
        
        add(butt1);
        add(butt2);
        add(butt3);
        add(butt4);
        add(butt5);
        add(butt6);
        add(butt7);
        add(butt8);
        add(butt9);
        add(buttPunto);
        add(butt0);
        add(buttCE);
        add(buttMas);
        add(buttMenos);
        add(buttIgual);
        add(buttPor);
        add(buttDividir);
        add(buttC);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == butt0)
        {
            if(aux)
            {
                ac.getPantalla().setText("0");
                aux = false;
            }
            else if(!ac.getPantalla().getText().equals("0"))
            {
                ac.getPantalla().setText(ac.getPantalla().getText().concat("0"));
            }
        }
        
        if(ae.getSource() == butt1)
        {
            if(aux)
            {
                ac.getPantalla().setText("1");
                aux = false;
            }
            else
            {
                if(ac.getPantalla().getText().equals("0"))
                {
                    ac.getPantalla().setText("1");
                }
                else
                {
                    ac.getPantalla().setText(ac.getPantalla().getText().concat("1"));
                }
            }
        }
        
        if(ae.getSource() == butt2)
        {
            if(aux)
            {
                ac.getPantalla().setText("2");
                aux = false;
            }
            else
            {
                if(ac.getPantalla().getText().equals("0"))
                {
                    ac.getPantalla().setText("2");
                }
                else
                {
                    ac.getPantalla().setText(ac.getPantalla().getText().concat("2"));
                }
            }
        }
        
        if(ae.getSource() == butt3)
        {
            if(aux)
            {
                ac.getPantalla().setText("3");
                aux = false;
            }
            else
            {
                if(ac.getPantalla().getText().equals("0"))
                {
                    ac.getPantalla().setText("3");
                }
                else
                {
                    ac.getPantalla().setText(ac.getPantalla().getText().concat("3"));
                }
            }
        }
        
        if(ae.getSource() == butt4)
        {
            if(aux)
            {
                ac.getPantalla().setText("4");
                aux = false;
            }
            else
            {
                if(ac.getPantalla().getText().equals("0"))
                {
                    ac.getPantalla().setText("4");
                }
                else
                {
                    ac.getPantalla().setText(ac.getPantalla().getText().concat("4"));
                }
            }
        }
        
        if(ae.getSource() == butt5)
        {
            if(aux)
            {
                ac.getPantalla().setText("5");
                aux = false;
            }
            else
            {    
                if(ac.getPantalla().getText().equals("0"))
                {
                    ac.getPantalla().setText("5");
                }
                else
                {
                    ac.getPantalla().setText(ac.getPantalla().getText().concat("5"));
                }
            }
        }
        
        if(ae.getSource() == butt6)
        {
            if(aux)
            {
                ac.getPantalla().setText("6");
                aux = false;
            }
            else
            {
                if(ac.getPantalla().getText().equals("0"))
                {
                    ac.getPantalla().setText("6");
                }
                else
                {
                    ac.getPantalla().setText(ac.getPantalla().getText().concat("6"));
                }
            }
        }
        
        if(ae.getSource() == butt7)
        {
            if(aux)
            {
                ac.getPantalla().setText("7");
                aux = false;
            }
            else
            {
                if(ac.getPantalla().getText().equals("0"))
                {
                    ac.getPantalla().setText("7");
                }
                else
                {
                    ac.getPantalla().setText(ac.getPantalla().getText().concat("7"));
                }
            }
        }
        
        if(ae.getSource() == butt8)
        {
            if(aux)
            {
                ac.getPantalla().setText("8");
                aux = false;
            }
            else
            {
                if(ac.getPantalla().getText().equals("0"))
                {
                    ac.getPantalla().setText("8");
                }
                else
                {
                    ac.getPantalla().setText(ac.getPantalla().getText().concat("8"));
                }
            }
        }
        
        if(ae.getSource() == butt9)
        {
            if(aux)
            {
                ac.getPantalla().setText("9");
                aux = false;
            }
            else
            {
                if(ac.getPantalla().getText().equals("0"))
                {
                    ac.getPantalla().setText("9");
                }
                else
                {
                    ac.getPantalla().setText(ac.getPantalla().getText().concat("9"));
                }
            }
        }
        
        if(ae.getSource() == buttPunto)
        {
            if(aux)
            {
                ac.getPantalla().setText("0.");
                aux = false;
            }
            else if(!ac.getPantalla().getText().contains("."))
            {
                ac.getPantalla().setText(ac.getPantalla().getText().concat("."));
            }
            else
            {
                JOptionPane.showMessageDialog(ac, "No se puede poner 2 puntos", "error en escritura", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(ae.getSource() == buttC)
        {
            ac.getPantalla().setText("0");
            total = 0;
            hayProceso = false;
            isSuma = false;
            isResta = false;
            isMultiplicacion = false;
            isDivision = false;
            aux = true;
        }
        
        if(ae.getSource() == buttCE)
        {
            ac.getPantalla().setText("0");
        }
        
        if(ae.getSource() == buttIgual)
        {
            if(hayProceso)
            {
                if(isSuma)
                {
                    total += Double.parseDouble(ac.getPantalla().getText());
                    isSuma = false;
                }
                
                if(isResta)
                {
                    total -= Double.parseDouble(ac.getPantalla().getText());
                    isResta = false;
                }
                
                if(isMultiplicacion)
                {
                    total *= Double.parseDouble(ac.getPantalla().getText());
                    isMultiplicacion = false;
                }
                
                if(isDivision)
                {
                    total /= Double.parseDouble(ac.getPantalla().getText());
                    isDivision = false;
                }
                
                hayProceso = false;
                aux = true;
                
                String valor = String.valueOf(total);
                if(valor.endsWith(".0"))
                {
                    int index = valor.indexOf(".");
                    ac.getPantalla().setText(valor.substring(0, index));
                }
                else
                {
                    ac.getPantalla().setText(valor);
                }
            }
            total = 0;
        }
        
        if(ae.getSource() == buttMas)
        {
            if(hayProceso)
            {
                if(isSuma)
                {
                    total += Double.parseDouble(ac.getPantalla().getText());
                }
                
                if(isResta)
                {
                    total -= Double.parseDouble(ac.getPantalla().getText());
                    isResta = false;
                }
                
                if(isMultiplicacion)
                {
                    total *= Double.parseDouble(ac.getPantalla().getText());
                    isMultiplicacion = false;
                }
                
                if(isDivision)
                {
                    total /= Double.parseDouble(ac.getPantalla().getText());
                    isDivision = false;
                }
            }
            else
            {
                total = Double.parseDouble(ac.getPantalla().getText());
                isSuma = true;
            }
            hayProceso = true;
            ac.getPantalla().setText("0");
        }
        
        if(ae.getSource() == buttMenos)
        {
            if(hayProceso)
            {
                if(isSuma)
                {
                    total += Double.parseDouble(ac.getPantalla().getText());
                    isSuma = false;
                }
                
                if(isResta)
                {
                    total -= Double.parseDouble(ac.getPantalla().getText());
                }
                
                if(isMultiplicacion)
                {
                    total *= Double.parseDouble(ac.getPantalla().getText());
                    isMultiplicacion = false;
                }
                
                if(isDivision)
                {
                    total /= Double.parseDouble(ac.getPantalla().getText());
                    isDivision = false;
                }
            }
            else
            {
                total = Double.parseDouble(ac.getPantalla().getText());
                isResta = true;
            }
            hayProceso = true;
            ac.getPantalla().setText("0");
        }
        
        if(ae.getSource() == buttPor)
        {
            if(hayProceso)
            {
                if(isSuma)
                {
                    total += Double.parseDouble(ac.getPantalla().getText());
                    isSuma = false;
                }
                
                if(isResta)
                {
                    total -= Double.parseDouble(ac.getPantalla().getText());
                    isResta = false;
                }
                
                if(isMultiplicacion)
                {
                    total *= Double.parseDouble(ac.getPantalla().getText());
                }
                
                if(isDivision)
                {
                    total /= Double.parseDouble(ac.getPantalla().getText());
                    isDivision = false;
                }
            }
            else
            {
                total = Double.parseDouble(ac.getPantalla().getText());
                isMultiplicacion = true;
            }
            hayProceso = true;
            ac.getPantalla().setText("0");
        }
        
        if(ae.getSource() == buttDividir)
        {
            if(hayProceso)
            {
                if(isSuma)
                {
                    total += Double.parseDouble(ac.getPantalla().getText());
                    isSuma = false;
                }
                
                if(isResta)
                {
                    total -= Double.parseDouble(ac.getPantalla().getText());
                    isResta = false;
                }
                
                if(isMultiplicacion)
                {
                    total *= Double.parseDouble(ac.getPantalla().getText());
                    isMultiplicacion = false;
                }
                
                if(isDivision)
                {
                    total /= Double.parseDouble(ac.getPantalla().getText());
                }
            }
            else
            {
                total = Double.parseDouble(ac.getPantalla().getText());
                isDivision = true;
            }
            hayProceso = true;
            ac.getPantalla().setText("0");
        }
    }
}