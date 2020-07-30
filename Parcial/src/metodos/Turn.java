package metodos;

public class Turn
{
    String nombre, cc;
    
    public Turn(String nombre, String cc) {
        this.nombre = nombre;
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCc() {
        return cc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}