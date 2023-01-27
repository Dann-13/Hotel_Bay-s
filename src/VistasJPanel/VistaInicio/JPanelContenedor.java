/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VistasJPanel.VistaInicio;

import ContenedoresJFrame.ContenedorInicio;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * JPanel Principal, este contendra a objetos como botones e incluso a otrso
 * JPanel si es necesario
 *
 * @author Daniel
 */
public class JPanelContenedor extends JPanel {

    ContenedorInicio inicio;
    JPanel jPanelIzquierdo;

    //Objetos
    JLabel labelImg, LblImgLoguin, LblPie;
    JButton btnMonedas, btnTemperatura;

    public JPanelContenedor(ContenedorInicio inicio) {
        this.inicio = inicio;
        this.inicializador();
        this.inicializadorObjetos();
    }

    private void inicializador() {
        this.setLayout(null);
    }

    private void inicializadorObjetos() {

//        Imamgen
//        importamos imagen
        labelImg = new JLabel();
        labelImg.setBounds(0, 0, 550, 431);
        ImageIcon icon = new ImageIcon("./src/Source/imageninicio.png");
        icon.setImage(icon.getImage().getScaledInstance(labelImg.getWidth(), labelImg.getHeight(), Image.SCALE_DEFAULT));
        labelImg.setIcon(icon);
        this.add(labelImg);

        LblPie = new JLabel();
        LblPie.setText("Desarrollado Por: Daniel Gomez ©");
        LblPie.setHorizontalAlignment(JLabel.CENTER);
        LblPie.setForeground(Color.white);
        LblPie.setBounds(0, 431, 800, 30);
        LblPie.setOpaque(true);
        LblPie.setBackground(new Color(99, 92, 252));
        this.add(LblPie);

        jPanelIzquierdo = new JPanel();
        jPanelIzquierdo.setLayout(null);
        jPanelIzquierdo.setBounds(550, 0, 250, 500);

        //Imagen Loguin
        LblImgLoguin = new JLabel();
        LblImgLoguin.setBounds(90, 100, 60, 60);
        ImageIcon icon2 = new ImageIcon("./src/Source/user.png");
        icon2.setImage(icon2.getImage().getScaledInstance(LblImgLoguin.getWidth(), LblImgLoguin.getHeight(), Image.SCALE_DEFAULT));
        LblImgLoguin.setIcon(icon2);
        jPanelIzquierdo.add(LblImgLoguin);
        this.add(jPanelIzquierdo);
        
   
    }
}
