
package Negocio;
/**
 *
 * @author Jairo
 */
public class Uso_Auto 
{
    public static void main(String [] args)
    {
        Automovil miauto = new Automovil();
        miauto.establecerColor("Rojo");
        
        Lechuza milechuza = new Lechuza(500, 5);
        milechuza.establecerColor("Azul");
        milechuza.configurar_aire("si");
        milechuza.configurar_asientos("si");
        System.out.println(miauto.darDatosGenerales()+ miauto.darColor());
        System.out.println(milechuza.darDatosGenerales()+ milechuza.darDatosLechuza()+ milechuza.darColor());
    }
}