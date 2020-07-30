import javax.swing.JOptionPane;
public class Limit
{
    int L, R;
    
    public void Inicio()
    {
        int x=0;
        L = Integer.parseInt(JOptionPane.showInputDialog("Digite Límite L"));
        while(L < 0 || L > 1000)
        {
            JOptionPane.showMessageDialog(null, "Digito Fuera Del Rango", "Error", JOptionPane.WARNING_MESSAGE);
            L = Integer.parseInt(JOptionPane.showInputDialog("Digite Límite L"));
        }
        
        R = Integer.parseInt(JOptionPane.showInputDialog("Digite Límite R"));
        while(R < 0 || R >1000)
        {
            JOptionPane.showMessageDialog(null, "Digito Fuera Del Rango", "Error", JOptionPane.WARNING_MESSAGE);
            R = Integer.parseInt(JOptionPane.showInputDialog("Digite Límite R"));
        }
        
        for(int i=L;i<=R;i++)
        {
            int y=0;
            
            for(int j=1;j<=L;j++)
            {
                if(L%j==0)
                {
                    x++;
                }
            }
            
            if(y<3)
            {
                
            }
        }
    }
}