import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Imc extends JFrame 
    implements ActionListener{

	private JButton boton;
    private JPanel panel1,panel2;
    private JTextField texto; 
    private JLabel etiqueta;
    
    public static void main(String[] args){

    	Imc marco = new Imc();
    	marco.setSize(1000,800);
    	marco.crearFU();
    	marco.setVisible(true);
    }

    private void crearFU(){
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	Container ventana = getContentPane();
    	ventana.setLayout(new FlowLayout() );

    	panel1 = new JPanel();
    	panel2 = new JPanel(new BorderLayout());
    	etiqueta = new JLabel("Nombre: ");
    	boton = new JButton("Saludar"); 

    	panel1.setPreferredSize(new Dimension(500, 500));
    	panel1.setBackground(Color.green);
    	
    	panel2.setPreferredSize(new Dimension(200, 200));
    	panel2.setBackground(Color.green);
    	ventana.add(panel1);
    	ventana.add(panel2);
    	panel1.add(etiqueta);
    	panel1.add(texto);
    	panel1.add(boton);

    }


}