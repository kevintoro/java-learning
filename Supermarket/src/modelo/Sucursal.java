package modelo;

import javax.swing.JOptionPane;
import controlador.Cola;
import controlador.Nodo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
 * @version 1.0 beta
 */
public class Sucursal
{
    private String code;
    private String address;
    private Cola colaProductos;
    private final Market market;

    /**
     * Constructor de Sucursal
     * @param code Código de la Sucursal
     * @param address Dirección de la Sucursal
     * @param market
     */
    public Sucursal(String code, String address, Market market)
    {
        this.code = code;
        this.address = address;
        colaProductos = new Cola();
        this.market = market;
    }

    /**
     * 
     * @return código de la sucursal
     */
    public String getCode()
    {
        return code;
    }

    /**
     * 
     * @return dirección de la Sucursal
     */
    public String getAddress()
    {
        return address;
    }
    
    /**
     * 
     * @return la Cola de los productos
     */
    public Cola getColaProductos()
    {
        return colaProductos;
    }

    /**
     * configura el código de una sucursal
     * @param code nuevo código
     */
    public void setCode(String code)
    {
        this.code = code;
    }

    /**
     * configurar la dirección de la sucursal
     * @param address la nueva dirección de la sucursal
     */
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    /**
     * cambia la cola por una que se haya creado
     * @param c nueva cola
     */
    public void setCola(Cola c)
    {
        this.colaProductos = c;
    }
    
    /**
     * realiza una búsqueda de producto en toda la sucursal
     * @param marca del producto (necesario)
     * @param detalles algún detalle acerca del producto para realizar la búsqueda (necesario para presición)
     * @return el producto específico después de procedimientos que se especifican en el código
     */
    public Producto lookForProduct(String marca, String detalles)
    {
        byte cant = 0;
        String details = "";
        String codetemp = "";
        Nodo p = colaProductos.getInicio();
        while(p != null)
        {
            if(p.getData().getTrademark().equalsIgnoreCase(marca))
            {
                if(p.getData().getDetails().contains(detalles))
                {
                    codetemp = p.getData().getCode();
                    details = details.concat(p.getData().getDetails()+" Código: "+p.getData().getCode()+"\n");
                    cant++;
                }
            }
            
            p = p.getSiguiente();
        }
        
        if(cant == 1)
        {
            return lookForProductByCode(codetemp);
        }
        else if(cant > 1)
        {
            String select = JOptionPane.showInputDialog(null, "Productos encontrados: \n"
                +details+" Escriba el código del que desea:");
            return lookForProductByCode(select);
        }
        
        return null;
    }
    
    /**
     * bsuca un producto por código
     * @param code código del producto
     * @return  el producto encontrado con el código, o null en caso de no encontrarse
     */
    public Producto lookForProductByCode(String code)
    {
        Nodo p = colaProductos.getInicio();
        while(p != null)
        {
            if(p.getData().getCode().equalsIgnoreCase(code))
            {
                return p.getData();
            }
            
            p = p.getSiguiente();
        }
        
        return null;
    }
    
    /**
     * Agrega un producto al listado y a la base de datos en caso de que efectivamente
     * sea nuevo, en caso de lo contrario, se usará el método addStockProduct(string, int);
     * @param p producto que se desea agregar
     * @throws java.lang.Exception 
     */
    public void addNewProduct(Producto p) throws Exception
    {
        boolean in = false;
        Nodo pd = colaProductos.getInicio();
        while(pd != null)
        {
            if(pd.getData().getCode().equalsIgnoreCase(p.getCode()))
            {
                int confirm = JOptionPane.showConfirmDialog(null, "Código de producto encontrado:"+
                    pd.getData().getTrademark()+" - "+pd.getData().getDetails()+"\n"
                    + "¿desea agregar el contenido al Stock?","atención", JOptionPane.YES_NO_OPTION);
                if(confirm == JOptionPane.YES_OPTION)
                {
                    addStockProduct(pd.getData().getCode(), p.getStock());
                    in = true;
                }
                else
                {
                    throw new Exception("Error al agregar producto");
                }
            }
            
            pd = pd.getSiguiente();
        }
        
        if(!in)
        {
            String query = "INSERT INTO Productos (Codigo, Marca, Detalles, Stock, Precio, Sucursal) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = market.getConnection().prepareStatement(query);
            ps.setString(1, p.getCode());
            ps.setString(2, p.getTrademark());
            ps.setString(3, p.getDetails());
            ps.setInt(4, p.getStock());
            ps.setDouble(5, p.getPrice());
            ps.setString(6, getCode());
            ps.executeUpdate();
            
            colaProductos.addNodo(new Nodo(p));
        }
    }
    
    /**
     * agrega productos a la Cola de productos omitiendo las sentencias SQL, es decir, para evitar que se agreguen
     * los productos que hay en la base de datos a ella misma
     * 
     * NOTA: EN LA BASE DE DATOS YA ESTÁ CONFIGURADO QUE EL CÓDIGO DEL PRODUCTO DEBE SER 
     * ÚNICO EN TODA LA BASE DE DATOS
     * @param p producto que se va a agregar a la Cola
     */
    public void addProductsSQL(Producto p)
    {
        colaProductos.addNodo(new Nodo(p));
    }
    
    /**
     * agrega stock al producto pasando por sentencia SQL para actualizar el Stock en ella
     * @param code código del producto al que se le va a agregar el stock
     * @param cant cantidad a agregar
     * @throws java.sql.SQLException en caso de error en SQL
     */
    public void addStockProduct(String code, int cant) throws SQLException
    {
        Nodo pd = colaProductos.getInicio();
        while(pd != null)
        {
            if(pd.getData().getCode().equalsIgnoreCase(code))
            {
                int stock = pd.getData().getStock() + cant;
                String query = "UPDATE Productos SET Stock = ? WHERE Codigo = ?";
                Connection con = market.getConnection();
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, stock);
                pst.setString(2, code);
                pst.executeUpdate();
                pd.getData().setStock(stock);
            }
            
            pd = pd.getSiguiente();
        }
    }
}