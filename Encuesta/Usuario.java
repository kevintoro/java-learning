public class Usuario
{
    int rangoEdad, opinion;
    String estadoCivil;
    public Usuario(String estadoCivil, int rangoEdad, int opinion)
    {
        this.estadoCivil = estadoCivil;
        this.rangoEdad = rangoEdad;
        this.opinion = opinion;
    }
    
    public String getEstadoCivil()
    {
        return estadoCivil;
    }
    
    public int getEdad()
    {
        return rangoEdad;
    }
    
    public int getOpinion()
    {
        return opinion;
    }
}