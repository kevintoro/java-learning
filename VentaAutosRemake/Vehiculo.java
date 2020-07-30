import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Vehiculo
{
    private String marca, modelo, a�o, cilindraje;
    private double precio;
    private int ejes, cantidad, tipo;
    private ImageIcon imagen;
    public final int AUTOMOVIL = 1;
    public final int MOTOCICLETA = 2;
    public final int CAMION = 3;

    public Vehiculo(String marca, String modelo, String a�o, double precio, int ejes, int tipo, String cilindraje, String url)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.a�o = a�o;
        this.precio = precio;
        this.ejes = ejes;
        this.cilindraje = cilindraje;
        this.cantidad = 1;
        setImagen(url);
        setTipo(tipo);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getA�o() {
        return a�o;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public double getPrecio() {
        return precio;
    }

    public int getEjes() {
        return ejes;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getTipo() {
        return tipo;
    }
    
    public ImageIcon getImagen()
    {
        return imagen;
    }
    
    public final void setImagen(String url)
    {
        try
        {
            URI temp = new URI(url);
            imagen = new ImageIcon(url);
        }
        catch(URISyntaxException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public final void setTipo(int t)
    {
        if(t<1 || t>3)
        {
            do
            {
                JOptionPane.showMessageDialog(null, "Tipo de Vehículo Inválido", "Error en creación", JOptionPane.ERROR_MESSAGE);
                t = Integer.parseInt(JOptionPane.showInputDialog("Digite un Tipo"));
            }
            while(t<1 || t >3);
        }
        this.tipo = t;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void descuento(double porcentaje)
    {
        precio -= precio*porcentaje/100;
    }
}