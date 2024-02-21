import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Login extends JFrame{

	//constructor que define atributos de la ventana
	public Login() {
		
		this.setTitle("asd");
		this.setVisible (true);
		this.setSize(800,750);
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
		
		//panel derecho
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth(), this.getHeight());
		registro.setLocation(100,0);
		registro.setBackground(Color.LIGHT_GRAY);
		registro.setLayout(null);
		
		//otro panel derecho
		JLabel usr_tag = new JLabel("Nombre de usuario: ");
		usr_tag.setBounds(500,500,500,500);
		usr_tag.setFont(new Font("Arial", Font.BOLD, 15));
		usr_tag.setOpaque(true);
		usr_tag.setBackground(Color.white);
		registro.add(usr_tag);
		
		
		JLabel user_field = new JLabel();
		user_field.setBounds(50,160,400,40);
		user_field.setHorizontalAlignment(0);
		user_field.setFont(new Font("Roboto", Font.PLAIN, 17));
		registro.add(user_field);
		
		
		JLabel bio_tag = new JLabel("BIO",0);
		bio_tag.setBounds(50,200,400,40);
		bio_tag.setFont(new Font("Roboto", Font.PLAIN, 17));
		registro.add(bio_tag);
		
		
		JTextArea bio_tex = new JTextArea();
		bio_tex.setBounds(20,155,200,40);
		bio_tex.setFont(new Font("Roboto", Font.PLAIN, 17));
		registro.add(bio_tex);
		

		JCheckBox item_box_1 = new JCheckBox("Dulces");
		item_box_1.setBounds(50,325,80,40);
		item_box_1.setFont(new Font("Arial", Font.BOLD, 15));
		item_box_1.setOpaque(true);
		item_box_1.setBackground(Color.red);
		registro.add(item_box_1);
		
		JCheckBox item_box_2 = new JCheckBox("Salado");
		item_box_2.setBounds(50,325,80,40);
		item_box_2.setFont(new Font("Arial", Font.BOLD, 15));
		item_box_2.setOpaque(true);
		item_box_2.setBackground(Color.red);
		registro.add(item_box_2);
		
		JCheckBox item_box_3 = new JCheckBox("Saludable");
		item_box_3.setBounds(50,325,80,40);
		item_box_3.setFont(new Font("Arial", Font.BOLD, 15));
		item_box_3.setOpaque(true);
		item_box_3.setBackground(Color.red);
		item_box_3.setBorderPainted(true);
		item_box_3.setBorder(BorderFactory.createLineBorder(Color.red,2));
		registro.add(item_box_1);
		
		JLabel terms_tag = new JLabel("Terminos");
		terms_tag.setBounds(50,325,400,40);
		terms_tag.setFont(new Font("Arial", Font.BOLD, 15));
		registro.add(terms_tag);
		
		JRadioButton accept_radio = new JRadioButton("Acepto los terminos");
		accept_radio.setBounds(50,325,80,40);
		accept_radio.setFont(new Font("Roboto", Font.PLAIN, 17));
		registro.add(accept_radio);
		
		JRadioButton reject_radio = new JRadioButton("No acepto los terminos");
		reject_radio.setBounds(50,325,80,40);
		reject_radio.setFont(new Font("Roboto", Font.PLAIN, 17));
		registro.add(reject_radio);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(accept_radio);
		terms.add(reject_radio);
		
		String colonias[]= {"centro","camino real"};
		
		//JComboBox locations = new JComboBox();
		
		
		
		this.add(registro);
		
		this.repaint();
		this.validate();	
		
	}
	
		public void login() {
			
		
		//panel izquierdo
		JPanel Login = new JPanel();
		Login.setSize(this.getWidth()/2, this.getHeight());
		Login.setBackground(Color.pink);
		Login.setLayout(null);
		
		//boton de acceder
		JLabel login_tag = new JLabel("Acceder", 0);
		login_tag.setSize(160,30);
		login_tag.setFont(new Font("Roboto", Font.BOLD, 20));
		login_tag.setLocation(100,100);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.white);
		Login.add(login_tag);
	

		//usuario izq
		JLabel user_tag = new JLabel("Nombre de usuario: ");
		user_tag.setBounds(20,155,200,40);
		user_tag.setFont(new Font("Arial", Font.BOLD, 15));
		Login.add(user_tag);
		
		JTextField usr_field = new JTextField();
		usr_field.setBounds(20, 190, 300, 40);
		Login.add(usr_field);
		
		//contraseña
		JLabel pwd_tag = new JLabel("Contraseña: ");
		pwd_tag.setBounds(20,230,200,40);
		pwd_tag.setFont(new Font("Arial", Font.BOLD, 15));
		Login.add(pwd_tag);
		
		JPasswordField pwd_field = new JPasswordField();
		pwd_field.setBounds(20, 260, 300, 40);
		Login.add(pwd_field);
		
		JCheckBox remember = new JCheckBox("Recordarme");
		remember.setBounds(20, 300, 150, 40);
		remember.setOpaque(false);
		Login.add(remember);
		
		JLabel prefer_tag = new JLabel("Nombre de usuario: ");
		prefer_tag.setBounds(50,325,400,40);
		prefer_tag.setFont(new Font("Arial", Font.BOLD, 15));
		Login.add(prefer_tag);
		
		this.add(Login);
		
		}
	

	}	
		
		
		
		
	