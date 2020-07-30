import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;

public class PanelDescuentos extends JPanel
{
    JCheckBox cbPPago;
    JCheckBox cbSPublico;
    JCheckBox cbTCuenta;
    Impuestos principal;
    public PanelDescuentos(Impuestos cll)
    {
        principal = cll;
        setLayout(new GridLayout(2, 2));
        
        TitledBorder border = BorderFactory.createTitledBorder("Resultados");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        cbPPago = new JCheckBox("Pronto Pago");
        cbSPublico = new JCheckBox("Servicio Público");
        cbTCuenta = new JCheckBox("Traslado de Cuenta");
        
        add(cbPPago);
        add(cbSPublico);
        add(cbTCuenta);
    }
}