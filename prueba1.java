import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;

public class prueba1 extends JFrame  {

	private JPanel panel1;
	private JTextField caja1, caja2;	
	private static String numeroDecimal,binario,binario2, numero, binario3;
	private int a,modulo;
	private Double a1,a3,modulo2;
	private JLabel salida1, salida2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba1 frame = new prueba1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 */
	public prueba1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 477);
		panel1 = new JPanel();
		panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel1);
		panel1.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Numero Decimal");
		etiqueta1.setBounds(12, 33, 125, 15);
		panel1.add(etiqueta1);
		
		caja1 = new JTextField();
		caja1.setBounds(139, 31, 79, 19);
		panel1.add(caja1);
		caja1.setColumns(10);
		
		JLabel etiqueta3 = new JLabel(".");
		etiqueta3.setBounds(219, 33, 15, 15);
		panel1.add(etiqueta3);
		
		caja2 = new JTextField();
		caja2.setBounds(234, 31, 79, 19);
		panel1.add(caja2);
		caja2.setColumns(10);
		
		JButton boton1 = new JButton("Convertir ");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			numeroDecimal = caja1.getText();
			numero = caja2.getText();
			if (isNumerico(numeroDecimal)){
				actionBinary();
			}				
			}
		});
		boton1.setBounds(325, 28, 117, 25);
		panel1.add(boton1);
		
		JLabel etiqueta2 = new JLabel("Numero Binario");
		etiqueta2.setBounds(12, 60, 115, 15);
		panel1.add(etiqueta2);
		
		salida1 = new JLabel("");
		salida1.setBounds(139, 60, 79, 15);
		panel1.add(salida1);
		
		JLabel etiqueta4 = new JLabel(".");
		etiqueta4.setBounds(219, 60, 15, 15);
		panel1.add(etiqueta4);
		
		salida2 = new JLabel("");
		salida2.setBounds(244, 60, 70, 15);
		panel1.add(salida2);
		
		JButton boton2 = new JButton("Salir");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		boton2.setBounds(163, 135, 117, 25);		
		panel1.add(boton2);

		JButton botonBorrar = new JButton("Borrar");
		botonBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = caja2.getText();
				clearTxtField();
			}
		});
		botonBorrar.setBounds(325, 55, 117, 25);
		panel1.add(botonBorrar);

	}
//metodos
	public void actionBinary() {  	       
     	String binario = "";
     	int a = Integer.parseInt(numeroDecimal);
     	double a1 = Double.parseDouble(numero);     
     	while (a > 0){
     		modulo = (a%2);
     		binario = modulo + binario;
     		a = a/2;
     	}     	
	    //salida1.setText(binario);     		    
	    salida1.setText(binario);
	    JOptionPane.showMessageDialog(null, "El numero binario es " + binario);

     }

     public void clearTxtField() {      
     	double a1 = Double.parseDouble(numero);
     	binario2 = "";     	

     	while(a1 == 0 ){
     	double modulo2 = Math.abs(a1) * 2;
     	int a2 = (int) modulo2;
     		int a2 = 1;
     		modulo2 = 1.0;
     	binario2 = a2 + binario2;
     	a1 = a2 - modulo2;
     }

     	JOptionPane.showMessageDialog(null, binario2);
		//caja1.setText("");
		//salida1.setText("");
		/*texto2.setText("");
		texto3.setText("");
		salida1.setText("");
		salida2.setText("");
		salida3.setText("");
		salida4.setText("");*/
	}

	public static Boolean isNumerico(String caja1){
	  	try {	  	
      	int a = Integer.parseInt(numeroDecimal);
      	if (a <= 0 ){
      	return true;      		
      	}
      }
      catch(NumberFormatException nfe){
        	JOptionPane.showMessageDialog(null, "Debes agregar un numero a la caja de texto");
      	    return false;
        }
        return true;
      }

}
