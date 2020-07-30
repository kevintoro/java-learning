/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasycolas;

/**
 *
 * @author MAtias Herrera C
 */
public class PilasyColas {
    Nodo pila;
    int aux = 0;

    public PilasyColas() {
        this.pila = null;
    }
     public void apilar(int dato)
     {
         Nodo temp = new Nodo(dato,pila);
         pila=temp;
         System.out.println(pila.dato);
     }
     
     public int desapilar(){
         int resultado;
         if(pila==null)
             System.out.println("pila vacia");
         resultado=pila.dato;
         pila=pila.siguiente;
         return resultado;
     }
     
     public int retraso(){
         int resultado=0;
         if(pila==null)
             System.out.println("PILA VACIA");
         else
         {
             resultado = pila.siguiente.dato;
             aux = pila.dato;
         }
         return resultado;
     }
     
     public int adelanto()
     {
         int resultado = 0;
         if(pila == null)
         {
             System.out.println("PILA VACIA");
         }
         else
         {
             resultado = aux;
         }
         return resultado;
     }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilasyColas p=new PilasyColas();
        p.apilar(1);
        p.apilar(2);
        p.apilar(3);
        p.apilar(4);
        p.apilar(5);
        //System.out.println(p.desapilar());
        //System.out.println(p.desapilar());
        System.out.println("Se retrocedió al: "+p.retraso());
        // TODO code application logic here
        System.out.println("Se Adelantó al: "+p.adelanto());
        
       
    }
    
}
