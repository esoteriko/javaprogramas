package formularios;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Formulario {
 
    JFrame frame;
    JPanel paneliz,panelde,panelab,panelar,panelex;
    JLabel nombre,apellidos,telefono,dni;
    JTextField text1,text2,text3,text4;
    JButton boton1,boton2;
          
    private void panelBD(){
         
        frame = new JFrame();
        paneliz  = new JPanel();
        panelde  = new JPanel();
        panelab  = new JPanel();
        panelar  = new JPanel();
        panelex = new JPanel();
        nombre = new JLabel();
        apellidos = new JLabel();
        telefono = new JLabel();
        dni = new JLabel();
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        boton1 = new JButton();
        boton2 = new JButton();
         
        frame.setTitle("Formulario");
        frame.setLayout(new FlowLayout());      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(300,170);
         
        nombre.setText("Nombre");
        apellidos.setText("Apellidos");
        telefono.setText("Telefono");
        dni.setText("DNI");
         
        boton1.setText("Aceptar");
        boton2.setText("Cancelar");
                 
        paneliz.setLayout(new GridLayout(4,0));
        paneliz.add(nombre);
        paneliz.add(apellidos);
        paneliz.add(telefono);
        paneliz.add(dni);
         
        panelde.setLayout(new GridLayout(4,0));
        panelde.add(text1);
        panelde.add(text2);
        panelde.add(text3);
        panelde.add(text4);
         
        panelar.setLayout(new GridLayout(1,1));
        panelar.setPreferredSize(new Dimension(250,100));
        panelar.add(paneliz);
        panelar.add(panelde);
                 
        panelab.setLayout(new FlowLayout());
        panelab.setPreferredSize(new Dimension(200,50));
        panelab.add(boton1);
        panelab.add(boton2);
         
        panelex.setLayout(new GridLayout(2,0));
        panelex.add(panelar);
        panelex.add(panelab);
         
        frame.add(panelex);
    }
     
    public static void main(String[] args) {
 
        Formulario pa = new Formulario();
 
    }
 
}