import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import java.awt.Color;

public class nominaBin extends JFrame {

	private JPanel contentPane;
	private JTextField caja1;
	private JTextField caja2;
	private JLabel label2;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nominaBin frame = new nominaBin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public nominaBin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 450);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.focus"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Numero Decimal");
		label1.setBounds(28, 27, 114, 15);
		contentPane.add(label1);
		
		JButton boton1 = new JButton("Convertir");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton1.setBounds(419, 22, 117, 25);
		contentPane.add(boton1);
		
		caja1 = new JTextField();
		caja1.setBounds(152, 22, 114, 24);
		contentPane.add(caja1);
		caja1.setColumns(10);
		
		caja2 = new JTextField();
		caja2.setBounds(278, 22, 114, 25);
		contentPane.add(caja2);
		caja2.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		panel.setBounds(28, 83, 489, 292);
		contentPane.add(panel);
		panel.setLayout(null);
		
		label2 = new JLabel("Sueldo      $");
		label2.setBounds(12, 22, 83, 24);
		panel.add(label2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(97, 24, 114, 22);
		textField_2.setText("00000.00");
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRecibo = new JLabel("Recibo");
		lblRecibo.setBounds(200, 92, 70, 15);
		panel.add(lblRecibo);
		
		table = new JTable();
		table.setBackground(new Color(240, 255, 255));
		table.setBorder(new CompoundBorder());
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"IMPUESTO", null},
				{"SEGURO", null},
				{"COMEDOR", null},
				{"TRANSPORTE", null},
				{"VALES", null},
				{"TOTAL", null},
			},
			new String[] {
				"", "VARIABLES"
			}
		));
		table.setBounds(67, 114, 309, 96);
		panel.add(table);
		
		JButton boton3 = new JButton("Calcular");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton3.setBounds(297, 22, 117, 25);
		panel.add(boton3);
	}
}
