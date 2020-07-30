package YoutubeDesktop;

public class Persona {
    
    Fecha fecha;
    String nombre;
    
    public Persona(){
        
    }
    
    public Persona(Fecha fecha, String nombre){
        
        this.fecha = fecha;
        this.nombre = nombre;
        
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
