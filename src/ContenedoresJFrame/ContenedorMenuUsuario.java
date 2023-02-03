/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContenedoresJFrame;

import VistasJPanel.VistaMenuUsuario.JPanelVistaMenuUsuario;
import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class ContenedorMenuUsuario extends JFrame {
    JPanelVistaMenuUsuario jpanelMenuUsuario;
    
    public ContenedorMenuUsuario(){
        this.inicializador();
        this.inicializadorObjetos();
    }

    private void inicializador() {
        this.setSize(800,500); //Alto y ancho de nuestro frame
        this.setTitle("Menu de Usuario");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void inicializadorObjetos() {
        jpanelMenuUsuario = new JPanelVistaMenuUsuario(this);
        this.getContentPane().add(jpanelMenuUsuario);
    }
}
