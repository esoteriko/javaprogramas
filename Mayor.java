import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*; 

public class Mayor extends JFrame
                    implements ChangeListener {

    private JSlider deslizanteRojo;
    private JPanel panel;
    private JSlider deslizanteAzul;
    private JTextField campoTexto;

    public static void main(String[] args) {
        Mayor demo = new Mayor();
        demo.setSize(300,300);
        demo.crearGUI();
        demo.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());

        deslizanteRojo = new JSlider(JSlider.VERTICAL);
        deslizanteRojo.addChangeListener(this);
        ventana.add(deslizanteRojo);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 150));
        panel.setBackground(Color.white);
        ventana.add(panel);

        deslizanteAzul = new JSlider(JSlider.VERTICAL);
        deslizanteAzul.addChangeListener(this);
        ventana.add(deslizanteAzul);

        campoTexto = new JTextField(10);
        ventana.add(campoTexto);
    }

    public void stateChanged(ChangeEvent e) {
        Graphics papel = panel.getGraphics();

        int valorRojo, valorAzul;    
        valorRojo = deslizanteRojo.getValue();    
        valorAzul = deslizanteAzul.getValue();    

        papel.setColor(Color.white);
        papel.fillRect(0, 0, 200, 150);
        papel.setColor(Color.red);   
        papel.fillOval(10, 10, valorRojo, valorRojo);  
        papel.setColor(Color.blue);  
        papel.fillOval(100, 10, valorAzul, valorAzul);    

        if (valorRojo > valorAzul) {
            campoTexto.setText("el rojo es mayor");    
        }    
        else {
            campoTexto.setText("el azul es mayor");    
        }
    }
}
