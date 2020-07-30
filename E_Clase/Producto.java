
public class Producto
{
   String codigo;
   String nombre;
   int cantidad;
   double precio;
   
    public Producto(String nombre, String codigo, int cantidad, double precio)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    
      
  public String getnombre(){
     return nombre;
  }
  public void setsombre(String newnombre){
   nombre=newnombre;  
  }
  public String getcodigo(){
    return codigo;  
  }
  public void setcodigo(String newcodigo){
   codigo=newcodigo;  
  }
   public double getprecio(){
    return precio;  
  }
  public void setprecios(double newprecio){
    precio=newprecio;  
  }
   public int getcantidad(){
  return cantidad;
  }
  public void setcantidad(int newcantidad){
  cantidad=newcantidad;
  }
  
}
