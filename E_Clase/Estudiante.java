
import javax.swing.*;
public class Estudiante
{
    private Asignatura [] asignaturas; 
    private float [] notas;
    private String nombre;
    public Estudiante(String nombre)
    {
       asignaturas=new Asignatura[5];
       notas=new float[5];
       this.nombre=nombre;
    }
    
    public void AgregarAsignaturas()
    {
        String nombre;
        int credito;
        String codigo;
        float definitiva;
        
        for(int i=0;i<5;i++)
        {
            nombre=JOptionPane.showInputDialog("Nombre de la Asignatura");
            codigo=JOptionPane.showInputDialog("Digite el Codigo");
            credito=Integer.parseInt(JOptionPane.showInputDialog("Numero de Creditos"));
            definitiva=Float.parseFloat(JOptionPane.showInputDialog("Digite Nota"));
            asignaturas[i]=new Asignatura(nombre, codigo, credito);
            notas[i]=definitiva;
        }
    }
    
    public void perdidas(){
    for(int i=0;i<5;i++){
    if(notas[i]<3){
    System.out.println("Perdio  "+asignaturas[i].getnombre()+"  con  "+notas[i]);
    
    }
    else{
    System.out.println("Paso  "+asignaturas[i].getnombre()+"  con  "+notas[i]);
    }
    } 
    }
    
    public void promedio(){
    float suma=0;
    int cre=0;
    float promedio;
    for(int i=0;i<asignaturas.length;i++){
    suma=suma+(notas[i]*asignaturas[i].getcredito());
    cre=cre+asignaturas[i].getcredito();
    }
    promedio=suma/cre;
    }
    
    public void mayor(){
    float max=0;
    String name=null;
    for(int i=0;i<asignaturas.length;i++){
    if(notas[i]>max){
    max=notas[i];
    name=asignaturas[i].getnombre();
    }
    }
    System.out.println("Nota maxima"+max+" en la materia"+name);
    }
}