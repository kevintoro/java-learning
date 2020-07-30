import javax.swing.JOptionPane;

public class Producto
{
    private final static String SM = "SUPERMERCADO";
    private final static String DG = "DROGUERÍA";
    private final static String PP = "PAPELERÍA";
    private final static String CP = "CUIDADO PERSONAL";
    private final static String PF = "PERFUMERÍA";
    private final static String EM = "ELECTRODOMÉSTICO";
    private final static String ET = "ENTRETENIMIENTO";
    
    private String identificador, nombre, marca, fechaIngreso, tipoP;
    private int cantBodega, cantEstante;
    private double valor;
    
    public Producto(String identificador, String nombre, String marca, String fechaIngreso, int cantBodega, int cantEstante, double valor, String tipoP)
    {
        this.identificador = identificador;
        this.nombre = nombre;
        this.marca = marca;
        this.fechaIngreso = fechaIngreso;
        this.cantBodega = cantBodega;
        this.cantEstante = cantEstante;
        this.valor = valor;
        
        if(tipoP.equalsIgnoreCase("supermercado"))
        {
            this.tipoP = SM;
        }
        else if(tipoP.equalsIgnoreCase("drogueria")|| tipoP.equalsIgnoreCase("droguería"))
        {
            this.tipoP = DG;
        }
        else if(tipoP.equalsIgnoreCase("papeleria")||tipoP.equalsIgnoreCase("papelería"))
        {
            this.tipoP = PP;
        }
        else if(tipoP.equalsIgnoreCase("cuidado personal"))
        {
            this.tipoP = CP;
        }
        else if(tipoP.equalsIgnoreCase("perfumería") || tipoP.equalsIgnoreCase("perfumeria"))
        {
            this.tipoP = PF;
        }
        else if(tipoP.equalsIgnoreCase("electrodomestico") || tipoP.equalsIgnoreCase("electrodoméstico"))
        {
            this.tipoP = EM;
        }
        else if(tipoP.equalsIgnoreCase("entretenimiento"))
        {
            this.tipoP = ET;
        }
        else
        {
            this.tipoP = null;
            JOptionPane.showMessageDialog(null, "Tipo de Producto no Válido", "Error en tipo de producto", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getTipoP() {
        
        if(tipoP == null)
        {
            do
            {
                String tipo = JOptionPane.showInputDialog("Digite un tipo de producto válido");
                setTipoP(tipo);
            }
            while(tipoP == null);
        }
        return tipoP;
    }

    public int getCantBodega() {
        return cantBodega;
    }

    public int getCantEstante() {
        return cantEstante;
    }

    public double getValor() {
        return valor;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setTipoP(String tipoP) {
        if(tipoP.equalsIgnoreCase("supermercado"))
        {
            this.tipoP = SM;
        }
        else if(tipoP.equalsIgnoreCase("drogueria")|| tipoP.equalsIgnoreCase("droguería"))
        {
            this.tipoP = DG;
        }
        else if(tipoP.equalsIgnoreCase("papeleria")||tipoP.equalsIgnoreCase("papelería"))
        {
            this.tipoP = PP;
        }
        else if(tipoP.equalsIgnoreCase("cuidado personal"))
        {
            this.tipoP = CP;
        }
        else if(tipoP.equalsIgnoreCase("perfumería") || tipoP.equalsIgnoreCase("perfumeria"))
        {
            this.tipoP = PF;
        }
        else if(tipoP.equalsIgnoreCase("electrodomestico") || tipoP.equalsIgnoreCase("electrodoméstico"))
        {
            this.tipoP = EM;
        }
        else if(tipoP.equalsIgnoreCase("entretenimiento"))
        {
            this.tipoP = ET;
        }
        else
        {
            this.tipoP = null;
            JOptionPane.showMessageDialog(null, "Tipo de Producto no Válido", "Error en tipo de producto", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setCantBodega(int cantBodega) {
        this.cantBodega = cantBodega;
    }

    public void setCantEstante(int cantEstante) {
        this.cantEstante = cantEstante;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}