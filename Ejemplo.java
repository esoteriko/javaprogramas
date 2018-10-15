   import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class Ejemplo extends JFrame 
	    implements ActionListener {

	    //Variables
	    private JButton botonDeAccion,botonDeSalir, botonDeTabla, botonDeBorrar;
	    private JPanel panelDeSalida,panelDeEntrada,panel1, panel2, panel3, panel4, panel5, panel6;
	    private JTextField texto1, texto2,texto3; 
	    private JLabel etiqueta1,etiqueta2,etiqueta3, etiqueta1A, etiqueta2A,salida1, salida2, salida3,p,p2,p3;
	    private GridLayout gl,gl1, gl2, gl3;
	    private String peso,estatura,nombre;
	    private Double total,a,a1;
	    
	    
	   
	    public static void main(String[] args) {
	    	Ejemplo marco = new Ejemplo();
	        marco.setSize(1000, 800);
	        marco.crearPA();
	        marco.setVisible(true);	     
	    }

	    private void crearPA() {
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        Container ventana = getContentPane();
	        ventana.setLayout(new FlowLayout() );
	           
	        //Panel 1
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(250, 50));
        panel1.setBackground(new java.awt.Color( 110, 125, 172 ));
    
        gl = new GridLayout(1,2);
        panel1.setLayout(gl);
        
       
        p3 = new JLabel("Nombre:");
        panel1.add(p3);

        salida3 = new JLabel();
        panel1.add(salida3);


             //Panel 2
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(250, 50));
        panel2.setBackground(new java.awt.Color(110,125,172));

        gl1 = new GridLayout(2,2);
        panel1.setLayout(gl1);
        gl1.setHgap(0); gl1.setVgap(5);
        panel2.setLayout(gl1);

        etiqueta3 = new JLabel("Nombre:");
	    panel2.add(etiqueta3);

		texto1 = new JTextField(10);
	    panel2.add(texto1);

	    etiqueta1 = new JLabel("Peso: ");
		panel2.add(etiqueta1);
		
		texto2 = new JTextField(10);
		panel2.add(texto2);

		     //Panel 3
		panel3 = new JPanel();
		panel3.setPreferredSize(new Dimension(250,50));
		panel3.setBackground(new java.awt.Color(110,125,172));

		gl2 = new GridLayout(2,2);
        gl2.setHgap(0); gl2.setVgap(5);
		panel3.setLayout(gl2);

		etiqueta2 = new JLabel("Estatura: ");
		panel3.add(etiqueta2);
			    
	    texto3 = new JTextField(10);
	    panel3.add(texto3);

	    botonDeAccion = new JButton("Calcular");
	    botonDeAccion.addActionListener(this);
	    panel3.add(botonDeAccion);


	        //Panel 4
	    panel4 = new JPanel();
        panel4.setPreferredSize(new Dimension(250, 50));
        panel4.setBackground(new java.awt.Color(110,125,172));

        gl3 = new GridLayout(1,2);
        panel4.setLayout(gl3);

        p = new JLabel("IMC:");
        panel4.add(p);

        salida1 = new JLabel();
        panel4.add(salida1);

            //Pnel 5
        panel5 = new JPanel();
        panel5.setPreferredSize(new Dimension(250, 50));
        panel5.setBackground(new java.awt.Color(110,125,172));

        panel5.setLayout(gl3);

        p2 = new JLabel("Nivel de peso:");
        panel5.add(p2);

        salida2 = new JLabel();
        panel5.add(salida2);
        
            //panel 6
        panel6 = new JPanel();
        panel6.setPreferredSize(new Dimension(300,225));
        panel6.setBackground(new java.awt.Color( 110, 125, 172 ));
        
        

	        //Panel de Salida
		panelDeSalida = new JPanel();
		panelDeSalida.setPreferredSize(new Dimension(400, 400));
		panelDeSalida.setBackground(new java.awt.Color( 110, 125, 172 ));
		ventana.add(panelDeSalida);		
		panelDeSalida.add(panel4);
		panelDeSalida.add(panel5);
		panelDeSalida.add(panel1);
		panelDeSalida.add(panel6);

	        //Panel de Entrada
		panelDeEntrada = new JPanel();
		panelDeEntrada.setPreferredSize(new Dimension(400, 400));
		panelDeEntrada.setBackground(new java.awt.Color( 110, 125, 172 ));
	    ventana.add(panelDeEntrada);
	    panelDeEntrada.add(panel2);
	    panelDeEntrada.add(panel3);

	    

	    //Botones
	    

	    botonDeSalir = new JButton("Salir"); 
	    botonDeSalir.addActionListener(this);
		ventana.add(botonDeSalir);

		botonDeBorrar = new JButton("Borrar");
		botonDeBorrar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ev) 
			{
				clearTxtField();
			}
		});
		panel3.add(botonDeBorrar);
		
		botonDeTabla = new JButton ("Tabla");
		botonDeTabla.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				 //Object origen = e.getSource();
				Graphics papel = panel6.getGraphics(); 
			    papel.setColor(Color.black);
			    papel.drawLine(0, 60, 500, 40);

	       	      Font encabezado =new Font("Times New Roman",1,10);

	       		papel.setFont(encabezado);

	       		papel.drawString("Indice de Masa Corporal", 75, 20);

	       		//Categoria en la cual entra el paciente debido a su indice de masa corporal

	       		papel.drawString("Categoria",40, 60);

	       		papel.drawString("Peso Insuficiente", 40, 80);

	       		papel.drawString("Peso Normal",40 , 100);

	       		papel.drawString("Sobrepeso Grado I", 40, 120);

	       		papel.drawString("Sobrepeso Grado II", 40, 140);

	       		papel.drawString("Obesidad tipo I", 40, 160);

	       		papel.drawString("Obesidad tipo II", 40, 180);

	       		papel.drawString("Obesidad tipo III", 40, 200);

	       		papel.drawString("Obesidad tipo IV", 40, 220);

	            //Imc

	       		papel.drawString("IMC",160, 60);

	       		papel.drawString("<18.5", 160, 80);

	       		papel.drawString("≥18.5 ≤24.9  ",160 , 100);

	       		papel.drawString("≥25   ≤26.9", 160, 120);

	       		papel.drawString("≥27   ≤29.9", 160, 140);

	       		papel.drawString("≥30   ≤34.9", 160, 160);

	       		papel.drawString("≥35   ≤39.9", 160, 180);

	       		papel.drawString("≥40   ≤49.9", 160, 200);

	       		papel.drawString(">50", 160, 220);
			}			
		});
		
		ventana.add(botonDeTabla);

	    }
				
	    public void actionPerformed(ActionEvent event) {
	    Object evento = event.getSource();
		    nombre = texto1.getText();
		    peso = texto2.getText();
	        estatura = texto3.getText();
	        


	    if (evento == botonDeSalir){
	        System.exit(0);
	    } 

	    //Condiconal del metodo de validacion
	    
	    if (isNumerico(peso, estatura)){
			
	      if (evento == botonDeAccion){
							    
	        double a = Double.parseDouble(peso);
	        double a1 = Double.parseDouble(estatura);
	        total = a/((a1)*(a1));
	        if (total >= 0 && total <= 5){
	        	salida2.setText("DelgadezIII");
	        }
	        if (total >= 5 && total <= 10){
	        	salida2.setText("DelgadezII");
	        }
	        if (total >= 10 && total <= 18.5){
	        	salida2.setText("DelgadezI");
	        }
	        if (total >= 18.5 && total <= 24.9){
	        	salida2.setText("Peso Normal");
	        }
	        if (total >= 25 && total <= 29.9){
	        	salida2.setText("Sobrepeso");
	        }
	        if (total >= 30 && total <= 34.9){
	        	salida2.setText("ObesidadI");
	        }
	        if (total >= 35 && total <= 39.9){
	        	salida2.setText("ObesidadII");
	        }
	        if (total >= 40){
	        	salida2.setText("ObesidadIII");
	        }
	        String imc = String.valueOf(total);
	        salida1.setText(imc);
	        salida3.setText(nombre);	         
	      }
		}	    
		
	    }
      //metodos
	  public static Boolean isNumerico(String peso, String estatura){
	  	try {
      	double a = Double.parseDouble(peso);
      	double a1 = Double.parseDouble(estatura);
      	if (a <= 0 && a1 <= 0){
      		return true;      		
      	}
      }
        catch(NumberFormatException nfe){
        	JOptionPane.showMessageDialog(null, "El peso o la altura no son numeros");
      	    return false;
        }
        return true;
      }

      public void clearTxtField() {      
		texto1.setText("");
		texto2.setText("");
		texto3.setText("");
	}


}