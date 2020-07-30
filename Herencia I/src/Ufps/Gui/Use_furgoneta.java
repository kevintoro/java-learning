package Ufps.Gui;

import Negocio.Automovil;
import Negocio.Lechuza;

/**
 *
 * @author PROFESORES
 */
public class Use_furgoneta 
{
    public static void main(String args [])
    {
        Carro micarro = new Carro();
        micarro.establecerColor("Rojo");
        
        Furgoneta mifurgoneta = new Furgoneta(500, 5);
        mifurgoneta.establecerColor("Azul");
        mifurgoneta.configurar_aire("si");
        mifurgoneta.configurar_asientos("si");
        System.out.println(micarro.darDatosGenerales()+ micarro.darColor());
        System.out.println(mifurgoneta.darDatosGenerales()+ mifurgoneta.darDatosFurgoneta()+ mifurgoneta.darColor());
    }
}
