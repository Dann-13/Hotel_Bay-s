/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VistasJPanel.VistaLoguin;

import ContenedoresJFrame.ContenedorLogin;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * jPanel contenedor de la vista login Estaran 2 jpanel mas
 *
 * @author Daniel
 */
public class jPanelVistaLoginContenedor extends JPanel {

    JLabel LblImgPanelDerecho, lblBienvenido;
    private static Font customFont;

    long startTime = System.currentTimeMillis();

    ContenedorLogin login;
    JPanel panelIzquierdo, jPanelDerecho;

    public jPanelVistaLoginContenedor(ContenedorLogin login) throws FontFormatException, IOException {
        this.login = login;
        this.inicializador();
        this.inicializadorObjetos();
    }

    private void inicializador() {
        this.setLayout(null);
    }

    private void inicializadorObjetos() throws FontFormatException, IOException {
        if (customFont == null) {
            loadFont();
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            System.out.println("El tiempo de ejecución de loadFont() fue de " + duration + " milisegundos.");
        }

//        //Cargamos Fuente Personlizada 
//        Font font = Font.createFont(Font.TRUETYPE_FONT, new File("./src/Source/Font/TypoGraphica.otf"));
//        // Establecer la fuente personalizada como la fuente predeterminada
//        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        ge.registerFont(font);
        //Panel Derecho
        jPanelDerecho = new JPanel();
        jPanelDerecho.setLayout(null);
        jPanelDerecho.setBounds(500, 0, 300, 500);
        jPanelDerecho.setBackground(new Color(52, 43, 255));

        LblImgPanelDerecho = new JLabel();
        LblImgPanelDerecho.setBounds(7, 150, 280, 280);
        ImageIcon icon1 = new ImageIcon("./src/Source/imgHotel.png");
        icon1.setImage(icon1.getImage().getScaledInstance(LblImgPanelDerecho.getWidth(), LblImgPanelDerecho.getHeight(), Image.SCALE_DEFAULT));
        LblImgPanelDerecho.setIcon(icon1);
        //Agreamos la imagen al panel derecho
        jPanelDerecho.add(LblImgPanelDerecho);
        //Label Bienvenido
        lblBienvenido = new JLabel();
        lblBienvenido.setBounds(80, 120, 150, 50);
        lblBienvenido.setText("Bienvenido");
        lblBienvenido.setForeground(Color.WHITE);
        //lblBienvenido.setFont(font.deriveFont(Font.PLAIN, 25));
        lblBienvenido.setFont(customFont.deriveFont(24f));
        
        jPanelDerecho.add(lblBienvenido);
        //Aqui agrgamos el panel
        this.add(jPanelDerecho);

    }

    private static void loadFont() {
        try {
            // Crea un nuevo objeto de tipo InputStream para leer la fuente desde un archivo
            InputStream is = new BufferedInputStream(new FileInputStream("./src/Source/Font/TypoGraphica.otf"));
            // Crea una nueva fuente a partir del InputStream
            customFont = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
