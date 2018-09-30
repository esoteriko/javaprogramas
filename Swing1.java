import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Swing1 extends JFrame implements ActionListener{
	public static void main(String[] args) {
		JFrame ventanita = new JFrame("Soy un titulo");
		ventanita.setSize(400, 300);
  		ventanita.crearPa();
		//ventanita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanita.setVisible(true);
	}

private void crearPa(){
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar"); 
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
}

}