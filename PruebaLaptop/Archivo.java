import java.awt.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Archivo
{
    public Archivo()
    {
    }
    
    public static String leerGrafico(Component cmpnt) throws NullPointerException{

        File f;
        javax.swing.JFileChooser j = new javax.swing.JFileChooser();
        j.showOpenDialog(j);
            String path = j.getSelectedFile().getAbsolutePath();
            String lectura = "";
            f = new File(path);
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String aux;
                while ((aux = br.readLine()) != null) {
                    lectura = lectura + aux + "\n";
                }
                JOptionPane.showMessageDialog(cmpnt, "Archivo cargado con éxito");
            } catch (IOException e)
            {
                System.out.println(e);
            }
            return lectura;
    }
}