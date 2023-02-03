/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VistasJPanel.VistaMenuUsuario;

import ContenedoresJFrame.ContenedorMenuUsuario;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Daniel
 */
public class JPanelVistaMenuUsuario extends JPanel{
    ContenedorMenuUsuario menuUsuario;
    public JPanelVistaMenuUsuario(ContenedorMenuUsuario menuUsuario){
        this.menuUsuario = menuUsuario;
        this.inicializador();
        this.inicializadorObjetos();
    }

    private void inicializador() {
        this.setLayout(null);
        this.setBackground(Color.white);
    }

    private void inicializadorObjetos() {

    }
}
