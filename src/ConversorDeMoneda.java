import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import java.awt.Color;


@SuppressWarnings("unused")
public class ConversorDeMoneda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField valor;
	private JComboBox<Object> opciones;
	private JButton botonConvertir;
	private JLabel resultado;
	private JButton botonSalir;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDeMoneda frame = new ConversorDeMoneda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public ConversorDeMoneda() {
		setTitle("Conversor ONE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor Moneda");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(127, 0, 218, 31);
		contentPane.add(lblNewLabel);
		
		opciones = new JComboBox<Object>();
		opciones.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		opciones.setModel(new DefaultComboBoxModel<Object>(new String[] {"Pesos a Dolares", "Dolares a Pesos", "Pesos a Euros", "Euros a Pesos", "Pesos a Libras ", "Libras a Pesos", "Pesos a Yen", "Yen a Pesos", "Won a Pesos", "Pesos a Won"}));
		opciones.setBounds(10, 43, 198, 31);
		contentPane.add(opciones);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese un Monto");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(10, 123, 198, 34);
		contentPane.add(lblNewLabel_1);
		
		valor = new JTextField();
		valor.setBackground(new Color(215, 215, 215));
		valor.setBounds(10, 85, 198, 32);
		contentPane.add(valor);
		valor.setColumns(10);
		
		botonConvertir = new JButton("Convertir");
		botonConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor2 = valor.getText();
				double valorNum = Double.parseDouble(valor2);
				
				DecimalFormat formatear = new DecimalFormat("0.00");
				
				
				double tipoCambioDolar = 4217.50;
				double tipoCambioEuro = 4413.04;
				double tipoCambioLibra = 5091.62;
				double tipoCambioYen = 28.27;
				double tipoCambioWon = 3.10;
				
				double resultadoFinal = 0;
				
				
				if(opciones.getSelectedIndex()==0) {
					resultadoFinal = (valorNum/tipoCambioDolar);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));
					
				}else if(opciones.getSelectedIndex()==1) {
					resultadoFinal = (valorNum*tipoCambioDolar);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));
					
				}else if(opciones.getSelectedIndex()==2) {
					resultadoFinal = (valorNum/tipoCambioEuro);
					
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));
					
				}else if(opciones.getSelectedIndex()==3) {
					resultadoFinal = (valorNum*tipoCambioEuro);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));
					
				}else if(opciones.getSelectedIndex()==4) {
					resultadoFinal = (valorNum/tipoCambioLibra);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));
					
				}else if(opciones.getSelectedIndex()==5) {
					resultadoFinal = (valorNum*tipoCambioLibra);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));
					
				}else if(opciones.getSelectedIndex()==6) {
					resultadoFinal = (valorNum/tipoCambioYen);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));
					
				}else if(opciones.getSelectedIndex()==7) {
					resultadoFinal = (valorNum*tipoCambioYen);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));
					
				}else if(opciones.getSelectedIndex()==8) {
					resultadoFinal = (valorNum/tipoCambioWon);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));
					
				}else if(opciones.getSelectedIndex()==9) {
					resultadoFinal = (valorNum*tipoCambioWon);
					resultado.setText("Resultado: " + formatear.format(resultadoFinal));
				}									
				
			}
		});
		botonConvertir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		botonConvertir.setBounds(10, 168, 198, 28);
		contentPane.add(botonConvertir);
		
		botonSalir = new JButton("Salir");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		botonSalir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		botonSalir.setBounds(256, 227, 89, 23);
		contentPane.add(botonSalir);
		
		resultado = new JLabel("0");
		resultado.setForeground(new Color(0, 0, 0));
		resultado.setBackground(new Color(192, 192, 192));
		resultado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		resultado.setBounds(10, 207, 198, 39);
		contentPane.add(resultado);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\Archivos Bodega  D\\PROGRAMACION\\ORACLE-ONE\\CHALLENGER\\ConversorMoneda\\Imagen de WhatsApp 2023-10-03 a las 17.50.35.jpg"));
		lblNewLabel_2.setBounds(0, 0, 434, 272);
		contentPane.add(lblNewLabel_2);
	}
}
