package Ufps.Gui;
/**
 *
 * @author PROFESORES
 */
public class Carro 
{
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, aireAcondicionado;
    
    public Carro()
    {
        ruedas=4;
        largo=200;
        ancho=300;
        motor=1600;
        peso_plataforma=500;
    }
    public Carro(int ruedas, int largo, int ancho, int motor, int peso_plataforma) {
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.motor = motor;
        this.peso_plataforma = peso_plataforma;
    }
    public void establecerColor(String color)
    {
        this.color= color;
    }
    public String darColor()
    {
        return " El color del Carro es "+ color;
    }
    public String darDatosGenerales()
    {
        return "La Plataforma del Carro es " + ruedas + " ruedas, " + " Mide " + largo/100 +  " Metros de largo, con un ancho de " + ancho + 
                " Cmts y un peso de plataforma de " + peso_plataforma + " Kgs" ;
    }
    public void configurar_asientos(String asientos)
    {
        if (asientos.equalsIgnoreCase("si"))
            asientos_cuero=true;
        else
            asientos_cuero=false;
    }
    public String darAsientos()
    {
        if (asientos_cuero==true)
            return " El Carro tiene asientos de Cuero";
        else
           return " El Carro tiene asientos de serie"; 
    }
    public void configurar_aire(String aire)
    {
        if (aire.equalsIgnoreCase("si"))
            aireAcondicionado=true;
        else
            aireAcondicionado=false;
    }
     public String darAire()
    {
        if (aireAcondicionado==true)
            return " El Carro tiene Aire Acondicionado";
        else
           return " El Carro tiene asientos de serie"; 
    }
    public String darPesoAuto()
    {
        int peso_carroceria= 500;
        peso_total= peso_plataforma + peso_carroceria;
        if(asientos_cuero==true)
            peso_total +=50;
        if(aireAcondicionado==true)
            peso_total +=20;
        return " El Peso del Carro es " + peso_total;
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
