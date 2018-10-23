/**
 * @(#) MetodoArea.java
 *
 * @Descripción Realiza Métodos
 * @author Adriana Vega
 * @version 1.00 2014/12/1
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MétodoArea extends JFrame 
    implements ActionListener {

    private JButton boton;
    private JPanel panel;

    public static void main(String[] args) {
        MétodoArea marco = new MétodoArea();
        marco.setSize(400, 300);
        marco.crearGUI();
        marco.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout() );

	panel = new JPanel();
	panel.setPreferredSize(new Dimension(300, 200));
	panel.setBackground(Color.white);
	ventana.add(panel);

	boton = new JButton("Haga clic");
	ventana.add(boton);
	boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
    	Graphics papel = panel.getGraphics();
    	dibujarLogo(papel, 10, 20);
    	dibujarLogo(papel, 100, 100);
	    //variable para el metodo
        int a;
        //variables para caja de mensaje entrada
        String cLongitud, cAnchura;

        //variables para asignar los valores de las cajas de mensaje
        int iLongitud, iAnchura;

        // Caja de mensaje de entrada de datos
        cLongitud = JOptionPane.showInputDialog("introduce Longitud");
        cAnchura  = JOptionPane.showInputDialog("introduce Anchura");

        // Convertir valores de entrada a numericas
        iLongitud = Integer.parseInt(cLongitud);
        iAnchura  = Integer.parseInt(cAnchura);

	a = areaRectangulo(iLongitud, iAnchura);
	JOptionPane.showMessageDialog(null, "El área es: " + a);	
   }	

    private int areaRectangulo(int longitud, int anchura) {
	int area;
	area = longitud * anchura;
	return area;
    }
    private void dibujarLogo(Graphics areaDibujo,
		int xPos, int yPos) {
		areaDibujo.drawRect(xPos, yPos, 60, 60);
		areaDibujo.drawRect(xPos, yPos, 40, 40);
		areaDibujo.drawRect(xPos, yPos, 20, 20);
	}
}




