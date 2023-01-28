/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContenedoresJFrame;

import VistasJPanel.VistaLoguin.jPanelVistaLogin;
import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class ContenedorLogin extends JFrame {
    jPanelVistaLogin jpanelVistaLogin;
    public ContenedorLogin() {
        this.inicializador();
        this.inicializadorObjetos();
    }

    private void inicializador() {
        this.setSize(400, 400);
        this.setTitle("Loguin");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void inicializadorObjetos() {
        jpanelVistaLogin = new jPanelVistaLogin();
        this.getContentPane().add(jpanelVistaLogin);

    }
}
