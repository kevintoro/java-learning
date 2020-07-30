import javax.swing.JOptionPane;

public class Matrices 
{
    int ne = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Filas x Columnas"));
    int matriz [][];
    
    public Matrices()
    {
        matriz = new int [ne][ne];
    }
    
    public void llenarMatriz()
    {
        String op = JOptionPane.showInputDialog("¿Prefiere llenarla Manual?¿o aleatorio? ");
        
        if(op.equals("manual"))
        {
            for(int i = 0;i<matriz.length;i++)
            {
                for(int j = 0;j<matriz.length;j++)
                {
                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Valores Para: ["+(i+1)+"]["+(j+1)+"]"));
                }
            }
        }
        else
        {
            if(op.equals("aleatorio"))
            {
                for(int i=0;i<matriz.length;i++)
                {
                    for(int j = 0;j<matriz.length;j++)
                    {
                        matriz[i][j] = (int) (Math.random()*100+1);
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Digite palabras válidas\n"+"(manual, aleatorio)","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void imprimirMatriz()
    {
        for(int i = 0;i<matriz.length;i++)
        {
            for(int j=0;j<matriz.length;j++)
            {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
    }
    
    public void modificarNumero(int fila, int columna)
    {
        System.out.println();
        for(int i = 0;i<matriz.length;i++)
        {
            if(i==(fila-1))
            {
                for(int j=0;j<matriz.length;j++)
                {
                    if(j == (columna-1))
                    {
                        matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Valor para ["+(i+1)+"]["+(j+1)+"]"));
                    }
                }
            }
        }
    }
}