public class Play
{
    int mat[][];
    
    public Play()
    {
        this.mat = new int [3][3];
    }
    
    public void Generar()
    {
        int mitad= mat.length/2;
        int Fila = mitad;
        int Columna = 0;
        
        mat[Fila][Columna] = 1;
        
        int nFila=Fila;
        int nColumna= Columna;
        
        for(int i=2;i<=9;i++)
        {
            Fila--;
            Columna--;
            
            if(Fila<0)
            {
                Fila = mat.length-1;
            }
            
            if(Columna<0)
            {
                Columna = mat.length-1;
            }
            
            if(mat[Fila][Columna]==0)
            {
                mat[Fila][Columna]=i;
            }
            else
            {
                Fila = nFila+1;
                Columna = nColumna;
                
                mat[Fila][Columna]=i;
            }
            
            nFila=Fila;
            nColumna = Columna;
        }
    }
    
    public void Mostrar()
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                System.out.print("["+mat[i][j]+"]");
            }
            System.out.println("");
        }
    }
}