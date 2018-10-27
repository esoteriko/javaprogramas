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

public class prueba1 extends JFrame  {

	private JPanel panel1;
	private JTextField caja1;
	private JTextField caja2;
	private String numeroDecimal,binario;
	private int a, modulo;

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
				actionBinary();
			}
		});
		boton1.setBounds(325, 28, 117, 25);
		panel1.add(boton1);
		
		JLabel etiqueta2 = new JLabel("Numero Binario");
		etiqueta2.setBounds(12, 60, 115, 15);
		panel1.add(etiqueta2);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(139, 60, 79, 15);
		panel1.add(label_1);
		
		JLabel etiqueta4 = new JLabel(".");
		etiqueta4.setBounds(219, 60, 15, 15);
		panel1.add(etiqueta4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(244, 60, 70, 15);
		panel1.add(lblNewLabel);
		
		JButton boton2 = new JButton("Salir");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		boton2.setBounds(163, 135, 117, 25);		
		panel1.add(boton2);




	}

	public void actionBinary() {
     	numeroDecimal = caja1.getText();
     	String binario = "";
     	int a = Integer.parseInt(numeroDecimal);     
     	while (a > 0){
     		modulo = (a%2);
     		binario = modulo + binario;
     		a = a/2;
     	}
	    //salida1.setText(binario);     	
	    JOptionPane.showMessageDialog(null, "El numero binario es " + binario);
     }

}
