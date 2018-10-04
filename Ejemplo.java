
	/*Bibliotecas*/
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;



	public class Ejemplo extends JFrame 
	    implements ActionListener {

	    //Variables
	    private JButton botonDeAccion,botonDeSalir;
	    private JPanel panelDeSalida,panelDeEntrada;
	    private JTextField texto1, texto2,texto3, boton1, boton3; 
	    private JLabel etiqueta1,etiqueta2,etiqueta3, etiqueta1A, etiqueta2A,salida1, salida2, salida3,boton,boton2;
	    private GridLayout gl,gl1;
	    private String peso,estatura,edad;
	    private Double total;
        
	    
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
		panelDeSalida = new JPanel();
		panelDeSalida.setPreferredSize(new Dimension(350, 50));
		panelDeSalida.setBackground(new java.awt.Color( 110, 125, 172 ));
		
        gl1 = new GridLayout(2,2);
        panelDeSalida.setLayout(gl1);
        gl1.setHgap(0); gl1.setVgap(5);


        boton = new JLabel("Hola");
        boton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelDeSalida.add(boton);

        boton1 = new JTextField();
        boton1.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelDeSalida.add(boton1);

        boton2 = new JLabel("3");
        boton2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelDeSalida.add(boton2);

        boton3 = new JTextField();
        boton3.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelDeSalida.add(boton3);


	    //etiqueta1A = new JLabel("IMC:");
	    //panelDeSalida.add(etiqueta1A);

	    //salida1 = new JLabel();
	    //panelDeSalida.add(salida1);
	    
//etiqueta2A = new JLabel("Estado:");
	    //panelDeSalida.add(etiqueta2A);

	    //salida2 = new JLabel();
	    //panelDeSalida.add(salida2);
	    
	    //salida3 = new JLabel();
	    //panelDeSalida.add(salida3);
	    
	   
	    

	    /*gl1 = new GridLayout(8,2);
	    gl1.setHgap(100); gl1.setVgap(10);
	    panel1.setLayout(gl1);*/

	        //Panel 2
		panelDeEntrada = new JPanel();
		panelDeEntrada.setPreferredSize(new Dimension(400, 400));
		panelDeEntrada.setBackground(new java.awt.Color( 110, 125, 172 ));
        panelDeEntrada.add(panelDeSalida);
	    ventana.add(panelDeEntrada);

	    /*layout
	    gl = new GridLayout(3,2);
	    gl.setHgap(10); gl.setVgap(150);
	        //panel2.setLayout(gl);*/

	    etiqueta1 = new JLabel("Peso: ");
		panelDeEntrada.add(etiqueta1,BorderLayout.CENTER);

		texto1 = new JTextField(10);
	    panelDeEntrada.add(texto1);

		etiqueta2 = new JLabel("Estatura: ");
		panelDeEntrada.add(etiqueta2);

		texto2 = new JTextField(10);
		panelDeEntrada.add(texto2);

	    etiqueta3 = new JLabel("Edad");
	    panelDeEntrada.add(etiqueta3);
	    
	    texto3 = new JTextField(10);
	    panelDeEntrada.add(texto3);

		//etiqueta3 = new JLabel("Talla: ");
		//panel2.add(etiqueta3);

		//texto2 = new JTextField(10);
		//panel2.add(texto2);

	    botonDeAccion = new JButton("Calcular");
	    botonDeAccion.addActionListener(this);
	    panelDeEntrada.add(botonDeAccion);


	    //Botones
	    

	    botonDeSalir = new JButton("Salir"); 
	    botonDeSalir.addActionListener(this);
		ventana.add(botonDeSalir);
	    }

	    public void actionPerformed(ActionEvent event) {
	    Object evento = event.getSource();
	    if (evento == botonDeAccion){

	        peso = texto1.getText();
	        estatura = texto2.getText();
	        edad = texto3.getText();

	        double a = Double.parseDouble(peso);
	        double a1 = Double.parseDouble(estatura);
	        double a2 = Double.parseDouble(edad);

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
	       
	    }
	    if (evento == botonDeSalir){
	        System.exit(0);
	    } 	
	    }
	}