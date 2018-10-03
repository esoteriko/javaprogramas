/*Bibliotecas*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Ejemplo extends JFrame 
    implements ActionListener {

    //Variables
    private JButton botonDeAccion,botonDeSalir;
    private JPanel panelDeSalida,panelDeEntrada;
    private JTextField texto1, texto2,texto3, texto1A,texto2A; 
    private JLabel etiqueta1,etiqueta2,etiqueta3, etiqueta1A, etiqueta2A;
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
	panelDeSalida.setPreferredSize(new Dimension(400, 400));
	panelDeSalida.setBackground(new java.awt.Color( 110, 125, 172 ));
	ventana.add(panelDeSalida);

    etiqueta1A = new JLabel("IMC:");
    panelDeSalida.add(etiqueta1A);

    texto1A = new JTextField(10);
    panelDeSalida.add(texto1A);
    
    etiqueta2A = new JLabel("Peso a bajar");
    panelDeSalida.add(etiqueta2A);

    texto2A = new JTextField(10);
    panelDeSalida.add(texto2A);

    /*gl1 = new GridLayout(8,2);
    gl1.setHgap(100); gl1.setVgap(10);
    panel1.setLayout(gl1);*/

        //Panel 2
	panelDeEntrada = new JPanel();
	panelDeEntrada.setPreferredSize(new Dimension(400, 400));
	panelDeEntrada.setBackground(new java.awt.Color( 110, 125, 172 ));
    ventana.add(panelDeEntrada);

    /*layout
    gl = new GridLayout(3,2);
    gl.setHgap(10); gl.setVgap(150);
        //panel2.setLayout(gl);*/

    etiqueta1 = new JLabel("Peso: ");
	panelDeEntrada.add(etiqueta1);

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
        double a2 = Double.paseDouble(edad);
        total = a/((a1)*(a1));
        String imc = String.valueOf(total);
        
        texto1A.setText(imc);
        if(a2 => 15 && total <= 18){
            
        }
    }
    if (evento == botonDeSalir){
        System.exit(0);
    } 	
    }
}
