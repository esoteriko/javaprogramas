
/*Bibliotecas*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class EjemploModificaDibujo extends JFrame 
    implements ActionListener {

    private JButton boton;
    private JPanel panel;

    public static void main(String[] args) {
    	EjemploModificaDibujo marco = new EjemploModificaDibujo();
        marco.setSize(800, 800);
        marco.crearGUI();
        marco.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout() );

	panel = new JPanel();
	panel.setPreferredSize(new Dimension(600, 600));
	panel.setBackground(Color.red);
	ventana.add(panel);

	boton = new JButton("Haga clic");
	ventana.add(boton);
	boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        Graphics papel = panel.getGraphics();
	papel.drawLine(0, 0, 100, 100);
	papel.setColor(Color.CYAN);
	papel.fill3DRect(35, 35, 100, 100, true);
	papel.draw3DRect(35, 35, 100, 100, true);
	papel.setColor(Color.GREEN);
	papel.fillRoundRect(170, 170, 350, 350, 350, 350);
	papel.setColor(Color.blue);
	papel.drawOval(2, 2, 10, 20);
	papel.fillOval(2, 2, 10, 20);
	
    }	
}
