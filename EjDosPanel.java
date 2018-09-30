/*Bibliotecas*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class EjDosPanel extends JFrame 
    implements ActionListener {

    private JButton boton;
    private JPanel panel1,panel2;
    private JTextField caja; 
    

    public static void main(String[] args) {
    	EjDosPanel marco = new EjDosPanel();
        marco.setSize(1000, 800);
        marco.crearGUI();
        marco.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout() );

	panel1 = new JPanel();
	panel1.setPreferredSize(new Dimension(200, 200));
	panel1.setBackground(Color.red);
	ventana.add(panel1);


	panel2 = new JPanel(new BorderLayout());
	panel2.setPreferredSize(new Dimension(200, 200));
	panel2.setBackground(Color.blue);
	ventana.add(panel2);

	JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar"); 
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);



	/*boton = new JButton("Haga clic");
	ventana.add(boton);
	boton.addActionListener(this);*/



	
    }

    public void actionPerformed(ActionEvent event) {
    Graphics papel1 = panel1.getGraphics();
	Graphics papel2 = panel2.getGraphics();
	papel1.drawLine(0, 0, 100, 100);
	papel1.setColor(Color.CYAN);
	papel1.fill3DRect(35, 35, 100, 100, true);
	/*papel2.draw3DRect(35, 35, 100, 100, true);
	papel2.setColor(Color.GREEN);
	papel2.fillRoundRect(170, 170, 350, 350, 350, 350);
	papel2.setColor(Color.white);
	papel2.drawOval(2, 2, 10, 20);
	papel2.fillOval(2, 2, 10, 20);*/
	
    }	
}
