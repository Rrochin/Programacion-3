import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;

public class prueba {

	private JFrame frame;
	private JTextField txtRaquel;
	private JTextField txtRochn;
	private JTextField txtGmez;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba window = new prueba();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(new Color(255, 0, 128));
		frame.setBounds(100, 100, 530, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 276, 221);
		panel.setBackground(new Color(255, 128, 128));
		panel.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtRaquel = new JTextField();
		txtRaquel.setFont(new Font("Arial", Font.PLAIN, 13));
		txtRaquel.setText("Raquel");
		txtRaquel.setBounds(139, 22, 96, 19);
		panel.add(txtRaquel);
		txtRaquel.setColumns(10);
		
		txtRochn = new JTextField();
		txtRochn.setText("Rochín");
		txtRochn.setFont(new Font("Arial", Font.PLAIN, 13));
		txtRochn.setColumns(10);
		txtRochn.setBounds(139, 51, 96, 19);
		panel.add(txtRochn);
		
		txtGmez = new JTextField();
		txtGmez.setText("Gómez");
		txtGmez.setFont(new Font("Arial", Font.PLAIN, 13));
		txtGmez.setColumns(10);
		txtGmez.setBounds(139, 80, 96, 19);
		panel.add(txtGmez);
		
		textField = new JTextField();
		textField.setText("13/09/1996");
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(139, 109, 96, 19);
		panel.add(textField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setBounds(139, 134, 103, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setOpaque(false);
		rdbtnFemenino.setBounds(139, 157, 103, 21);
		panel.add(rdbtnFemenino);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(138, 184, 97, 21);
		panel.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Datos generales");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 3, 113, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(0, 0, 0));
		lblNombre.setFont(new Font("Arial", Font.BOLD, 12));
		lblNombre.setBounds(10, 26, 113, 13);
		panel.add(lblNombre);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido paterno:");
		lblApellidoPaterno.setForeground(Color.BLACK);
		lblApellidoPaterno.setFont(new Font("Arial", Font.BOLD, 12));
		lblApellidoPaterno.setBounds(10, 55, 113, 13);
		panel.add(lblApellidoPaterno);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido materno:");
		lblApellidoMaterno.setForeground(Color.BLACK);
		lblApellidoMaterno.setFont(new Font("Arial", Font.BOLD, 12));
		lblApellidoMaterno.setBounds(10, 84, 113, 13);
		panel.add(lblApellidoMaterno);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setForeground(Color.BLACK);
		lblFechaDeNacimiento.setFont(new Font("Arial", Font.BOLD, 12));
		lblFechaDeNacimiento.setBounds(10, 113, 129, 13);
		panel.add(lblFechaDeNacimiento);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setForeground(Color.BLACK);
		lblSexo.setFont(new Font("Arial", Font.BOLD, 12));
		lblSexo.setBounds(10, 138, 113, 13);
		panel.add(lblSexo);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setForeground(Color.BLACK);
		lblNacionalidad.setFont(new Font("Arial", Font.BOLD, 12));
		lblNacionalidad.setBounds(10, 188, 113, 13);
		panel.add(lblNacionalidad);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(296, 10, 210, 221);
		panel_1.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPerfilDeUsuario = new JLabel("Perfil de usuario");
		lblPerfilDeUsuario.setForeground(new Color(0, 0, 0));
		lblPerfilDeUsuario.setFont(new Font("Arial", Font.BOLD, 12));
		lblPerfilDeUsuario.setBounds(10, 3, 113, 13);
		panel_1.add(lblPerfilDeUsuario);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBounds(10, 166, 174, 21);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrarFechaDe = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxMostrarFechaDe.setOpaque(false);
		chckbxMostrarFechaDe.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxMostrarFechaDe.setBounds(10, 188, 181, 21);
		panel_1.add(chckbxMostrarFechaDe);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Tequila\\Downloads\\perfil (2).png"));
		lblNewLabel_1.setBounds(8, 11, 186, 159);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 241, 276, 158);
		panel_2.setBackground(new Color(128, 128, 128));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblOtrosDatos = new JLabel("Otros datos");
		lblOtrosDatos.setForeground(Color.WHITE);
		lblOtrosDatos.setFont(new Font("Arial", Font.BOLD, 12));
		lblOtrosDatos.setBounds(2, 3, 113, 13);
		panel_2.add(lblOtrosDatos);
		
		JLabel lblDescripcin = new JLabel("Descripción:");
		lblDescripcin.setForeground(Color.WHITE);
		lblDescripcin.setFont(new Font("Arial", Font.BOLD, 12));
		lblDescripcin.setBounds(38, 38, 113, 13);
		panel_2.add(lblDescripcin);
		
		JLabel lblOtrosDatos_1_1 = new JLabel("Preferencias:");
		lblOtrosDatos_1_1.setForeground(Color.WHITE);
		lblOtrosDatos_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblOtrosDatos_1_1.setBounds(167, 38, 76, 13);
		panel_2.add(lblOtrosDatos_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 61, 123, 87);
		panel_2.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(143, 61, 123, 87);
		panel_2.add(scrollPane_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setForeground(new Color(255, 255, 255));
		panel_2_1.setBounds(296, 241, 210, 158);
		panel_2_1.setBackground(new Color(255, 174, 174));
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(58, 20, 90, 23);
		btnNewButton.setBackground(new Color(186, 255, 130));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		panel_2_1.add(btnNewButton);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(new Color(0, 0, 0));
		btnGuardar.setFont(new Font("Arial", Font.BOLD, 12));
		btnGuardar.setBackground(new Color(255, 255, 128));
		btnGuardar.setBounds(58, 63, 90, 23);
		panel_2_1.add(btnGuardar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setFont(new Font("Arial", Font.BOLD, 12));
		btnSalir.setBackground(new Color(255, 0, 0));
		btnSalir.setBounds(58, 103, 90, 23);
		panel_2_1.add(btnSalir);
	}
}
