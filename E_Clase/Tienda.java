import javax.swing.*;
public class Tienda
{
    private Producto [] productos; 
    private String nombre;
    int n=Integer.parseInt(JOptionPane.showInputDialog("Digite la Cantidad De Productos"));
    int cantidad;
    String codigo;
    double precio;
   public Tienda()
   {
       productos=new Producto[n];
   }
    
   public void AgregarProductos(){
    
        for(int i=0;i<n;i++)
        {
            nombre=JOptionPane.showInputDialog("Nombre del producto");
            codigo=JOptionPane.showInputDialog("Digite el Codigo Del Prodcuto");
            cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cantidad De Productos"));
            precio=Double.parseDouble(JOptionPane.showInputDialog("Precio Del Producto "));
            productos[i]=new Producto(nombre, codigo, cantidad, precio);
        }
    }

   public void Buscar(){
       String busca=JOptionPane.showInputDialog("Producto que desea buscar");
    for(int i=0;i<n;i++)
    {
       System.out.println("Iniciando For\n");
       if(busca==productos[i].getnombre()){
           System.out.println("El producto "+productos[i].getnombre()+" Es vendido en la tienda");
           System.out.println("Codigo="+productos[i].getcodigo());
           System.out.println("Precio="+productos[i].getprecio());
           System.out.println("Cantidad Disponible="+productos[i].getcantidad());
        }
    }
    System.out.println("Este Producto No Se Ecuentra En La Tienda");
   }
   
   public void Agregarotro()
   {
       for(int i=n;i<=n;i++)
       {
               n++;
               productos = new Producto[n];
               nombre=JOptionPane.showInputDialog("Nombre del producto");
               codigo=JOptionPane.showInputDialog("Digite el Codigo Del Prodcuto");
               cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cantidad De Productos"));
               precio=Double.parseDouble(JOptionPane.showInputDialog("Precio Del Producto "));
               productos[i]= new Producto(nombre, codigo, cantidad, precio);
       }
   }
   
   public void listado()
   {
       for(int i=0;i<n;i++)
       {
           System.out.println("El producto "+productos[i].getnombre());
           System.out.println("Codigo="+productos[i].getcodigo());
           System.out.println("Precio="+productos[i].getprecio());
           System.out.println("Cantidad Disponible="+productos[i].getcantidad());
        }
   }
}