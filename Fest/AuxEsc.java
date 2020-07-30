import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AuxEsc extends JFrame implements ActionListener
{
    JTextField patrocinador, dinero;
    JButton aceptar, imprBandas, aggBanda, elimBanda, ordNombre, ordFans, ordCancion, editar;
    Escenario stage;
    
    public AuxEsc()
    {
        setTitle("Escenario");
        setLayout(new GridLayout(6, 2));
        setSize(400, 200);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        patrocinador = new JTextField();
        patrocinador.setForeground(Color.BLUE);
        dinero = new JTextField();
        dinero.setForeground(Color.BLUE);
        
        aceptar = new JButton("Aceptar");
        aceptar.addActionListener(this);
        
        imprBandas = new JButton("Lista de Bandas");
        imprBandas.addActionListener(this);
        imprBandas.setEnabled(false);
        
        aggBanda = new JButton("Agregar Banda");
        aggBanda.addActionListener(this);
        aggBanda.setEnabled(false);
        
        elimBanda = new JButton("Eliminar Banda");
        elimBanda.addActionListener(this);
        elimBanda.setEnabled(false);
        
        ordNombre = new JButton("Impr. Orden Por Nombre");
        ordNombre.addActionListener(this);
        ordNombre.setEnabled(false);
        
        ordFans = new JButton("Impr. Orden por Fans");
        ordFans.addActionListener(this);
        ordFans.setEnabled(false);
        
        ordCancion = new JButton("Impr. Orden Por Canciones");
        ordCancion.addActionListener(this);
        ordCancion.setEnabled(false);
        
        editar = new JButton("Editar Info.");
        editar.addActionListener(this);
        editar.setEnabled(false);
        
        add(new JLabel("    Patrocinador: "));
        add(patrocinador);
        add(new JLabel("    Presupuesto: "));
        add(dinero);
        add(imprBandas);
        add(aceptar);
        add(imprBandas);
        add(aggBanda);
        add(elimBanda);
        add(ordNombre);
        add(ordFans);
        add(ordCancion);
        add(editar);
        
        stage = new Escenario(0, "");
    }
    
    public void setCampos(String value, String patrocinador)
    {
        dinero.setText(String.valueOf(value));
        this.patrocinador.setText(patrocinador);
    }
    
    public Escenario getEscenario()
    {
        return stage;
    }
    
    public void actPrim(boolean order)
    {
        aceptar.setEnabled(order);
    }
    
    public void actSec(boolean order)
    {
        imprBandas.setEnabled(order);
        aggBanda.setEnabled(order);
        elimBanda.setEnabled(order);
        ordNombre.setEnabled(order);
        ordFans.setEnabled(order);
        ordCancion.setEnabled(order);
        editar.setEnabled(order);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == aceptar)
        {
            try
            {
                setVisible(false);
                int check = Integer.parseInt(dinero.getText());
                if(dinero.getText().isEmpty() || check < 1)
                {
                    JOptionPane.showMessageDialog(null, "Escenario Incompleto, No Se Ha Agregado","Error",JOptionPane.ERROR_MESSAGE);
                    patrocinador.setText("");
                }
                else
                {
                    patrocinador.setEditable(false);
                    dinero.setEditable(false);
                    actPrim(false);
                    actSec(true);
                }
                stage.setPatrocinador(patrocinador.getText());
                stage.setPresupuesto(Integer.parseInt(dinero.getText()));
            }
            catch(HeadlessException | NumberFormatException excep)
            {
                String error = excep.getMessage();
                JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(e.getSource() == imprBandas)
        {
            if(stage.getTamaño()>0)
            {
                stage.getListaBandas();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No Hay Bandas Agregadas","¡Atención!",JOptionPane.WARNING_MESSAGE);
            }
        }
        
        if(e.getSource() == aggBanda)
        {
            try
            {
                String nombre = "";
                int afirm = JOptionPane.NO_OPTION;
                do
                {
                    nombre = JOptionPane.showInputDialog("Nombre De La Banda: ");
                    afirm = JOptionPane.showConfirmDialog(null, "¿Guardar la banda: "+nombre+" ?","Revisión", JOptionPane.YES_NO_OPTION);
                }
                while(afirm == JOptionPane.NO_OPTION && nombre == null);
                long numFans = Long.parseLong(JOptionPane.showInputDialog("Número De Fans: "));
                int numCanciones = Integer.parseInt(JOptionPane.showInputDialog("Número de Canciones En Participación: "));
                long costo = Long.parseLong(JOptionPane.showInputDialog("Costo por Participación: "));
                Banda band = new Banda(nombre, numFans, numCanciones, costo);
                stage.agregBanda(band);
                dinero.setText(String.valueOf(stage.getPresupuesto()));
            }
            catch(HeadlessException | NumberFormatException exc)
            {
                String error = exc.getMessage();
                JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        
        if(e.getSource() == elimBanda)
        {
            if(stage.getTamaño()>0)
            {
                String nombre = JOptionPane.showInputDialog("Nombre de La Banda a Eliminar: ");
                stage.eliminarBanda(nombre);
                JOptionPane.showMessageDialog(null, "Banda Eliminada");
                dinero.setText(String.valueOf(stage.getPresupuesto()));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No Hay Bandas Agregadas","¡Atención!",JOptionPane.WARNING_MESSAGE);
            }
        }
        
        if(e.getSource() == ordNombre)
        {
            System.out.println("---- // Orden Por Nombre: \\ ----");
            stage.ordenarPorNombre();
        }
        
        if(e.getSource() == ordFans)
        {
            System.out.println("---- // Orden Por Número de Fans: \\ ----");
            stage.ordenarPorFans();
        }
        
        if(e.getSource() == ordCancion)
        {
            System.out.println("---- // Orden Por Número de Canciones en Presentación: \\ ----");
            stage.ordenarPorCanciones();
        }
        
        if(e.getSource() == editar)
        {
            dinero.setEditable(true);
            patrocinador.setEditable(true);
            actPrim(true);
            actSec(false);
        }
        
        if(stage.getPresupuesto() == 0)
        {
            JOptionPane.showMessageDialog(null, "Presupuesto de Escenario Agotado","¡Alerta!",JOptionPane.WARNING_MESSAGE);
            aggBanda.setEnabled(false);
        }
    }
}