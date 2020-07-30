import javax.swing.*;
import java.awt.*;
public class Calculadora extends JFrame
{
    JPanel contentpane;
    JLabel texto;
    JButton suma,resta,mult,div,igual;
    JButton num1,num2,num3,num4,num5,num6,num7,num8,num9,num0;
    public Calculadora()
    {
        setBounds(0,0,300,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Ventana");
        
        contentpane = new JPanel();
        contentpane.setBackground(Color.black);
        contentpane.setLayout(null);
        setContentPane(contentpane);
        
        texto = new JLabel();
        texto.setBounds(25, 20, 250, 50);
        texto.setText("");
        texto.setFont(new Font("Arial",Font.BOLD, 15));
        texto.setForeground(Color.white);
        contentpane.add(texto);
    }
}