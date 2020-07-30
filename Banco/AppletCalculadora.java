import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

/**
 *
 * @author Kevin Toro
 */
public class AppletCalculadora extends JFrame
{
    private final JTextField txtPantalla;
    private final PanelBotones pBotones;
    
    public AppletCalculadora()
    {
        pBotones = new PanelBotones(this);
        setSize(400, 550);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("AppletCalculadora");
        
        txtPantalla = new JTextField("0");
        txtPantalla.setEditable(false);
        txtPantalla.setHorizontalAlignment(JTextField.RIGHT);
        txtPantalla.setFont(new Font("Arial", Font.BOLD, 50));
        txtPantalla.setForeground(Color.DARK_GRAY);
        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 2);
        txtPantalla.setBorder(border);
        txtPantalla.setBackground(Color.WHITE);
        
        add(txtPantalla, BorderLayout.NORTH);
        add(pBotones, BorderLayout.CENTER);
    }
    
    public JTextField getPantalla()
    {
        return this.txtPantalla;
    }

    public static void main(String[] args)
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            AppletCalculadora ac = new AppletCalculadora();
            ac.setVisible(true);
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e)
        {
            System.out.println(e.getCause());
        }
    }
}