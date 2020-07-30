package Leertxt;

import java.awt.Component;
import java.io.*;
import javax.swing.JOptionPane;

public class Archivos
{
    public String leerTxt(String direccion) {
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {       //Hacer el ciclo mientras bfRead tiene caracteres         
                temp = temp + bfRead;                        //Hemos guardado el texto del archivo
            }
            texto = temp;
        } catch (Exception e) {
            System.err.println("No se encontro archivo");
        }
        return texto;
    }

    public String leerGrafico(Component cmpnt) throws NullPointerException{

        File f;
        javax.swing.JFileChooser j = new javax.swing.JFileChooser();
        j.showOpenDialog(cmpnt);
        String path = j.getSelectedFile().getAbsolutePath();
        String lectura = "";
        f = new File(path);
        try
        {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String aux;
            while ((aux = br.readLine()) != null)
            {
                lectura = lectura + aux + "\n";
            }
            JOptionPane.showMessageDialog(cmpnt, "Archivo cargado con éxito");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        return lectura;
    }
}