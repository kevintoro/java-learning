public class ArbolBin {

    NodoB padre;
    NodoB raiz;

    //Constructor
    public ArbolBin() {
        raiz = null;
    }

    //Insercion de un elemento en el arbol
    public void insertaNodo(int Elem) {
        if (raiz == null) {
            raiz = new NodoB(Elem);
        } else {
            raiz.insertar(Elem);
        }
    }

    //Preorden Recursivo del arbol
    public NodoB preorden(NodoB Nodo) {
        if (Nodo != null)
        {
            System.out.print(Nodo.dato + " ");
            preorden(Nodo.Hizq);
            preorden(Nodo.Hder);
        }
        return Nodo;
    }

    //PostOrden recursivo del arbol
    public NodoB postOrden(NodoB Nodo) {
        if (Nodo != null)
        {
            postOrden(Nodo.Hizq);
            postOrden(Nodo.Hder);
            System.out.print(Nodo.dato + " ");
        }
        return Nodo;
    }

    //Inorden Recursivo del arbol
    public NodoB inorden(NodoB Nodo)
    {    
        if (Nodo != null)
        {
            inorden(Nodo.Hizq);
            System.out.print(Nodo.dato + " ");
            inorden(Nodo.Hder);
        }
        return Nodo;
    }

//cantidad de niveles q	ue posee el arbol
    public int altura(NodoB Nodo) {
        if (Nodo == null) {
            return -1;
        } else {
            return 1 + Math.max(altura(Nodo.Hizq), altura(Nodo.Hder));
        }
    }
//cantidad de elementos que posee el arbol	

    public int tama�o(NodoB Nodo) {
        if (Nodo == null) {
            return 0;
        } else {
            return 1 + tama�o(Nodo.Hizq) + tama�o(Nodo.Hder);
        }
    }
    //Busca un elemento en el arbol

    public void buscar(int Elem, NodoB A) {
        if (A == null | A.dato == Elem) {
            System.out.print(A.dato + " ");
            return;
        } else {
            if (Elem > A.dato) {
                buscar(Elem, A.Hder);
            } else {
                buscar(Elem, A.Hizq);
            }
        }
    }
    
    /**
     * M�todo para eliminar un dato si es hoja
     * @param nodo : que ser� el punto de partida para revisar de ah� para abajo
     * @param dato : que, ser� lo que se eliminar� siempre y cuando sea una hoja
     */
    public void eliminarHoja(NodoB nodo, int dato)
    {
        if(nodo!= null)
        {
            if(nodo.dato == dato)
            {
                if(nodo.Hder == null && nodo.Hizq == null)
                {
                    System.out.println("\nEs Hoja");
                    
                    if(nodo != raiz)
                    {
                        if(nodo.dato<padre.dato)
                        {
                            padre.Hizq = null;
                        }
                        else
                        {
                            padre.Hder = null;
                        }
                    }
                    else
                    {
                        raiz = null;
                    }
                }
                else
                {
                    System.out.println("\nNo Es Hoja");
                }
            }
            else
            {
                padre = nodo;
                eliminarHoja(nodo.Hizq, dato);
                eliminarHoja(nodo.Hder, dato);
            }
        }
    }
    
    public NodoB eliminarRaizUnHijo(NodoB nodo, int dato)
    {
        if (nodo != null) 
        {
            if (nodo.dato == dato) 
            {
                if(nodo.Hder == null && nodo.Hizq != null)
                {
                    nodo = nodo.Hizq;
                }
                else if(nodo.Hder != null && nodo.Hizq == null)
                {
                    nodo = nodo.Hder;
                }
                else
                {
                    System.out.println("No se puede eliminar porque no tiene hijos, o tiene 2 hijos");
                }   
            }
            else 
            {
                nodo.Hizq = eliminarRaizUnHijo(nodo.Hizq, dato);
                nodo.Hder = eliminarRaizUnHijo(nodo.Hder, dato);
            }
        }
        return nodo;
    }
    
    public void longitudHasta(int dato, int cont, NodoB ac)
    {
        if(ac != null)
        {
            if(ac.dato != dato)
            {
                int aux = cont+1;
                longitudHasta(dato, aux, ac.Hizq);
                aux = cont+1;
                longitudHasta(dato, aux, ac.Hder);
            }
            else if(ac.dato == dato)
            {
                System.out.println("Longitud: "+(cont-1));
            }
        }
    }
    
    public NodoB llenarArbol(NodoB nodo, int n, int nivel)
    {
        if(nodo != null)
        {
            nodo.Hder = llenarArbol(nodo.Hder, n, nivel + 1);
            nodo.Hizq = llenarArbol(nodo.Hizq, n, nivel + 1);
        }
        else if(nivel <= n)
        {
                nodo = new NodoB(0);
                nodo.Hizq = llenarArbol(nodo.Hizq, n, nivel + 1);
                nodo.Hder = llenarArbol(nodo.Hder, n, nivel + 1);
        }
        return nodo;
    }
    
    public boolean estaClave(NodoB ac, int dato)
    {
        if(ac.Hder == null && ac.Hizq == null)
        {
            if(ac.dato == dato)
            {
                return true;
            }
        }
        else if (ac.Hder != null || ac.Hizq != null)
        {
            estaClave(ac.Hizq, dato);
            estaClave(ac.Hder, dato);
        }
        return false;
    }
    
    public boolean antecesores(NodoB ac, int dato)
    {
        boolean is = false;
        if(ac!=null)
        {
            if(ac.dato<dato)
            {
                is = antecesores(ac.Hizq, dato);
                if(is == false)
                {
                    is = antecesores(ac.Hder, dato);
                }
            }
            else if(ac.dato == dato)
            {
                System.out.println("S� Son Antecesores");
                is = true;
            }
        }
        return is;
    }
    
    public int medianaEnRaiz(NodoB a, int suma)
    {
        if(a!=null)
        {
            suma = a.dato;
            suma += medianaEnRaiz(a.Hder, suma);
            suma += medianaEnRaiz(a.Hizq, suma);
        }
        System.out.println(suma);
        return 0;
    }

    public static void main(String[] args)
    {
        ArbolBin a = new  ArbolBin();
        a.insertaNodo(5);
        a.insertaNodo(3);
        a.insertaNodo(6);
        a.insertaNodo(1);
        a.insertaNodo(2);
        a.insertaNodo(4);
        a.insertaNodo(7);
        a.preorden(a.raiz);
        System.out.println("");
        a.longitudHasta(2, 1, a.raiz);
        a.llenarArbol(a.raiz, a.altura(a.raiz), 0);
        System.out.println("-----------------\n");
        a.preorden(a.raiz);
        System.out.println("");
        System.out.println(a.estaClave(a.raiz, 7));
        System.out.println(a.antecesores(a.raiz, 6));
        System.out.println(a.medianaEnRaiz(a.raiz, 0));
    }
}