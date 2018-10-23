import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Programa extends JFrame implements ActionListener {

	private JPanel panel1;
	private JButton boton1, boton2;
	private JTextField caja1;
	private JLabel etiqueta1;
	private int a, modulo;
	private String numeroDecimal,binario;
	private GridLayout gl;


	public static void main(String[] args) {
	    	Programa marco = new Programa();
	        marco.setSize(1000, 800);
	        marco.crearUGU();
	        marco.setVisible(true);	     
	    }

	    private void crearUGU(){
	    	setDefaultCloseOperation(EXIT_ON_CLOSE);
	        Container ventana = getContentPane();
	        ventana.setLayout(new FlowLayout() );

             panel1 = new JPanel();
             panel1.setPreferredSize(new Dimension(400,25));
             panel1.setBackground(new java.awt.Color(110,125,172));

             gl = new GridLayout(1,3,0,5);
             panel1.setLayout(gl);

             etiqueta1 = new JLabel("Agrege un numero");
             etiqueta1.setBounds(50, 50, 100, 25);
             panel1.add(etiqueta1);

             caja1 = new JTextField();
             caja1.setPreferredSize( new Dimension( 200, 24 ) );
             //caja1.setBounds(150, 50, 100, 25); 
             panel1.add(caja1);
            

             boton2 = new JButton("Accion");
             boton2.setBounds(50, 100, 200, 30);
             boton2.addActionListener(new ActionListener(){
             	public void actionPerformed(ActionEvent ev)
             	{
             		actionBinary();
             	}
             });
             panel1.add(boton2);

             boton1 = new JButton("Salir");            
             ventana.add(boton1);
             boton1.addActionListener(this);

             ventana.add(panel1);
	    }


    public void actionPerformed(ActionEvent e) {
         Object event = e.getSource();

         if (event == boton1 ){
         	System.exit(0);
         }
    }
//metodo para sacar binario
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