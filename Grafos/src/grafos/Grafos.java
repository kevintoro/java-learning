/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;

/**
 *
 * @author matias
 */
public class Grafos {

    boolean dirigido; 
    int maxNodos;             
    int numVertices; 
    boolean matrizAdy[ ][ ];    
    
    public Grafos (boolean d) {
	maxNodos = numVertices = 0;
	dirigido = d;
    }
    public Grafos (int n, boolean d) { 
	dirigido = d;	 
	maxNodos = n;
	numVertices = 0;
	matrizAdy = new boolean[n][n];
	} 
    public void insertaArista (int i, int j) {
	matrizAdy [i] [j] = true;
	if (!dirigido) 
	matrizAdy [j] [i] = matrizAdy [i] [j]; 
    }
    
    public void eliminarArista (int i, int j) {
	matrizAdy [i] [j] = false;
	if (!dirigido) 
		matrizAdy [j] [i] = false; 
    }    
    
    public void insertaVertice (int n) {
	if ( n > maxNodos - numVertices )
		System.out.println ("Error, se supera el número de nodos máximo");
	else {
		for (int i = 0; i < numVertices + n; i++) {
			for (int j = numVertices; j < numVertices + n; j++) 
				matrizAdy [i] [j] = matrizAdy [j] [i] = false;
		}
        numVertices = numVertices + n;
	}
    }
    //grado dfe entrada
    public int gradoIn (int x) 	{
        int gIn = 0;
         for (int i = 0; i < numVertices; i++)   //recorrido por filas
            if (matrizAdy [i] [x])                     //manteniendo la posición de la columna en [ x ]
 	 gIn++;	 
    return gIn;
    }	
    // Grado de salida
    public int gradoOut (int x) {
        int gOut = 0;
        for (int j = 0; j < numVertices; j++) 	//recorrido por columnas 
            if (matrizAdy [x] [j])                           // manteniendo la posición de la fila en [ x ]
	gOut++; 
    return gOut;
    }
    //incidencia
    public int incidencia (int i) {
        if (!dirigido)	
            return gradoIn (i);
        else return gradoIn (i) + gradoOut (i); 
    }
    //tamaño del Grafo
    public int tamano () {
        int tm = 0;
        for (int i = 0; i < numVertices; i++)
            for (int j =0; j < numVertices; j++)
                if (matrizAdy [i] [j]) 
                    tm++;
            if (dirigido) 
                return tm;
            else return tm/2;
    }

    // comprueba si un grafo es dirigido
    public boolean esDirigido () {
        boolean dir = true;
        for (int i = 0; i < numVertices; i++)
            for (int j = 0; j < numVertices; j++) 
		if (matrizAdy [i] [j] != matrizAdy [j] [i]) 
  		dir = false;
    return dir;
    }
    
    public void imprimirMat()
    {
        System.out.print("  ");
        for(int i = 0; i<numVertices; i++)
        {
            System.out.print("[  "+(i+1)+"  ]");
        }
        
        System.out.println("");
        
        for(int i = 0; i<numVertices; i++)
        {
            System.out.print(i+1+".");
            for(int j = 0;j<numVertices; j++)
            {
                System.out.print("["+matrizAdy[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    public void recorrer()
    {
        
    }
    
    public static void main(String[] args) {
       Grafos g = new Grafos(5,false);
       g.insertaVertice(5);
       g.insertaArista(0, 1);
       g.insertaArista(0, 2);
       g.insertaArista(1, 2);
       g.insertaArista(2, 3);
       g.insertaArista(2, 4);
       g.insertaArista(3, 4);
       g.imprimirMat();
    }
    
}
