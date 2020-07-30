package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SelectorArchivos extends JFrame implements ActionListener
{
    JFileChooser fc;
    public SelectorArchivos()
    {
        super();
        setSize(450, 400);
        setTitle("Búsqueda");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG & JPG", "png", "jpg");
        fc.setFileFilter(filter);
        fc.addActionListener(this);
        add(fc);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals(JFileChooser.CANCEL_SELECTION))
        {
            this.dispose();
        }
        
        if(ae.getActionCommand().equals(JFileChooser.APPROVE_SELECTION))
        {
           File sel = fc.getSelectedFile();
           JOptionPane.showMessageDialog(null, "Ruta: "+sel.getAbsolutePath());
        }
    }
}