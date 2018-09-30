/*
Programa: Cancha.java
Autor:    Lopez Castillo Saul Filiberto
Fecha:    19/09/2018
***/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cancha extends JFrame 
    implements ActionListener {

    private JButton boton,boton2,boton3;
    private JPanel panel;


    public static void main(String[] args) {
        Cancha marco = new Cancha ();
        marco.setSize(800,600);
        marco.crearGUI();
        marco.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());

	panel = new JPanel();
	panel.setPreferredSize(new Dimension(800, 600));

	panel.setBackground(new java.awt.Color(104, 179, 69));
	ventana.add(panel);

	boton = new JButton("AÃ±adir campo");
	ventana.add(boton);
	boton.addActionListener(this);

    boton2 = new JButton("AÃ±adir jugadores");
    ventana.add(boton2);
    boton2.addActionListener(this);

    boton3 = new JButton("Salir");
    ventana.add(boton3);
    boton3.addActionListener(this);
         
    }

    public void actionPerformed(ActionEvent event) {
        Object evento = event.getSource();
        Graphics campo = panel.getGraphics();

        if (evento == boton){
        campo.setColor(Color.white);
        campo.drawLine(403, 3, 403, 597);
        //Porteria
        campo.drawLine(98, 150, -30, 150);
        campo.drawLine(98,150,98,450);
        campo.drawLine(98,450,-30,450); 
        campo.drawOval(250, 155, 300, 300);
        //Porteria2
        campo.drawLine(702,150,800,150);
        campo.drawLine(702,150,702,450);
        campo.drawLine(702,450,800,450);
        campo.setColor (Color.black);
        //texto
        campo.drawString("America",150,20);
        campo.drawString("Puma",600,20);
        }

        if ( evento == boton2) {
            Color colorAmerica = new Color(176, 189, 27);
            
            campo.setColor(colorAmerica);
            //jugador 1
            campo.fillOval(100, 260, 20, 20);

            campo.fillOval(100, 360, 20, 20);
            //jugador 2 
            campo.fillOval(260, 90, 20, 20);

            campo.fillOval(260, 180, 20, 20);

            campo.fillOval(260, 270, 20, 20);

            campo.fillOval(260, 360, 20, 20);

            campo.fillOval(260, 495, 20, 20);

            //jugadores 3

            Color colorPumas = new Color (17, 40, 111);
            campo.setColor(colorPumas);

            campo.fillOval(650, 260, 20, 20);

            campo.fillOval(650, 360, 20, 20);

            //jugadores 4
            campo.fillOval(450, 90, 20, 20);

            campo.fillOval(450, 180, 20, 20);

            campo.fillOval(450, 270, 20, 20);

            campo.fillOval(450, 360, 20, 20);

            campo.fillOval(450, 495, 20, 20);
        }
        if ( evento == boton3){
            System.exit(0);
            
        }

        
   }
}
