package modelo;

import controlador.ConnectAccess;
import controlador.FileChooser;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * 
 * @version 1.0
 */
public class Market
{
    private final ArrayList<Sucursal> branchOffices;
    private String name;
    private final Connection con;
    ConnectAccess ca;
    Statement st;

    /**
     * Constructor de la clase Market, aquí se inicializa el ArrayList con el listado de
     * las sucursales.
     * @param name nombre del Market
     */
    public Market(String name)
    {
        this.name = name;
        this.branchOffices = new ArrayList<>();
        ca = new ConnectAccess();
        con = start();
        st = createStatement();
    }

    /**
     * obtiene el listado de las sucursales
     * @return un ArratList de las Sucursales agregadas
     */
    public ArrayList<Sucursal> getBranchOffices()
    {
        return branchOffices;
    }

    /**
     * 
     * @return objeto tipo String con el nombre del Market
     */
    public String getName()
    {
        return name;
    }

    /**
     * 
     * @param name nuevo nombre del Market
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * 
     * @return Ojeto tipo Statement para algunas declaraciones por fuera de la clase
     */
    public Statement getStatement()
    {
        return st;
    }
    
    /**
     * 
     * @return Objeto tipo conexión que es la conexión de ésta clase a la base de datos
     */
    public Connection getConnection()
    {
        return con;
    }
    
    /**
     * Agrega una Sucursal al Listado, en caso de que esté mostrará error
     * @param s objeto tipo Sucursal que se desea agregar
     * @throws java.lang.Exception en caso de encontrar un código igual en el listado de 
     * las sucursales
     */
    public void addBranchOffice(Sucursal s) throws Exception
    {
        for(Sucursal su: branchOffices)
        {
            if(su.getCode().equalsIgnoreCase(s.getCode()))
            {
                throw new Exception("Código de Sucursal ya agregado anteriormente");
            }
        }
        branchOffices.add(s);
        
        try
        {
            String query = "INSERT INTO Sucursales (Codigo, Direccion) VALUES (?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, s.getCode());
            pst.setString(2, s.getAddress());
            pst.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        JOptionPane.showMessageDialog(null, "Sucursal agregada correctamente");
    }
    
    /**
     * Agrega las sucursales al listado desde el archivo de base de datos acces (.accdb)
     * @param s
     * @throws Exception 
     */
    private void addBranchOfficeSQL(Sucursal s) throws Exception
    {
        for(Sucursal su: branchOffices)
        {
            if(su.getCode().equalsIgnoreCase(s.getCode()))
            {
                throw new Exception("Código de Sucursal ya agregado anteriormente");
            }
        }
        branchOffices.add(s);
        
    }
    
    /**
     * Realiza una búsqueda superior en todas las sucursales agregadas a la franquicia/Market
     * @param marca del producto
     * @param detalle
     * @return 
     */
    public boolean lookForProduct(String marca, String detalle)
    {
        for(Sucursal s: branchOffices)
        {
            Producto tmp = s.lookForProduct(marca, detalle);
            if(tmp != null)
            {
                JOptionPane.showMessageDialog(null, "Producto "+tmp.getTrademark()+" - "+
                        tmp.getDetails()+" encontrado en sucursal: " + s.getCode()+"\n"
                        + "Dirección: "+s.getAddress());
                
                return true;
            }
        }
        return false;
    }
    
    /**
     * Realiza la conexión con la base de datos Access
     * @return objeto tipo Connection que es la conexión al archivo de la base de datos
     */
    private Connection start()
    {
        Connection contemp; 
        FileChooser jc = new FileChooser();
        File f = new File(jc.getFileSystemView().getDefaultDirectory()+File.separator+"Market Java UP");
        File f2 = new File(f.getAbsolutePath()+File.separator+"dbMarket.accdb");
        if(f.exists() && f2.exists())
        {                                                                                             
            contemp = ca.toConnect(f2);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Base de datos no encontrada\n"
                        + "es necesario abrir una", "¡Atención!", JOptionPane.WARNING_MESSAGE);
            
            File fileOpen = jc.openDialog(null);
            
            if(f.exists())
            {
                boolean convert = fileOpen.renameTo(new File(f.getAbsolutePath()+File.separator+"dbMarket.accdb"));
                if(convert)
                {
                    JOptionPane.showMessageDialog(null, "Base de datos movida a: \n"
                            + fileOpen.getAbsolutePath());
                }
            }
            else
            {
                f.mkdirs();
                boolean convert = fileOpen.renameTo(new File(f.getAbsolutePath()+File.separator+"dbMarket.accdb"));
                if(convert)
                {
                    JOptionPane.showMessageDialog(null, "Base de datos movida a: \n"
                            + fileOpen.getAbsolutePath());
                }
            }
            contemp = ca.toConnect(f2);
        }
        
        return contemp;
    }
    
    /**
     * @return objeto de tipo Statement en donde se van a ejecutar las sentencias Query
     */
    private Statement createStatement()
    {
        Statement s = null;
        try
        {
            s = con.createStatement();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        return s;
    }
    
    /**
     * Actualiza el listado de Sucursales
     */
    public void updateBranchOffices()
    {
        try
        {
            String query = "SELECT * FROM Sucursales";
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                Sucursal s = new Sucursal(rs.getString("Codigo"), rs.getString("Direccion"), this);
                addBranchOfficeSQL(s);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    /**
     * Actualiza el listado de productos en cada sucursal
     * NOTA: es necesario primero actualizar el listado de sucursales con
     * updateBranchOffices
     */
    public void updateProducts()
    {
        try
        {
            String query = "SELECT * FROM Productos";
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                String s =  rs.getString("Sucursal");
                for(Sucursal suc: branchOffices)
                {
                    if(suc.getCode().equalsIgnoreCase(s))
                    {
                        Producto p = new Producto(rs.getString("Marca"), rs.getString("Detalles"), rs.getDouble("Precio"), rs.getString("Codigo"), rs.getInt("Stock"));
                        suc.addProductsSQL(p);
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    /**
     * cierra la conexión con la base de datos, es recomendado cerrarla siempre que se termine
     * el programa
     * @throws SQLException en caso de error con SQL
     */
    public void closeConnection() throws SQLException
    {
        con.close();
    }
    
    /**
     * tenemos aquí una prueba temporal para algunas funcionas
     * @param args
     * @throws SQLException en caso de error en SQL
     * @throws Exception  en caso de cualquier otro error
     */
    public static void main(String[] args) throws SQLException,Exception
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e)
        {
        }
        Market m = new Market("name");
        m.updateBranchOffices();
        m.updateProducts();
        m.getBranchOffices().get(0).addNewProduct(new Producto("Samsung", "J8 PRO 2019", 300000, "895454654" , 20));
        m.closeConnection();
    }
}