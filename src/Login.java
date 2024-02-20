
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
		this.setSize(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana");
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(750,750));
		this.setResizable(true);
		this.setLocation(200,200);
		this.setLocationRelativeTo(null);
		
		this.iniciarComponentes();
	
	}
	
	public void iniciarComponentes() {
		
		//panel izquierdo
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setBackground(Color.red);
		login.setLayout(null);
		
		//panel derecho
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setLocation(500,0);
		registro.setBackground(Color.green);
		
		//boton de acceder
		JLabel login_tag = new JLabel("Acceder, 0");
		login_tag.setSize(300,80);
		login_tag.setFont(new Font("Arial", Font.BOLD, 40));
		login_tag.setLocation(200,20);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.red);
		login.add(login_tag);
	
		//usuario
		JLabel user_tag = new JLabel("Nombre de usuario: ");
		user_tag.setBounds(10,120,200,40);
		login_tag.setFont(new Font("Arial", Font.BOLD, 20));
		login.add(user_tag);
		
		JTextField usr_field = new JTextField();
		usr_field.setBounds(10, 160, 300, 40);
		login.add(usr_field);
		
		//contraseña
		//JLabel usr_field = new JLabel("Nombre de usuario: ");
		//user_tag.setBounds(10,120,200,40);
		//login_tag.setFont(new Font("Arial", Font.BOLD, 20));
		//login.add(user_tag);
		
		//JPasswordField pwd_field = new JPasswordField();
		//pwd_field.setBounds(10, 260, 300, 40);
		//login.add(pwd_field);
		
		//JCheckBox remember = new JCheckbox("Recordarme");
		//remember.setBounds(10, 300, 150, 40);
		//login.add(remember);
		
		
		
		
		
		this.add(login);
		this.add(registro);	
		
		}
	}