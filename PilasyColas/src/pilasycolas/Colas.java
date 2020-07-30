package pilasycolas;

/**
 *
 * @author MAtias Herrera C
 */
public class Colas {
    Nodo principio;
    Nodo fin;

    public Colas() {
        principio=null;
        fin=null;
    }
    
    public void encolar(int x){
        Nodo aux;
        aux=new Nodo(x,null);
        if(principio==null){
            principio=aux;
            fin=aux;
        }
        else {
            fin.siguiente=aux;
            fin=aux;
        }   
    }
}