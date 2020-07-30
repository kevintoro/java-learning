/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasycolas;

/**
 *
 * @author estudiante
 */
public class Navegador {
    Nodo pila; // guarda todo 
    Nodo devolver;// regresa
    
    
      public void apilar(int dato){
         Nodo aux;
         aux= new Nodo(dato,pila);
         pila=aux;
     
    }
      
      public int desapilar(){
         int resultado;
         if(pila==null)
             System.out.println("pila vacia");
         resultado=pila.dato;
         pila=pila.siguiente;
         return resultado;
     }
      
    public int atras()
    {
        int resultado;
         if(pila==null)
           System.out.println("No hay mas");
         
         devolver = pila;
         pila = pila.siguiente;
         resultado = devolver.dato;
       return resultado;
         
    }
    
    public int  adelante()
    {
        int resultado;
         
        pila = devolver;
        devolver = devolver.siguiente;
        resultado = pila.dato;
        return resultado;
    }
    
    public static void main(String[] args)
    {
        Navegador p = new Navegador();
                
        p.apilar(1);
        p.apilar(2);
        p.apilar(3);
        p.apilar(4);
        p.apilar(5);
        
        
        System.out.println(p.atras());
         System.out.println(p.atras());
          System.out.println(p.atras());
           System.out.println(p.atras());
           
             System.out.println(p.atras());
            
         
         
    }
}
