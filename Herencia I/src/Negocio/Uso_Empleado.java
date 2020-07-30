package Negocio;
/**
 *
 * @author PROFESORES
 */
public class Uso_Empleado
{
    public static void main(String []args)
    {
        Jefe miJefe = new Jefe("Jairo",90000,2010,8,8);
        miJefe.estableceIncentivo(2750);
        
        Empleado[] misEmpleados = new Empleado[6];
        
        misEmpleados[0]= new Empleado("Ana",30000,2000,07,07);
        misEmpleados[1]= new Empleado("Carlos",50000,1995,06,15);
        misEmpleados[2]= new Empleado("Yenny",25000,2005,9,25);
        misEmpleados[3]= new Empleado("Antonio",10000,2009,11,9);
       
        misEmpleados[4]= miJefe; //Polimorfismo en accion. Principio de sustitucion
        misEmpleados[5]= new Jefe("Nelsy",70000,2011,5,26);
        
        Jefe Jefe2 = (Jefe)misEmpleados[5];
        Jefe2.estableceIncentivo(10000);
        
        for(Empleado e: misEmpleados)
            e.subeSueldo(5);
       
        for(Empleado e: misEmpleados)
         {
             System.out.println("Nombre "+ e.getNombre()+ ", Sueldo " +e.getSueldo() + ", Fecha de Contrato " +e.getFechaContrato());
         }
    }
}
