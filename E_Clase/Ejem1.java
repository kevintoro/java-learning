
//
public class Ejem1

{
    private int []num=new int[20];
    int mayor=0;
    int ps=0;
    public Ejem1(){
   
    }
    
    public void Ejercicio1()
    {
    for(int i=0;i<20;i++){
    double p =Math.random()*(100-1+1)+1; 
    int q = (int) p;
    num[i]=q;
      }
    
    for(int i=0;i<20;i++)
    {
        if(i==0){
        mayor=num[i];
     }
    else{
    if(mayor<num[i]){
    mayor=num[i];
    ps=i+1;}
    }
    } 
    System.out.println("el numero es "+mayor+" y su posicion es "+ps);
    }
    }

  
   

