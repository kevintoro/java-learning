package Interfaz;

import javax.swing.*;

public class PanelCentral extends JPanel
{
    Main main;
    SubPanelListado spListado;
    SubPanelDetalles spDetalles;
    SubPanelBotonesLista spBotLista;
    SubPanelBotonesFuncion spBotFuncion;
    
    public PanelCentral(Main main)
    {
        setLayout(null);
        this.main = main;
        spListado = new SubPanelListado(main.vVehiculos);
        spListado.setBounds(10, 0, 340, 330);
        add(spListado);
        
        spDetalles = new SubPanelDetalles();
        spDetalles.setBounds(350, 0, 545, 330);
        add(spDetalles);
        
        spBotLista = new SubPanelBotonesLista(main.vVehiculos);
        spBotLista.setBounds(10, 340, 340, 80);
        add(spBotLista);
        
        spBotFuncion = new SubPanelBotonesFuncion(main.vVehiculos);
        spBotFuncion.setBounds(350, 340, 545, 80);
        add(spBotFuncion);
    }
}