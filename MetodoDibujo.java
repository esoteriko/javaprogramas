/***:
*Programa: MetodoDibujo.java
*Autor:    Adriana Vega Palos
*Fecha:    Tema 4 MANEJO DE VARIABLES
*Descripcion: Inicia POO Manejo de objetos y eventos
*
***/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MetodoDibujo extends JFrame 
    implements ActionListener {

    private JButton boton;
    private JPanel panel;
    private JLabel etiqueta;

    public static void main(String[] args) {
        MetodoDibujo  marco = new MetodoDibujo ();
        marco.setSize(400, 300);
        marco.crearGUI();
        marco.setVisible(true);
        marco.setTitle("Metodo ");
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout() );

	panel = new JPanel();
	panel.setPreferredSize(new Dimension(300, 200));
	panel.setBackground(Color.white);
	ventana.add(panel);
	
	etiqueta = new JLabel("Consultores Tecno Inc.");
	etiqueta.setFont(new Font("Serif", Font.BOLD, 24)); 
	ventana.add(etiqueta);
    panel.add(etiqueta);

	boton = new JButton("Haga clic");
	ventana.add(boton);
	boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
	Graphics papel = panel.getGraphics();
	dibujarLogo(papel, 10, 20);
	dibujarLogo(papel, 100, 100);
    }	

    private void dibujarLogo(Graphics areaDibujo,
			     int xPos, int yPos) {
	areaDibujo.drawRect(xPos, yPos, 60, 60);
	areaDibujo.drawRect(xPos, yPos, 40, 40);
	areaDibujo.drawRect(xPos, yPos, 20, 20);
    }

}