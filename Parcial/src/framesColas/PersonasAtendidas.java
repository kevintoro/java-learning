/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framesColas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import metodos.TurnoAtendido;

/**
 *
 * @author OLIVO
 */
public class PersonasAtendidas extends JFrame
{
    private final DefaultTableModel dft;
    private final JTable table;
    private final JLabel labTitle;
    private final JPanel jpMain;
    private final JButton jbtnSalir;
    
    public PersonasAtendidas(Component cmpt, ArrayList<TurnoAtendido>ta)
    {
        setTitle("PERSONAS ATENDIDAS");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setResizable(false);
        setLocationRelativeTo(cmpt);
        
        jpMain = new JPanel();
        jpMain.setBackground(new Color(0, 102, 51));
        jpMain.setLayout(null);
        
        labTitle = new JLabel("PERSONAS ATENDIDAS:");
        labTitle.setBounds(200, 10, 210, 50);
        labTitle.setFont(new Font("Arial", Font.BOLD, 16));
        labTitle.setForeground(Color.WHITE);
        
        String data [][] = {{null, null, null, null}};
        String title [] = {"TURNO","NOMBRE", "IDENTIFICACIÓN", "CALIFICACIÓN"};
        
        dft = new DefaultTableModel(data, title);
        table = new JTable(dft);
        
        JScrollPane jsp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setBounds(10, 60, 575, 250);
        
        jbtnSalir = new JButton("Salir");
        jbtnSalir.addActionListener((ActionEvent ae) -> {
            dispose();
        });
        jbtnSalir.setBounds(485, 320, 100, 35);
        
        jpMain.add(labTitle);
        jpMain.add(jsp);
        jpMain.add(jbtnSalir);
        add(jpMain);
        updateTable(ta);
    }
    
    private void updateTable(ArrayList<TurnoAtendido> ta)
    {
        if(ta.size() > 0)
        {
            for(int i = 0; i< table.getRowCount();i++)
            {
                dft.removeRow(i);
            }
            
            for(TurnoAtendido t: ta)
            {
                String data[] = {t.getData(),t.getNombre(), t.getCc(), t.getValue()};
                dft.addRow(data);
            }
        }
    }
}