package Negocio;
/**
 *
 * @author Jairo
 */
public class Automovil 
{
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, aireAcondicionado;

    public Automovil(int ruedas, int largo, int ancho, int motor, int peso_plataforma) {
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.motor = motor;
        this.peso_plataforma = peso_plataforma;
    }
    public Automovil() {
        this.ruedas = 4;
        this.largo = 200;
        this.ancho = 300;
        this.motor = 1600;
        this.peso_plataforma = 500;
    }
    public String darDatosGenerales()
    {
        return "La Plataforma del Vehiculo tiene " + ruedas + " ruedas, " + " Mide " + largo/100 +  " Metros de largo, con un ancho de " + ancho + 
                " Cmts y un peso de plataforma de " + peso_plataforma + " Kgramos" ;
    }
    public void establecerColor(String color)
    {
        this.color= color;
    }
    public String darColor()
    {
        return " El Color del Vehiculo es  " + color;
    }
    public void configurar_asientos(String asientos)
    {
        if (asientos.equalsIgnoreCase("si"))
            this.asientos_cuero= true;
        else
            this.asientos_cuero= false;
    }
    public String dimeAsientos()
    {
        if(asientos_cuero=true)
            return " El Automovil tiene asientos de Cuero";
        else
           return " El Automovil tiene asientos de serie"; 
    }
    public void configurar_aire(String aire)
    {
        if (aire.equalsIgnoreCase("si"))
            this.aireAcondicionado= true;
        else
            this.aireAcondicionado= false;
    }
    public String dimeAire()
    {
        if(aireAcondicionado=true)
            return " El Automovil tiene AireAcondicionado";
        else
           return " El Automovil no tiene AireAcondicionado"; 
    }
    public String darPesoAuto()
    {
        int peso_carroceria= 500;
        peso_total= peso_plataforma + peso_carroceria;
        if(asientos_cuero==true)
            peso_total +=50;
        if(aireAcondicionado==true)
            peso_total +=20;
        return " El Peso del Auto es " + peso_total;
    }
    public int precioAuto()
    {
        int precio_final= 1000;
        if(asientos_cuero==true)
            precio_final +=2000;
        if (aireAcondicionado==true)
            precio_final +=1500;
        
        return precio_final;
    }
}
