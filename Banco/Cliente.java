public class Cliente
{
    String nombre;
    String numeroCuenta;
    String identificacion;
    double saldoActual;
    
    public Cliente(String numeroCuenta, String nombre, String identificacion, double saldoInicial)
    {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.saldoActual = saldoInicial;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getNumeroCuenta()
    {
        return numeroCuenta;
    }
    
    public String getIdentificacion()
    {
        return identificacion;
    }
    
    public double getSaldoActual()
    {
        return saldoActual;
    }
    
    public void consignar(double cantidad)
    {
        this.saldoActual += cantidad;
    }
    
    public void retirar(double cantidad)
    {
        this.saldoActual -= cantidad;
    }
}