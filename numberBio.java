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
   import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import java.lang.Math;

	public class numberBio extends JFrame 
	     {

	    //Variables
	    private JPanel panel1;
	    private JTextField caja1, caja2, caja3;	
	    private static String numeroDecimal,binario,binario2, numero, binario3, sueldo;
	    private int a,b,modulo;
	    private Double a1,a3,modulo2,total;
	    private JLabel salida1, salida2;
	    
	    
	   
	    public static void main(String[] args) {
	    	numberBio marco = new numberBio();
	        marco.setSize(1000, 800);
	        marco.crearGUI();
	        marco.setVisible(true);	     
	    }

	    private void crearGUI() {
	        //setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setBounds(100, 100, 510, 477);
	        Container ventana = getContentPane();

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
			if (isNumerico(numeroDecimal, sueldo)){
				actionBinary(numeroDecimal);
				actionBinaryDecimal(numero);
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

		JLabel etiqueta5 = new JLabel("Sueldo");
		etiqueta5.setBounds(12,99,90,15);
		panel1.add(etiqueta5);

		caja3 = new  JTextField();
		caja3.setBounds(139, 99, 90, 15);
		panel1.add(caja3);
		caja3.setColumns(10);

		JButton boton3 = new JButton("Calcular Nomina");
		boton3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sueldo = caja3.getText();
				if (isNumerico(numeroDecimal, sueldo)){
				    actionNomina(sueldo);	
				}
				
			}
		});
		boton3.setBounds(12,250,117,25);
		panel1.add(boton3);

		
		JButton boton2 = new JButton("Salir");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		boton2.setBounds(244, 135, 117, 25);		
		panel1.add(boton2);

		JButton botonBorrar = new JButton("Borrar");
		botonBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearTxtField();
				
			}
		});
		botonBorrar.setBounds(325, 55, 117, 25);
		panel1.add(botonBorrar);

        
	    }


								    
			   
      //metodos
      public static Boolean isNumerico(String caja1, String caja3){
	  	try {	  	
      	int a = Integer.parseInt(numeroDecimal);
      	if (a <= 0 && a >= 0 ){
      	return true;      		
      	}
      }
      catch(NumberFormatException nfe){
        	JOptionPane.showMessageDialog(null, "Debes agregar un numero a la caja de texto");
      	    return false;
        }
        return true;
      }

public void actionBinary(String caja1) {  	       
     	String binario = "";
     	int a = Integer.parseInt(numeroDecimal);
     	//double a1 = Double.parseDouble(numero);
     if ( a >= 0 ){

     	while (a > 0){
     		modulo = (a%2);
     		binario = modulo + binario;
     		a = a/2;
     	}     	
     }
     else{ 
     	while(Math.abs(a)> 0 ){
     		modulo = (Math.abs(a)%2);
     		binario = modulo + binario;
     		a = a/2;
     	}
     	binario= "-" + binario;

     }
	    //salida1.setText(binario);     		    
	    
	    JOptionPane.showMessageDialog(null, "El numero binario es " + binario);

     }

public void actionBinaryDecimal(String caja2){
	String binary= "";
	int b = Integer.parseInt(numero);
	double primerNumero = b * 2;
	while(primerNumero != b && primerNumero != 1)
	{
		Int prueba = (int) primerNumero;
		binary = prueba + binary;
		int c = primerNumero - prueba;
		primerNumero = c;
		primerNumero *= 2;
	}
}  

public void actionNomina(String caja3){
	double b = Double.parseDouble(sueldo);
	double impuesto = (6*b)/100;
	double seguro = (3.2*b)/100;
	double sueldoNeto = b -(impuesto + seguro);

	int comedor = 50*(5);
	double transporte = ((35*sueldoNeto)/100)*6;

	double vales = (15*b)/100;
	total = sueldoNeto + comedor+ transporte+ vales;

	JOptionPane.showMessageDialog(null,"Total de tu sueldo es " + Math.ceil(total));	
}

      public void clearTxtField() {      
      	caja1.setText("");
      	caja2.setText("");
		/*salida1.setText("");
		texto2.setText("");
		texto3.setText("");
		salida1.setText("");
		salida2.setText("");
		salida3.setText("");
		salida4.setText("");		*/
	}


}