package modelo;

/**
 * Clase para creación de productos 
 * @author OLIVO
 */
public class Producto
{
    private String trademark;
    private String details;
    private double price;
    private String code;
    private int stock;
    
    /**
     * Constructor de Producto
     * @param trademark marca del producto
     * @param details detalles del producto (o especificaciones)
     * @param price precio del producto
     * @param code código único del producto
     * @param stock stock del producto
     */
    public Producto(String trademark, String details, double price, String code, int stock)
    {
        this.trademark = trademark;
        this.details = details;
        this.price = price;
        this.code = code;
        this.stock = stock;
    }

    /**
     * 
     * @return marca del producto
     */
    public String getTrademark()
    {
        return trademark;
    }

    /**
     * 
     * @return precio del producto
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * 
     * @return código del producto
     */
    public String getCode()
    {
        return code;
    }

    /**
     * 
     * @return detalles o especificaciones del producto
     */
    public String getDetails()
    {
        return details;
    }

    /**
     * 
     * @return stock en tienda
     */
    public int getStock()
    {
        return stock;
    }

    /**
     * configura la marca del producto
     * @param trademark nueva marca
     */
    public void setTrademark(String trademark)
    {
        this.trademark = trademark;
    }

    /**
     * configura el precio del producto
     * @param price nuevo precio del producto
     */
    public void setPrice(double price)
    {
        this.price = price;
    }

    /**
     * configura el código del producto
     * @param code nuevo código del producto
     */
    public void setCode(String code)
    {
        this.code = code;
    }

    /**
     * configura los detalles o especificaciones del producto 
     * @param details nuevos detalles o especificaciones del producto
     */
    public void setDetails(String details)
    {
        this.details = details;
    }

    /**
     * configura el stock que hay en tienda
     * @param stock nuevo stock en tienda
     */
    public void setStock(int stock)
    {
        this.stock = stock;
    }
}