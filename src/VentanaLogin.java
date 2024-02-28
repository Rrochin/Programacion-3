import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaLogin extends JFrame {

	public VentanaLogin() {
		
		this.setVisible (true);
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Ventana");
		//this.setMinimumSize(new Dimension(250,250));
		//this.setMaximumSize(new Dimension(750,750));
		this.setOpacity(1);
		this.setResizable(true);
		this.setLocation(200,200);
		//this.setLocationRelativeTo(null);
		
		this.iniciarComponentes();

		
		}
	
	public void iniciarComponentes() {
		


		JPanel login = new JPanel();
		login.setBackground(Color.pink);
		login.setLayout(null);
		

		
		JLabel login_tag = new JLabel("Acceder", 0);
		login_tag.setSize(200,30);
		login_tag.setFont(new Font("Roboto", Font.BOLD, 20));
		login_tag.setLocation(150,310);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.white);
		login.add(login_tag);
		
		JLabel user_tag3 = new JLabel("Mi cuenta");
		user_tag3.setBounds(180,20,400,40);
		user_tag3.setFont(new Font("Roboto", Font.BOLD, 30));
		user_tag3.setForeground(Color.white);
		login.add(user_tag3);
		
		JLabel user_tag2 = new JLabel("Inicio de sesión");
		user_tag2.setBounds(150,80,400,40);
		user_tag2.setFont(new Font("Roboto", Font.BOLD, 25));
		user_tag2.setForeground(Color.black);
		login.add(user_tag2);
		
	
		JLabel user_tag = new JLabel("Nombre de usuario: ");
		user_tag.setBounds(100,120,200,40);
		user_tag.setFont(new Font("Arial", Font.BOLD, 15));
		login.add(user_tag);
		
		JTextField usr_field = new JTextField();
		usr_field.setBounds(100, 155, 300, 40);
		login.add(usr_field);
		
		//contraseña
		JLabel pwd_tag = new JLabel("Contraseña: ");
		pwd_tag.setBounds(100,195,200,40);
		pwd_tag.setFont(new Font("Arial", Font.BOLD, 15));
		login.add(pwd_tag);
		
		JPasswordField pwd_field = new JPasswordField();
		pwd_field.setBounds(100, 225, 300, 40);
		login.add(pwd_field);
		
		JCheckBox remember = new JCheckBox("Recordarme");
		remember.setBounds(100, 265, 150, 40);
		remember.setOpaque(false);
		login.add(remember);
		
		JLabel cuenta = new JLabel("No tienes cuenta?");
		cuenta.setBounds(180,350,300,40);
		cuenta.setFont(new Font("Arial", Font.BOLD, 15));
		login.add(cuenta);
		
		JLabel registro = new JLabel("Registrate", 0);
		registro.setSize(200,30);
		registro.setFont(new Font("Roboto", Font.BOLD, 20));
		registro.setLocation(150,385);
		registro.setOpaque(true);
		registro.setBackground(Color.white);
		login.add(registro);
		
		//imagenes
		JLabel logo = new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("candado1.png")));
		logo.setBounds(65,195,100,100);
		login.add(logo);
		
		JLabel logo2 = new JLabel();
		logo2.setIcon(new ImageIcon(getClass().getResource("user.png")));
		logo2.setBounds(60,120,100,100);
		login.add(logo2);
		
		//panel trasero
		JPanel login2 = new JPanel();
		login2.setBackground(Color.LIGHT_GRAY);
		login2.setBounds(60, 75, 380, 280);
		login2.setLayout(null);
		login.add(login2);	
		
		this.add(login);

	}
	
}