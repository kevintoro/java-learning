package GenerarPdf;

import Vista.Frontend;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Component;
import java.awt.Desktop;
import java.io.*;
import javax.swing.*;
import negocio.Indices;
import negocio.ListIndex;

/**
 * @version 1.2 beta
 * @author Kevin Toro
 */
public class GenerarPdf
{
    Frontend front;
    ListIndex li;
    
    /**
     * 
     * @param front 
     */
    public GenerarPdf(Frontend front)
    {
        this.front = front;
    }
    
    public void generatePDF(Component c, char[] txt)
    {
        li = front.getListIndex();
        try
        {
            JFileChooser j = new JFileChooser();
            j.setSelectedFile(new File("Prueba.pdf"));
            int op = j.showSaveDialog(c);
            if(op == JFileChooser.APPROVE_OPTION)
            {
                if(j.getSelectedFile().exists())
                {
                    int rep = JOptionPane.showConfirmDialog(c, "archivo existente\n"
                            + "¿desea reemplazarlo?", "Reemplazar Archivo", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    
                    if(rep == JOptionPane.YES_OPTION)
                    {
                        createAndExportPDF(txt, j, c);
                    }
                    else
                    {
                        generatePDF(c, txt);
                    }
                }
                else
                {
                    createAndExportPDF(txt, j, c);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(c, "Seleccione dónde quiere guardar el archivo");
            }
        }
        catch(DocumentException | FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
    
    private void createAndExportPDF(char [] txt, JFileChooser j, Component c) throws FileNotFoundException, DocumentException
    {
        File f = j.getSelectedFile();
        FileOutputStream os = new FileOutputStream(f);
        Document d = new Document();
        PdfWriter.getInstance(d, os);
            
        Font highlight = new Font(Font.FontFamily.COURIER, 11f);
        highlight.setStyle(Font.UNDERLINE);
        highlight.setColor(255, 87, 51);
                
        Font plain = new Font(Font.FontFamily.COURIER, 11f);
                
        d.open();
        int a = 0;
        int sizeA = li.getIndex().size();
        for(int i = 0; i< txt.length;i++)
        {
            String s = String.valueOf(txt[i]);
            Phrase ph;
            if(a<sizeA)
            {
                Indices ind = li.getIndex().get(a);
                if(i>= ind.getInicio() && i<=ind.getFin())
                {
                    ph = new Phrase(s, highlight);
                    if(i == ind.getFin())
                    {
                        a++;
                    }
                }
                else
                {
                    ph = new Phrase(s, plain);
                }
            }
            else
            {
                ph = new Phrase(s, plain);
            }
            d.add(ph);
        }
        d.close();
        JOptionPane.showMessageDialog(c, "Documento guardado con éxito");
                
        int conf = JOptionPane.showConfirmDialog(c, "¿Desea abrir el documento?", "abrir PDF", JOptionPane.YES_NO_OPTION);
        if(conf == JOptionPane.YES_OPTION)
        {
            open(f);
        }
    }
    
    private void open(File f)
    {
        try
        {
            Desktop d = Desktop.getDesktop();
            d.open(f);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}