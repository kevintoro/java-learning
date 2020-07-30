package controlador;

import java.awt.HeadlessException;
import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * clase que realiza el proceso de conexión con la base de datos access
 * @version 1.0
 */
public class ConnectAccess
{
    private Connection con;
    private String driver;
    private String url;
    
    /**
     * constructor donde le damos el valor por DEFAULT a driver
     * NOTA: NO MOVER NADA DE ÉSTO, PODRÍA GENERAR ERRORES.
     * TODO LO QUE ESTÁ HECHO AQUÍ ES BASADO EN CÓDIGOS ENCONTRADOS EN LA WEB 
     * DEBIDO A QUE ES UN MISMO PROCESO, SÓLO QUE CON DIFERENCIA DE RUTA DE ARCHIVOS
     */
    public ConnectAccess()
    {
        con = null;
        driver = "net.ucanaccess.jdbc.UcanaccessDriver";
        url = "";
    }

    /**
     * 
     * @return Objeto Connection que es la conexión con la base de datos
     */
    public Connection getCon()
    {
        return con;
    }

    /**
     * 
     * @return String que es el Driver de la base de datos
     */
    public String getDriver()
    {
        return driver;
    }

    /**
     * 
     * @return String con la URL, puede ser "" si no se ha agregado nada o configurado
     * como puede ser "jdbc:ucanaccess://" + la ruta del archivo access (.accdb)
     */
    public String getUrl()
    {
        return url;
    }

    /**
     * configura la conexión de la clase
     * @param con nueva conexión
     */
    public void setCon(Connection con)
    {
        this.con = con;
    }

    /**
     * configura el driver
     * @param driver el nuevo driver para la clase
     */
    public void setDriver(String driver)
    {
        this.driver = driver;
    }
    
    /**
     * abre con FileChooser la base de datos
     * NOTA: SÓLO SE ADMITEN ARCHIVOS .accdb YA QUE ASÍ ESTÁ CONFIGURADO EN LA CLASE
     * FileChooser
     */
    private void openDataBase()
    {
        url = "jdbc:ucanaccess://";
        FileChooser jc = new FileChooser();
        File f = jc.openDialog(null);
        url = url.concat(f.getAbsolutePath());
    }
    
    /**
     * realiza la conexión a la base de datos de Access usando la clase FileChooser 
     * @return la conexión realizada
     */
    public Connection toConnect()
    {
        openDataBase();
        try
        {
            if(con == null)
            {
                Class.forName(driver);
                con = DriverManager.getConnection(url);
                JOptionPane.showMessageDialog(null, "Conexión establecida");
            }
        }
        catch(ClassNotFoundException | HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e, "ERROR EN CONEXION", JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            con = null;
        }
        
        return con;
    }
    
    /**
     * realiza la conexión a la base de datos de Access usando un archivo que se ha abierto 
     * o creado ya
     * @param f objeto tipo File que, es la base de datos access (.accdb) con el que se va
     * a conectar
     * @return objeto tipo Connection que es la conexión hecha al archivo de la base de datos
     */
    public Connection toConnect(File f)
    {
        url = "jdbc:ucanaccess://"+f.getAbsolutePath();
        try
        {
            if(con == null)
            {
                Class.forName(driver);
                con = DriverManager.getConnection(url);
                JOptionPane.showMessageDialog(null, "Conexión establecida");
            }
        }
        catch(ClassNotFoundException | HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e, "ERROR EN CONEXION", JOptionPane.ERROR_MESSAGE);
            con = null;
        }
        
        return con;
    }
}