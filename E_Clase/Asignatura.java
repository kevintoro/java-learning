
public class Asignatura
{
    private String nombre;
    private String codigo;
    private int credito;
    
    public Asignatura(String nombre, String codigo, int credito)
    {
        this.nombre=nombre;
        this.codigo=codigo;
        this.credito=credito;   
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
   public int getcredito(){
    return credito;  
  }
  public void setcreditos(int credito){
    credito=credito;  
  }
   
   
}
