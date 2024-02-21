import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame{

	//constructor que define atributos de la ventana
	public Login() {
		
		this.setTitle("asd");
		this.setVisible (true);
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana");
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(750,750));
		this.setOpacity(1);
		this.setResizable(true);
		this.setLocation(200,200);
		this.setLocationRelativeTo(null);
		
		this.iniciarComponentes();
	
	}
	
	public void iniciarComponentes() {
		
		//panel izquierdo
		JPanel Login = new JPanel();
		Login.setSize(this.getWidth()/2, this.getHeight());
		Login.setBackground(Color.pink);
		Login.setLayout(null);
		
		//boton de acceder
		JLabel login_tag = new JLabel("Acceder", 0);
		login_tag.setSize(160,30);
		login_tag.setFont(new Font("Roboto", Font.BOLD, 20));
		login_tag.setLocation(315,350);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.white);
		Login.add(login_tag);
	
		//panel derecho
		//JPanel registro = new JPanel();
		//registro.setSize(this.getWidth(), this.getHeight());
		//registro.setLocation(500,0);
		//registro.setBackground(Color.LIGHT_GRAY);

		//usuario
		JLabel user_tag = new JLabel("Nombre de usuario: ");
		user_tag.setBounds(250,155,200,40);
		user_tag.setFont(new Font("Arial", Font.BOLD, 15));
		Login.add(user_tag);
		
		JTextField usr_field = new JTextField();
		usr_field.setBounds(250, 190, 300, 40);
		Login.add(usr_field);
		
		//contraseña
		JLabel pwd_tag = new JLabel("Contraseña: ");
		pwd_tag.setBounds(250,230,200,40);
		pwd_tag.setFont(new Font("Arial", Font.BOLD, 15));
		Login.add(pwd_tag);
		
		JPasswordField pwd_field = new JPasswordField();
		pwd_field.setBounds(250, 260, 300, 40);
		Login.add(pwd_field);
		
		JCheckBox remember = new JCheckBox("Recordarme");
		remember.setBounds(250, 300, 150, 40);
		remember.setOpaque(false);
		Login.add(remember);
		
		
		
		this.add(Login);
		//this.add(registro);	
		
		}
	}