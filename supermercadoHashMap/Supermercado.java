
import java.util.*;
import javax.swing.JOptionPane;

public class Supermercado
{
    Map<String, Producto> listaProductos;
    
    public Supermercado()
    {
        listaProductos = new LinkedHashMap<>();
    }
    
    /**
     * Busca si el producto se encuentra agregado
     * a la lista, y si no se encuentra, entonces
     * lo agrega, de ser contrario, muestra un mensaje 
     * de error
     * @param product Nuevo a Agregar
     */
    public void agregarProducto(Producto product)
    {
        if(listaProductos.containsValue(product))
        {
            JOptionPane.showMessageDialog(null, "Producto ya existente", "Error al agregar", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            listaProductos.put(product.getIdentificador(), product);
        }
    }
    
    /**
     * Busca el tipo del producto en la lista
     * @param identidicador del producto
     * @return Tipo de producto
     */
    public String localizarProducto(String identidicador)
    {
        return listaProductos.get(identidicador).getTipoP();
    }
    
    /**
     * Busca un producto en la lista
     * @param nombre del producto a buscar
     * @param marca del producto a buscar
     * @return Tipo de producto, o null si no se consigue
     */
    public String localizarDadoNombreyMarca(String nombre, String marca)
    {
        Iterator it = listaProductos.keySet().iterator();
        while(it.hasNext())
        {
            String key = (String) it.next();
            if(listaProductos.get(key).getNombre().equalsIgnoreCase(nombre) && listaProductos.get(key).getMarca().equalsIgnoreCase(marca))
            {
                return listaProductos.get(key).getTipoP();
            }
        }
        
        return null;
    }
    
    /**
     * Busca producto con menor cantidad, según los
     * parámetros dados por el usuario
     * @param tipoProducto
     * @return el producto de dicho tipo con menor cantidad en estante
     */
    public Producto menorDadoTipoProducto(String tipoProducto)
    {
        Producto menorCantidad = null;
        Iterator it = listaProductos.keySet().iterator();
        while(it.hasNext())
        {
            String key = (String) it.next();
            if(menorCantidad == null)
            {
                menorCantidad = listaProductos.get(key);
            }
            else
            {
                if(menorCantidad.getCantEstante()<listaProductos.get(key).getCantEstante())
                {
                    menorCantidad = listaProductos.get(key);
                }
            }
        }
        return menorCantidad;
    }
    
    /**
     * @return Cantidad de productos agregados a la lista
     */
    public int getCantidadProductosTotal()
    {
        return listaProductos.size();
    }
    
    /**
     * vende una cantidad determinada de producto
     * @param nombre del Producto
     * @param cantidad a vender
     */
    public void vender(String nombre, int cantidad)
    {
        Iterator it = listaProductos.keySet().iterator();
        while(it.hasNext())
        {
            String key = (String) it.next();
            if(listaProductos.get(key).getNombre().equalsIgnoreCase(nombre))
            {
                if(listaProductos.get(key).getCantEstante()>cantidad)
                {
                    listaProductos.get(key).setCantEstante(listaProductos.get(key).getCantEstante()-cantidad);
                    JOptionPane.showMessageDialog(null, "Venta Exitosa");
                }
                else
                {
                    int totalProducto = listaProductos.get(key).getCantBodega()+listaProductos.get(key).getCantEstante();
                    if(totalProducto>=cantidad)
                    {
                        listaProductos.get(key).setCantEstante(0);
                        listaProductos.get(key).setCantBodega(totalProducto-cantidad);
                        JOptionPane.showMessageDialog(null, "Venta Exitosa");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "No hay la cantidad Suficiente\n"
                                + "Cantidad en Estante: "+listaProductos.get(key).getCantEstante()+"\n"
                                + "Cantidad en Bodega: "+listaProductos.get(key).getCantBodega(), "Error en Venta", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }
}