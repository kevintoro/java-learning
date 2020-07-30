package controlador;

import java.awt.Component;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

/**
 * 
 * @version 1.0
 */
public class FileChooser extends JFileChooser
{
    /**
     * Contructor del buscador de archivos, donde le ponemos un filtro de archivos para que 
     * sólo apruebe archivos de bases de datos access (.accdb)
     */
    public FileChooser()
    {
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de bases de datos Access", "accdb");
        setFileFilter(filtro);
    }
    
    /**
     * 
     * @param cmp componente para mostrar el mensaje
     * @return el archivo de bases de datos access (.accdb)
     */
    public File openDialog(Component cmp)
    {
        int i = showOpenDialog(cmp);
        if(i == JFileChooser.APPROVE_OPTION)
        {
            return getSelectedFile();
        }
        else
        {
            JOptionPane.showMessageDialog(cmp, "Apertura necesario", "ERROR AL ABRIR ARCHIVO", JOptionPane.ERROR_MESSAGE);
            return openDialog(cmp);
        }
    }
}