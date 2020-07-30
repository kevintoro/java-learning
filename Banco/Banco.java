import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Banco
{
    ArrayList<Cliente> cuentas;
    ArrayList<Empleado> empleados;
    
    public Banco()
    {
        this.cuentas = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }
    
    public void addCuenta(Cliente nuevoCliente)
    {
        if(cuentas.size() == 0)
        {
            cuentas.add(nuevoCliente);
        }
        else
        {
            boolean existente = false;
            for(Cliente c: cuentas)
            {
                if(c.getNumeroCuenta().equals(nuevoCliente.getNumeroCuenta()))
                {
                    JOptionPane.showMessageDialog(null, "Número de Cuenta ya Existente","error al agregar", JOptionPane.ERROR_MESSAGE);
                    existente = true;
                }
                
                if(c.getIdentificacion().equals(nuevoCliente.getIdentificacion()))
                {
                    JOptionPane.showMessageDialog(null, "Usuario ya Existente","error al agregar", JOptionPane.ERROR_MESSAGE);
                    existente = true;
                }
            }
            
            if(!existente)
            {
                cuentas.add(nuevoCliente);
            }
        }
    }
    
    public void realizarDeposito(String numeroCuenta, double cantidadIngreso)
    {
        boolean existe = false;
        
        for(Cliente c: cuentas)
        {
            if(numeroCuenta.equals(c.getNumeroCuenta()))
            {
                c.consignar(cantidadIngreso);
                existe = true;
                JOptionPane.showMessageDialog(null, "Proceso Realizado con Éxito");
            }
        }
        
        if(!existe)
        {
            JOptionPane.showMessageDialog(null, "Cuenta no existente", "error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void retirarDinero(String numeroCuenta, String identificacion, double cantidadRetiro)
    {
        boolean existe = false;
        
        for(Cliente c: cuentas)
        {
            if(numeroCuenta.equals(c.getNumeroCuenta()))
            {
                if(identificacion.equals(c.getIdentificacion()))
                {
                    c.retirar(cantidadRetiro);
                    JOptionPane.showMessageDialog(null, "Proceso Realizado con Éxito");
                    existe = true;
                }
            }
        }
        
        if(!existe)
        {
            JOptionPane.showMessageDialog(null, "Cuenta no existente", "error", JOptionPane.ERROR_MESSAGE);
        }
    }
}