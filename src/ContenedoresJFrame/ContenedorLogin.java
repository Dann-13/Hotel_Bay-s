/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContenedoresJFrame;

import VistasJPanel.VistaLoguin.jPanelVistaLoginContenedor;
import java.awt.FontFormatException;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class ContenedorLogin extends JFrame {
    jPanelVistaLoginContenedor jpanelVistaLogin;
    public ContenedorLogin() throws FontFormatException, IOException {
        this.inicializador();
        this.inicializadorObjetos();
    }

    private void inicializador() {
        this.setSize(800, 500);
        this.setTitle("Login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void inicializadorObjetos() throws FontFormatException, IOException {
        jpanelVistaLogin = new jPanelVistaLoginContenedor(this);
        this.getContentPane().add(jpanelVistaLogin);

    }
}
