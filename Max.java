// Barra Deslizadora  Manejo Metodos.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*; 

public class Max extends JFrame implements ChangeListener, ActionListener {

    private JSlider deslizante;
    private JTextField campoTexto;
    private JButton boton;

    private int max = 0;

    public static void main(String[] args) {
        Max demo = new Max();
        demo.setSize(200,300);
        demo.crearGUI();
        demo.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        deslizante = new JSlider(JSlider.VERTICAL, 0, 100, 0);
        deslizante.setMajorTickSpacing(10);
        deslizante.setPaintTicks(true);
        deslizante.addChangeListener(this);
        ventana.add(deslizante);

        campoTexto = new JTextField(12);
        ventana.add(campoTexto);

        boton = new JButton("restablecer");
        boton.addActionListener(this);
        ventana.add(boton);
    }

    public void stateChanged(ChangeEvent e) {
        int temp;    
        temp = deslizante.getValue();
        if (temp > max) {
            max = temp;
        }
        mostrar();
    }

    public void actionPerformed(ActionEvent event) {
        campoTexto.setText("");
        max = 0;
    }

    private void mostrar() {
        campoTexto.setText("el valor maximo es " + max);
    }
}
