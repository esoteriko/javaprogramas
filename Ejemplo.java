   import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import java.lang.Math;

	public class Ejemplo extends JFrame 
	    implements ActionListener {

	    //Variables
	    private JButton botonDeAccion,botonDeSalir, botonDeTabla, botonDeBorrar;
	    private JPanel panelDeSalida,panelDeEntrada,panel1, panel2, panel3;
	    private JTextField texto1, texto2,texto3; 
	    private JLabel etiqueta1,etiqueta2,etiqueta3, etiqueta1A, etiqueta2A,salida1, salida2, salida3,salida4,p,p2,p3,p4;
	    private GridLayout gl,gl1, gl2;
	    private String peso,estatura,nombre, pesoBajar;
	    private Double total,a,a1, a2;
	    private Integer numero;
	    
	    
	   
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
        panel1.setPreferredSize(new Dimension(250, 120));
        panel1.setBackground(new java.awt.Color( 110, 125, 172 ));
    
        gl = new GridLayout(4,2,0,20);
        //gl.setHgap(20); gl.setVgap(20);
        panel1.setLayout(gl);

        
       
        p3 = new JLabel("Nombre:");      
        panel1.add(p3);

        salida3 = new JLabel();
        panel1.add(salida3);
       
        p = new JLabel("IMC:");
        panel1.add(p);

        salida1 = new JLabel();
        panel1.add(salida1);

         p2 = new JLabel("Nivel de peso:");
        panel1.add(p2);

        salida2 = new JLabel();
        panel1.add(salida2);

        p4 = new JLabel("Peso ideal");
        panel1.add(p4);

        salida4 = new JLabel();
        panel1.add(salida4);


             //Panel 2
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(250, 50));
        panel2.setBackground(new java.awt.Color(110,125,172));

        gl1 = new GridLayout(2,2);
        
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

	        //Panel de Salida
		panelDeSalida = new JPanel();
		panelDeSalida.setPreferredSize(new Dimension(400, 400));
		panelDeSalida.setBackground(new java.awt.Color( 110, 125, 172 ));
		ventana.add(panelDeSalida);
		Graphics papel1 = panelDeSalida.getGraphics();
		
		

	        //Panel de Entrada
		panelDeEntrada = new JPanel();
		panelDeEntrada.setPreferredSize(new Dimension(400, 400));
		panelDeEntrada.setBackground(new java.awt.Color( 110, 125, 172 ));
	    ventana.add(panelDeEntrada);
	    panelDeEntrada.add(panel2);
	    panelDeEntrada.add(panel3);
	    panelDeEntrada.add(panel1);


	    

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
				Graphics papel = panelDeSalida.getGraphics(); 
			    papel.setColor(Color.black);
			    //papel.drawLine(0, 60, 500, 40);

	       	      Font encabezado =new Font("Arial",1,15);

	       		papel.setFont(encabezado);

	       		papel.drawString("Indice de Masa Corporal", 120, 20);

	       		//Categoria en la cual entra el paciente debido a su indice de masa corporal

	       		papel.drawString("Categoria",40, 60);

	       		papel.drawString("Peso Insuficiente", 40, 100);

	       		papel.drawString("Peso Normal", 40, 140);

	       		papel.drawString("Sobrepeso Grado I", 40, 180);

	       		papel.drawString("Sobrepeso Grado II", 40, 220);

	       		papel.drawString("Obesidad tipo I", 40, 260);

	       		papel.drawString("Obesidad tipo II", 40, 300);

	       		papel.drawString("Obesidad tipo III", 40, 340);

	       		papel.drawString("Obesidad tipo IV", 40, 380);

	            //Imc

	       		papel.drawString("IMC",280, 60);

	       		papel.drawString("<18.5", 280, 100);

	       		papel.drawString("≥18.5 ≤24.9  ", 280, 140);

	       		papel.drawString("≥25   ≤26.9", 280, 180);

	       		papel.drawString("≥27   ≤29.9", 280, 220);

	       		papel.drawString("≥30   ≤34.9", 280, 260);

	       		papel.drawString("≥35   ≤39.9", 280, 300);

	       		papel.drawString("≥40   ≤49.9", 280, 340);

	       		papel.drawString(">50", 280, 380);
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
	            a2 = 19*((a1)*(a1));
	            a2 = a2-a;    
	        	salida2.setText("Delgadez III");
	        	String pesoBajar = String.valueOf(Math.ceil(a2));
	        	salida4.setText(pesoBajar);
	        	p4.setText("Peso a Subir");
	        }
	        if (total >= 5 && total <= 10){
	        	a2 = 19*((a1)*(a1));
	        	a2 = a2-a; 
	        	salida2.setText("Delgadez II");
	        	String pesoBajar = String.valueOf(Math.ceil(a2));
	        	salida4.setText(pesoBajar);
	        	p4.setText("Peso a Subir");
	        }
	        if (total >= 10 && total <= 18.5){
	        	a2 = 19*((a1)*(a1));
	        	a2 = a2-a; 
	        	salida2.setText("Delgadez I");
	        	String pesoBajar = String.valueOf(Math.ceil(a2));
	        	salida4.setText(pesoBajar);
	        	p4.setText("Peso a Subir");
	        }
	        if (total >= 18.5 && total <= 24.9){
	        	salida2.setText("Peso Normal");
	        	salida4.setText("Peso Normal");
	        }
	        if (total >= 25 && total <= 29.9){
	        	a2 = 19*((a1)*(a1));
	        	a2 = a-a2; 
	        	salida2.setText("Sobrepeso");
	        	String pesoBajar = String.valueOf(Math.ceil(a2));
	        	salida4.setText(pesoBajar);
	        	p4.setText("Peso a Bajar");
	        }
	        if (total >= 30 && total <= 34.9){
	        	a2 = 19*((a1)*(a1));
	        	a2 = a-a2;
	        	salida2.setText("Obesidad I");
	        	String pesoBajar = String.valueOf(Math.ceil(a2));
	        	salida4.setText(pesoBajar);
	        	p4.setText("Peso a Bajar");
	        }
	        if (total >= 35 && total <= 39.9){
	        	a2 = 19*((a1)*(a1));
	        	a2 = a-a2;
	        	salida2.setText("Obesidad II");
	        	String pesoBajar = String.valueOf(Math.ceil(a2));
	        	salida4.setText(pesoBajar);
	        	p4.setText("Peso a Bajar");
	        }
	        if (total >= 40){
	        	a2 = 19*((a1)*(a1));
	        	a2 = a-a2;
	        	salida2.setText("Obesidad III");
	        	String pesoBajar = String.valueOf(Math.ceil(a2));
	        	salida4.setText(pesoBajar);
	        	p4.setText("Peso a Bajar");
	        }
	        
	        String imc = String.valueOf(Math.ceil(total));
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
		salida1.setText("");
		salida2.setText("");
		salida3.setText("");
		salida4.setText("");
	}


}